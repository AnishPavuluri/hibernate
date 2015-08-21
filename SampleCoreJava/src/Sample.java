import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame();
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		f.setSize(200, 200);
		Label l1 = new Label("UserName");
		TextField tf1 = new TextField(10);
		Label l2 = new Label("Password");
		TextField tf2 = new TextField(10);
		Button bt = new Button("login");
		f.add(l1);
		
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(bt);
		f.setVisible(true);

	}

}
