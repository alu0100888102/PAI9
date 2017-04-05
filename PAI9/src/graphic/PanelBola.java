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
import javax.swing.*;

public class PanelBola extends JPanel {
	
	/** Coordeneadas del circulo en el plano*/
	private int xCord;
	private int yCord;
	
	private int desplazamiento; /**Constante de desplazamiento */
	private int BOLA_SIZE = 50; /** Tamaño de la bola */
	
	/** Constructores */
	public PanelBola(){
		this.setBackground(Color.BLUE);
		setxCord(0);
		setyCord(0);
		setDesplazamiento(0);
	}
	
	public PanelBola(int d){
		this.setBackground(Color.BLUE);
		this.moveCenter();
		setDesplazamiento(d);
	}
	
	public PanelBola(int d, int x, int y){
		this.setBackground(Color.BLUE);
		setxCord(x);
		setyCord(y);
		setDesplazamiento(d);
	}
	
	
	/** Getters y setters */
	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public int getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(int desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
	
	
	/** Funciones para desplazar la bola. Comprueban que no se salga */
	public void moveRight(){
		if((getxCord() + BOLA_SIZE + getDesplazamiento()) >=this.getWidth())
			setxCord(this.getWidth() - BOLA_SIZE);
		else
			setxCord(getxCord() + getDesplazamiento());
		this.repaint();
	}
	
	public void moveLeft(){
		if((getxCord() - getDesplazamiento()) <=0)
			setxCord(0);
		else
			setxCord(getxCord() - getDesplazamiento());
		this.repaint();
	}
	
	public void moveDown(){
		if((getyCord() + BOLA_SIZE + getDesplazamiento()) >=this.getHeight())
			setyCord(this.getHeight() - BOLA_SIZE);
		else
			setyCord(getyCord() + getDesplazamiento());
		this.repaint();
	}
	
	public void moveUp(){
		if((getyCord() - getDesplazamiento()) <=0)
			setyCord(0);
		else
			setyCord(getyCord() - getDesplazamiento());
		this.repaint();
	}
	
	public void moveCenter(){
		setxCord(this.getWidth()/2 - BOLA_SIZE/2);
		setyCord(this.getHeight()/2 - BOLA_SIZE/2);
		this.repaint();
	}

	
	/** Metodo para pintar la bola */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		
		/** Comprueba que la bola no este fuera del panel, y si lo está la colocan dentro */
		if(getxCord() <=0)
			setxCord(0);
		if(getxCord() >= this.getWidth())
			setxCord(this.getWidth() - BOLA_SIZE);
		if(getyCord() <=0)
			setyCord(0);
		if(getyCord() >= this.getHeight())
			setyCord(this.getHeight() - BOLA_SIZE);
		
		g.fillOval(xCord, yCord, BOLA_SIZE, BOLA_SIZE);
	}
}
