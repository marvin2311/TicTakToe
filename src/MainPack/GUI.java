package MainPack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	JFrame fenster;
	Draw zeichenfeld;
	JButton btnReset;
	
	static JButton btn[] = new JButton[9];
	static int[] state = new int[9];
	static int player = 0;
	static int winner = 0;
	
	public GUI() {
		
		fenster = new JFrame();
		fenster.setSize(800, 600);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setLocationRelativeTo(null);
		fenster.setResizable(false);
		
		zeichenfeld = new Draw();
		zeichenfeld.setBounds(0, 0, 800, 600);
		zeichenfeld.setVisible(true);
		fenster.add(zeichenfeld);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(675, 500, 100, 40);
		btnReset.setBackground(Color.BLUE);
		btnReset.setForeground(Color.WHITE);
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Function.reset();	
			}
		});
		btnReset.setVisible(true);
		fenster.add(btnReset);
		
		for (int i = 0; i < btn.length; i++) {
			
			btn[i] = new JButton();
			btn[i].setVisible(true);
			btn[i].addActionListener(new ActionHandler());
			btn[i].setContentAreaFilled(false);
			btn[i].setFocusPainted(false);
			btn[i].setBorder(null);
			fenster.add(btn[i]);
			
		}
		
		ButtonPlacement.place();
		
		fenster.setVisible(true);
	}

}
