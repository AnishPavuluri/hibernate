package htmltoPdf;

import java.io.StringReader;
import java.util.List;

import javax.swing.ImageIcon;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.PdfWriter;

public class HtmlToPdfTest {

	public static void main(String[] args) {
		
		Document document = new Document(PageSize.A4, 80, 50, 30, 65);
        try
        {
            //writer - have our own path!!!
            //PdfWriter.GetInstance(document, new FileStream("H:/parsetest.pdf", FileMode.Create));
            document.open();
            //html -text - kan be from database or editor too
            String htmlText = "<font  " +
        " color=\"#0000FF\"><b><i>Title One</i></b></font><font   " +
        " color=\"black\"><br><br>Some text here<br><br><br><font   " +
        " color=\"#0000FF\"><b><i>Another title here   " +
        " </i></b></font><font   " +
        " color=\"black\"><br><br>Text1<br>Text2<br><OL><LI>hi</LI><LI>how are u</LI></OL><h1>Title</h1><img src=\"http://p.ebaystatic.com/aw/pics/ch/logos/logoEbay_x45.gif\" />";

            //make an arraylist ....with STRINGREADER since its no IO reading file...

            StyleSheet s= new StyleSheet();
            System.out.println(Image.AX);
            System.out.println(Image.AY);
            System.out.println(Image.TEXTWRAP);
            
            List<Element> htmlarraylist = HTMLWorker.parseToList(new StringReader(htmlText), null);

            //add the collection to the document
            for (int k = 0; k < htmlarraylist.size(); k++)
            {
               //document.add(htmlarraylist[k]);
            }
            document.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
}
