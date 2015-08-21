package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import comparator.myComparator;


public class SortServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String text = request.getParameter("sampleText");
		Integer position = Integer.parseInt(request.getParameter("char"));
		String names[] = StringUtils.split(text, ",");
		Map<String, String> nameMap = new TreeMap<String, String>(new myComparator());
		for(String n : names){
			nameMap.put(n.substring(position-1), n);
		}
		request.setAttribute("map", nameMap);
		request.getRequestDispatcher("results.jsp").forward(request, response);
		
	}

}
