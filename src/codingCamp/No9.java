package codingCamp;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class No9 extends JFrame{
	private JLabel label2[]=new JLabel[10];
	Random rand=new Random();
	private int index=0;
	public No9()
	{
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*350);
			int y=(int)(Math.random()*350);
			label2[i]=new JLabel(Integer.toString(i+1));
			label2[i].setBounds(x, y, 15, 15);
			label2[i].setSize(15,15);
			c.add(label2[i]);
			label2[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel la=(JLabel)e.getSource();
					if(label2[index].equals(la)) {
						la.setVisible(false);
						index++;
						if(index==10) {
							new No9();
							dispose();
						}
					}
				}
			});
		}
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		No9 fr=new No9();
		
	}

}
