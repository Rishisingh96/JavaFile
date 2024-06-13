package AWT;
import java.awt.*;

import javax.swing.*;

public class firstawtapp  {
	
	public static void main(String[] args) {
		Frame f  = new Frame();
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		TextField tf = new TextField();
		tf.setBounds(120, 80, 400, 20);
		f.add(tf);
		
		TextField tf1 = new TextField();
		tf1.setBounds(120, 110, 400, 20);
		f.add(tf1);
		
		TextField tf2 = new TextField();
		tf2.setBounds(120, 140, 400, 20);
		f.add(tf2);
		
		TextField tf3 = new TextField();
		tf3.setBounds(120, 170, 400, 20);
		f.add(tf3);
		
		JRadioButton jr = new JRadioButton("Mele");
		jr.setBounds(120, 200, 140, 20);
		f.add(jr);
		
		JRadioButton jr1 = new JRadioButton("Female");
		jr1.setBounds(245, 200, 180, 20);
		f.add(jr1);
		
		Button b = new Button("Reset");
		b.setBounds(120, 500, 200, 20);
		f.add(b);
		
		Button b1 = new Button("Submit");
		b1.setBounds(245, 500, 280, 20);
		f.add(b1);
		
		
	}
}
