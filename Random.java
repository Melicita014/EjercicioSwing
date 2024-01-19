import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Random extends JFrame implements ActionListener {
	JButton btnRandom ;
	
	JLabel lbletiqueta1 , lbletiqueta2, lbletiqueta3 , lblResultado; //Para los numeros.
	JLabel lbletiqueta4 , lbletiqueta5, lbletiqueta6 , lblResultado1; // Para las fotos.
	
	ImageIcon imgGatos , imgPerros , imgCaballo;
	
	Random(){
		setLayout (new GridLayout(6,9));
	
	//Fotitos:	
		imgGatos = new ImageIcon ("e:\\cat.jpg");
		imgPerros = new ImageIcon ("e:\\perro.jpg");
		imgCaballo = new ImageIcon ("e:\\Caballo.jpg");
		
		btnRandom = new JButton ("RANDOM"); // Boton para las dos
	
	//Numeros:
		lbletiqueta1 = new JLabel ();
		lbletiqueta2 = new JLabel ();
		lbletiqueta3 = new JLabel ();
		
		lblResultado = new JLabel();
		
	//Fotos:	
		lbletiqueta4 = new JLabel ();
		lbletiqueta5 = new JLabel ();
		lbletiqueta6 = new JLabel ();
		
		lblResultado1 = new JLabel();
		
		add(btnRandom);
		
		add(lbletiqueta1);
		add(lbletiqueta2);
		add(lbletiqueta3);
		add(lblResultado);
		
		add(lbletiqueta4);
		add(lbletiqueta5);
		add(lbletiqueta6);
		add(lblResultado1);
		
		btnRandom.addActionListener(this);
	
		 setTitle("RANDOM");
	     setSize(800,800);
	     setVisible (true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnRandom) {
		
			//Numero aleatorio para los numeros:
			
			int	random1 = (int) Math.floor(Math.random()*100) ; 
			int	random2 = (int) Math.floor(Math.random()*100) ; 
			int	random3 = (int) Math.floor(Math.random()*100) ; 
			
			//Numero aleatorio para las fotos:
			
			int randomFoto1 = (int) Math.floor(Math.random()*3);
			int randomFoto2 = (int) Math.floor(Math.random()*3);
			int randomFoto3 = (int) Math.floor(Math.random()*3);
			
		// Ponemos a cada etiqueta una foto segun el numero que toque.	
			
			if(	randomFoto1 == 1)
				lbletiqueta4.setIcon(imgGatos);
			
			if(	randomFoto1==2)
				lbletiqueta4.setIcon(imgPerros);
		
			if(	randomFoto1 ==3)
				lbletiqueta4.setIcon(imgCaballo);
			
			
			if(	randomFoto2 == 1)
				lbletiqueta5.setIcon(imgGatos);
			
			if(	randomFoto2==2)
				lbletiqueta5.setIcon(imgPerros);
			
			if(	randomFoto2 ==3)
				lbletiqueta5.setIcon(imgCaballo);
			
			
			if(	randomFoto3 == 1)
				lbletiqueta6.setIcon(imgGatos);
			
			if(	randomFoto3==2)
				lbletiqueta6.setIcon(imgPerros);
			
			if(	randomFoto3 ==3)
				lbletiqueta6.setIcon(imgCaballo);
			
			    lbletiqueta1.setText(String.valueOf(randomFoto1)); 
				lbletiqueta2.setText(String.valueOf(randomFoto2));
				lbletiqueta3.setText(String.valueOf(randomFoto3));
				
		    lbletiqueta1.setText(String.valueOf(random1)); 
			lbletiqueta2.setText(String.valueOf(random2));
			lbletiqueta3.setText(String.valueOf(random3));
	
		//FOTOS:

			
			if (randomFoto1==randomFoto2 & randomFoto1==randomFoto3) 
					lblResultado1.setText("Los TRES valores son IGUALES" );
			else
				if (randomFoto1 == randomFoto2 || randomFoto1==randomFoto3 || randomFoto2 ==randomFoto3 )
					lblResultado1.setText("Hay DOS valores IGUALES");
				else 
					if (randomFoto1 != randomFoto2 || randomFoto1!=randomFoto3 || randomFoto2 !=randomFoto3)
					lblResultado1.setText("Los TRES valores son DIFERENTES");
			
		//NUMEROS:			
					if (random1==random2 & random1==random3) 
				lblResultado.setText("Los TRES valores son IGUALES" );
		else
			if (random1 == random2 || random1==random3 || random2 ==random3 )
				lblResultado.setText("Hay DOS valores IGUALES");
			else 
				if (random1 != random2 || random1!=random3 || random2 !=random3)
				lblResultado.setText("Los TRES valores son DIFERENTES");
		}
		
	}


public static void main(String[] args) {
	new Random();

}}
