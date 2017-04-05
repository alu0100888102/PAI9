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

package main;

import graphic.*;

public class Main {

	public static void main (String args[]){
		if(args.length != 1){
			System.out.println("Argumentos invalidos. La aplicación ha de llamarse: main constanteDeDesplazamiento");
			return;
		}
		FrameBola frame = new FrameBola(Integer.parseInt(args[0]));
		frame.setLocationRelativeTo(null); // Center the frame
	    frame.setSize(550, 550);
	    frame.setVisible(true);
	}
}
