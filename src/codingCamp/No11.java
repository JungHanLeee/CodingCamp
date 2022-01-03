package codingCamp;

import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
public class No11 extends JFrame{
	JLabel l;
	int cnt=0;
	String path;
	File[] filesInDirectory;
	public No11() {
		JButton btn=new JButton("Browse");
		btn.setBounds(150, 310, 100, 40);
		l=new JLabel();
		l.setBounds(10, 10, 365, 290);
		add(btn);
		add(l);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc=new JFileChooser();
				jfc.setCurrentDirectory(new File("C:\\Windows\\Web\\Wallpaper\\Theme1"));
				int returnVal=jfc.showSaveDialog(null);
				if(returnVal==JFileChooser.APPROVE_OPTION) {
					filesInDirectory=jfc.getCurrentDirectory().listFiles();
					File selFile=jfc.getSelectedFile();
					path = selFile.getAbsolutePath();
					
					l.setIcon(resize(path));
				}
			}			
		});
		l.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(filesInDirectory[cnt]);
				cnt++;
				if(cnt>5) {
					cnt=0;
				}
				path=filesInDirectory[cnt].getPath();
				l.setIcon(resize(path));
			}
			
		});
		setLayout(null);
		setLocationRelativeTo(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public ImageIcon resize(String imgPath) {
		ImageIcon path = new ImageIcon(imgPath);
		Image img=path.getImage();
		Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon image=new ImageIcon(newImg);
		return image;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new No11();
	}

}
