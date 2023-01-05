package LAB2and3;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
	BorderLayoutEx(){
		JFrame f;
		f= new JFrame();
		JButton b1 = new JButton("North Button");
		JButton b2 = new JButton("South Button");
		JButton b3 = new JButton("East Button");
		JButton b4 = new JButton("West Button");
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();		
	}
}
