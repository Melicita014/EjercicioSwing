import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Contrasena extends JFrame implements ActionListener {

JLabel lblNombre , lblContrasena, lblResultado;
JTextField txtNombre ;
JPasswordField pwdContrasena ;

JButton btnResultado ;
	
Contrasena(){
	setLayout (new GridLayout(5,5));
	
	pwdContrasena = new JPasswordField();
	
	lblNombre = new JLabel("Nombre:");
	lblContrasena = new JLabel("Contraseña:");
	lblResultado = new JLabel () ;
	
	txtNombre = new JTextField ();
	
	btnResultado = new JButton ("LOGIN");
	
	btnResultado.addActionListener(this);
	
	
	 add (lblNombre) ;
	 add(txtNombre);
	 
	 add (lblContrasena);
	 add (pwdContrasena) ;
	 	 
	 add (btnResultado);
	 
	 add (lblResultado);

	 setTitle("USUARIO");
     setSize(800,800);
     setVisible (true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String contra = new String (pwdContrasena.getPassword());
		String usuario = new String (txtNombre.getText());
		
		
		if(e.getSource()== btnResultado) 
			if (contra.equals("admin1234") & usuario.equals ("admin"))//txtUsuario.getText().equals("admin)MAL
				lblResultado.setText("La contraseña es CORRECTA " );
				
				else 
					lblResultado.setText("La contraseña es INCORRECTA " );
					
		
	
		}

	

	public static void main(String[] args) {
		new Contrasena();
			
		}

	

}
