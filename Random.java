import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Random extends JFrame implements ActionListener {
	JButton btnRandom ;
	JLabel lbletiqueta1 , lbletiqueta2, lbletiqueta3 , lblResultado;
	JLabel lblMensaje , lblMensaje2 , lblMensaje3 ;
	
	Random(){
		setLayout (new FlowLayout());
		
		btnRandom = new JButton ("RANDOM");
		
		lbletiqueta1 = new JLabel ();
		lbletiqueta2 = new JLabel ();
		lbletiqueta3 = new JLabel ();
		
		lblResultado = new JLabel();
		
		//lblMensaje = new JLabel ("Los tres valores son diferentes");
	//	lblMensaje2 = new JLabel ("Hay dos valores iguales");
	//	lblMensaje3 = new JLabel ("Los tres valores son iguales");
		
		add(btnRandom);
		add(lbletiqueta1);
		add(lbletiqueta2);
		add(lbletiqueta3);
		add(lblResultado);
		
		btnRandom.addActionListener(this);
	
		 setTitle("RANDOM");
	     setSize(800,800);
	     setVisible (true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnRandom) {
			int	random1 = (int) Math.floor(Math.random()*100) ; 
			int	random2 = (int) Math.floor(Math.random()*100) ; 
			int	random3 = (int) Math.floor(Math.random()*100) ; 
			
			
		
		    lbletiqueta1.setText(String.valueOf(random1)); 
			lbletiqueta2.setText(String.valueOf(random2));
			lbletiqueta3.setText(String.valueOf(random3));
	
		
			
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