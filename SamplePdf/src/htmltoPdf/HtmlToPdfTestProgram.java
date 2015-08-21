package htmltoPdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.HtmlTags;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author ANISH
 *
 */
public class HtmlToPdfTestProgram {
	private StyleSheet styleSheet;
    public static void main(String[] args) throws DocumentException {
    	HtmlToPdfTestProgram h = new HtmlToPdfTestProgram();
    	FontFactory.registerDirectory("src/Fonts");
        System.out.println("---size------->"+FontFactory.getRegisteredFonts().size());
        for(String s1:FontFactory.getRegisteredFonts()){
        	System.out.println(s1);
        }
    	h.covertHtmlToPdf();
    	System.out.println("------SUCCESS---------");
        
    }
    
    public void covertHtmlToPdf(){
    	HtmlToPdfTestProgram h = new HtmlToPdfTestProgram();
        FileReader fr = null;
        PdfWriter writer = null;
        try {
        	String file_name = "src/sample.jsp";
            fr = new FileReader(file_name);
        	Document document = new Document(PageSize.A4, 80, 50, 30, 65);
            PdfWriter.getInstance(document, System.out);
            writer = PdfWriter.getInstance(document, new FileOutputStream("src/sample913.pdf"));
            document.open();
           
            StyleSheet s=new StyleSheet();
            /*To apply CSS here we use StyleSheat*/ 
            s.loadStyle("texttype","face" ,"Trebuchet MS");
            s.loadStyle("texttype", HtmlTags.COLOR, "red");
            s.loadStyle("abc", HtmlTags.VERTICALALIGN, "middle");
            //s.loadStyle("texttype", HtmlTags.WIDTH, "1000");
            h.setStyleSheet(s);
           
            List htmlContentList = (List) HTMLWorker.parseToList(fr, h.getStyleSheet());
            //fetch the html content line by line
            for (int htmlDataCntr = 0; htmlDataCntr < htmlContentList.size(); htmlDataCntr++) {
                Element htmlDataElement = (Element) htmlContentList.get(0);
                	document.add(htmlDataElement);
            }
            
            fr.close();
            document.close();
            System.out.println("SUCCESS");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

	public StyleSheet getStyleSheet() {
		return styleSheet;
	}

	public void setStyleSheet(StyleSheet styleSheet) {
		this.styleSheet = styleSheet;
	}
    
}