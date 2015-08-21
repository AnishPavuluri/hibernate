
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class TextSortServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		String textToSort=req.getParameter("ta");
		int pos=Integer.parseInt(req.getParameter("cp"));
		pos=pos-1;
		ArrayList al=new ArrayList();
		String[] c=textToSort.trim().split(",");
		for(String s:c){
			al.add(s);
		}
		Iterator it=al.iterator();
		Iterator it1=al.iterator();
		int i=0,j;
		String s1=null,s2=null,s=null;

		while(it.hasNext()){
			s1=(String)it.next();
			for (j=0;j<=i && it1.hasNext();j++){
				s2=(String)it1.next();
			}
			System.out.println("s2-->"+s2+"----i--"+i+"---j--->"+j);
			System.out.println("lllllllllllllllll");
			while(it1.hasNext()){
				
				s2=(String)it1.next();
				System.out.println("s1----->"+s1);
				if (s1.charAt(pos)>=s2.charAt(pos))	{
					/*al.add(i,s2);
					al.add(j,s1);*/
				}
				
				j++;
			}
			i++;
		}
		out.println("<html><body>");
		out.println("<center><h1>Sorted Result</h1></center>");
		out.println("<center><table border='1'>");
		out.println("<th><td>sno</td><td>text</td>");
		i=1;
		it=al.iterator();
		while (it.hasNext()){
			s=(String)it.next();
			out.println("<tr><td>"+i+"</td><td>"+s+"</td></tr>");	
		}
		out.println("</table></center></body></html>");
	}
}