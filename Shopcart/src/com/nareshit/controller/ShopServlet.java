package com.nareshit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShopServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=green>");
		String sb = request.getParameter("s");
		HttpSession session = request.getSession();
		Map<String, Product> cart = (Map) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<String, Product>();
			session.setAttribute("cart", cart);
		}
		if (sb.equals("ADD ITEM")) {
			String code = request.getParameter("pcode");
			String qty = request.getParameter("quantity");
		int quantity = Integer.parseInt(qty);
			for(String codeKey : cart.keySet()){
				if(code.equals(codeKey)){
					quantity = quantity +cart.get(codeKey).getQuantity();
				}
			}
			Product p = new Product();
			p.setCode(code);
			p.setQuantity(quantity);
			cart.put(code, p);
			response.sendRedirect("shoppage.html");
		} else if (sb.equals("REMOVE ITEM")) {
			String code = request.getParameter("pcode");
			String qty = request.getParameter("quantity");
			for(String codeKey : cart.keySet()){
				if(code.equals(codeKey) && cart.get(codeKey).getQuantity() > Integer.parseInt(qty)){
					Product product = new Product();
					product.setCode(code);
					product.setQuantity(cart.get(code).getQuantity() - Integer.parseInt(qty));
					cart.remove(code);
					cart.put(codeKey, product);
				}else if (code.equals(codeKey) && cart.get(codeKey).getQuantity() == Integer.parseInt(qty)) {
					cart.remove(code);
				}
			}
			
			response.sendRedirect("shoppage.html");
		} else if (sb.equals("SHOW ITEMS")) {
			Set<String> s = cart.keySet();
			if (!s.isEmpty()) {
				out.println("<h2>Your Shopping Cart Items</h2>");
			} else {
				out.println("<h1>No Itemds Please</h1>");
			}
			for (String code : s) {
				Product p = (Product) cart.get(code);
				out.println("Product code" + p.getCode());
				out.println("Product quantity" + p.getQuantity() + "<br/>");
			}

			out.println("<a href=shoppage.html>More Shopping here</a>");
		} // outer if
		else {
			session.invalidate();
			out
					.println("<a href=shoppage.html>Thank you visit again to shop again</a>");
		}
		out.println("</body></html>");
		out.close();
	}
}