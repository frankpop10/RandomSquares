package TheMainPackage;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class WindowClass extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1991702997380397407L;
	
		public WindowClass(int width, int height, String title, MainClass game){
			JFrame frame = new JFrame(title);
			frame.setPreferredSize(new Dimension(width,height));
			frame.setMaximumSize(new Dimension(width,height));
			frame.setMinimumSize(new Dimension(width,height));
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			
			frame.add(game);
			frame.setVisible(true);
			game.start();
			
		}


}
