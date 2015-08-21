import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;


public class DownloadAction extends ActionSupport {
	
	private InputStream fileInputStream;
	 
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
	public String execute() throws Exception {
		//F:\Jaga\01 SCJP 1.6 Dumps
	    //fileInputStream = new FileInputStream(new File("D:\\ANISH\\anish\\resume\\anishresume.doc"));
		fileInputStream = new FileInputStream(new File("F:\\Jaga\\01 SCJP 1.6 Dumps\\sampleTest.pdf"));
	    return SUCCESS;
	}

}
