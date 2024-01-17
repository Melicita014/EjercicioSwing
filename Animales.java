import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Animales extends JFrame implements ActionListener {// JopyionPane.showMessageDialog
	
	JLabel lblAnimal, lblTexto;
	
	JComboBox cboAnimales ;
	
	ImageIcon imgGatos , imgPerros , imgCaballo;
	
	JButton btnResultado ;
		
	String Animales[]={"Gato", "Perro", "Caballo"};
	
	
	
	Animales(){
	setLayout (new FlowLayout());
		
	imgGatos = new ImageIcon ("e:\\cat.jpg");
	imgPerros = new ImageIcon ("e:\\perro.jpg");
	imgCaballo = new ImageIcon ("e:\\Caballo.jpg");
	
	lblAnimal = new JLabel ();
	
	lblTexto = new JLabel ("Elige una opcion");
	
	cboAnimales = new JComboBox (Animales);

	
	cboAnimales.addActionListener(this);

	add(lblTexto);
	add(cboAnimales);
	add (lblAnimal) ;

	
	
	 setTitle("ANIMALES");
     setSize(800,800);
     setVisible (true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this,"Seleccionado: " + cboAnimales.getSelectedItem());
		
		if(	cboAnimales.getSelectedItem() =="Gato")
			lblAnimal.setIcon (imgGatos);
		else
		if(	cboAnimales.getSelectedItem() =="Perro")
			lblAnimal.setIcon (imgPerros);
		else
		if(	cboAnimales.getSelectedItem() =="Caballo")
			lblAnimal.setIcon (imgCaballo);
	
	}

	public static void main(String[] args) {
		
		new Animales();
	}

}
