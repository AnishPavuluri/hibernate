package edu.test;

import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;


public class ReadXMLTest {
	private static Document document;
	static{
		SAXBuilder builder=new SAXBuilder();
		try{
			document=builder.build(ReadXMLTest.class.getClassLoader().getResourceAsStream("db-details.xml"));
		}catch (JDOMException e) {
			System.err.println("JDOMException :"+e);
		}catch (IOException e) {
			System.err.println("JDOMException :"+e);
		}
	}
	
	public static void main(String[] args) {
		String env=System.getenv("stu.env");
		Element element=document.getRootElement().getChild(env).getChild("student1");
		String details=element.getAttributeValue("details");
		System.out.println("Details :"+details);

	}

}
