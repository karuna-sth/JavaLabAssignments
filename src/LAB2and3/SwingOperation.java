package LAB2and3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingOperation extends JFrame implements ActionListener {
	JLabel l1, l2, l3, p, t, r, res;
	JTextField t1, t2, t3, pi, ti, ri, showRes;
	JButton b1, b2, b3;

	public SwingOperation(){
		l1 = new JLabel("First Number:");
		l1.setBounds(20, 10, 100, 20); 
		t1 = new JTextField(10);
		t1.setBounds(120, 10, 100, 20);
		l2 = new JLabel("Second Number:");
		l2.setBounds(20, 40, 100, 20);
		t2 = new JTextField(10);
		t2.setBounds(120, 40, 100, 20);
		l3 = new JLabel("Result");
		l3.setBounds(20, 70, 80, 20);
		t3 = new JTextField(10);
		t3.setBounds(120, 70, 100, 20);
		b1 = new JButton("Add");
		b1.setBounds(20, 100, 100, 20);
		b2 = new JButton("Multiply");
		b2.setBounds(140, 100, 100, 20);
		p = new JLabel("Principal: ");
		p.setBounds(20, 150, 100, 20);
		pi = new JTextField(10);
		pi.setBounds(120, 150, 100, 20);
		t = new JLabel("Rate(in %): ");
		t.setBounds(20, 180, 100, 20);
		ti = new JTextField(10);
		ti.setBounds(120, 180, 100, 20);
		r = new JLabel("Time: ");
		r.setBounds(20, 210, 100, 20);
		ri = new JTextField(10);
		ri.setBounds(120, 210, 100, 20);
		res = new JLabel("Simple Interest: ");
		res.setBounds(20, 240, 100, 20);
		showRes = new JTextField(10);
		showRes.setBounds(120, 240, 100, 20);
		b3 = new JButton("Calculate SI");
		b3.setBounds(50, 280, 150, 20);
		add(b3);
		add(p);
		add(pi);
		add(t);
		add(ti);
		add(r);
		add(ri);
		add(l1);
		add(t1);
		add(l2);
		add(l3);
		add(t2);
		add(b1);
		add(t3);
		add(b2);
		add(res);
		add(showRes);
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		@Override
	 public void actionPerformed(ActionEvent e){
	    if(e.getSource()==b1){
	        int a = Integer.parseInt(t1.getText()); 
	        int b = Integer.parseInt(t2.getText()); 
	        int sum = a + b;
	        t3.setText(String.valueOf(sum));
	    }
	    if(e.getSource()==b2){
	        int a = Integer.parseInt(t1.getText()); 
	        int b = Integer.parseInt(t2.getText()); 
	        int mul = a * b;
	        t3.setText(String.valueOf(mul));
	    }
	    if(e.getSource()==b3){
	        int p = Integer.parseInt(pi.getText()); 
	        int t = Integer.parseInt(ri.getText());
	        int r = Integer.parseInt(ti.getText());
	        int si = p * t * r / 100;
	        showRes.setText(String.valueOf(si));
	    }
	}
	
	public static void main(String args[]) {
		new SwingOperation();
	}
}