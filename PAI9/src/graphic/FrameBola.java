/**
 * PRACTICA 9
 * 
 * Esta practica nos pide hacer una ventana en la que podamos mover una bola
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameBola extends JFrame {
	private PanelBola bola; /** Panel con la bola */
	
	public FrameBola(int d){
		this.setLayout(new GridLayout(2, 1, 5, 5));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bola = new PanelBola(d);
		this.add(bola);
		
		/** Creacion de los botones y el panel que los contendrá */
		JButton botonUp = new JButton("Up");
		JButton botonDown = new JButton("Down");
		JButton botonLeft = new JButton("Left");
		JButton botonRight = new JButton("Right");
		JButton botonCenter = new JButton("Center");
		JPanel botones = new JPanel();
		
		botones.setLayout(new BorderLayout());
		botones.add(botonUp, BorderLayout.NORTH);
		botones.add(botonDown, BorderLayout.SOUTH);
		botones.add(botonLeft, BorderLayout.WEST);
		botones.add(botonRight, BorderLayout.EAST);
		botones.add(botonCenter, BorderLayout.CENTER);
		
		/** Añadimos los listener */
		botonUp.addActionListener(new UpListener());
		botonDown.addActionListener(new DownListener());
		botonLeft.addActionListener(new LeftListener());
		botonRight.addActionListener(new RightListener());
		botonCenter.addActionListener(new CenterListener());
		
		add(botones);
	}
	
	
	/** Setters y getters */
	public PanelBola getBola() {
		return bola;
	}

	public void setBola(PanelBola bola) {
		this.bola = bola;
	}

	
	/** Clases Listener privadas */
	private class UpListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getBola().moveUp();
		}
		
	}
	
	private class DownListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getBola().moveDown();
		}
		
	}
	
	private class LeftListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getBola().moveLeft();
		}
		
	}
	
	private class RightListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getBola().moveRight();
		}
		
	}
	
	private class CenterListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getBola().moveCenter();
		}
		
	}
	
}
