import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{
	private JTextArea textarea1;
	private JCheckBox check1;
	private JLabel label1, label2;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	String texto = "";

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		getContentPane().setBackground(new Color(224,224,224));
		Bienvenida ventanaBienvenida =  new Bienvenida();
		texto = ventanaBienvenida.nombre;

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale Mono",1,14));
		label1.setForeground(new Color(0,0,0));
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setFont(new Font("Andale Mono",0,9));
		textarea1.setText("\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE DAEL."+
							"\n          C.  DAEL NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
						  "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
						    "\n          (DAEL), NO SE RESPONSABILIZAN DEL USO QUE USTED"+
						    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"+
						    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
						  "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"+
						    "\n          https://portfolio-eight-iota-65.vercel.app/");
		textarea1.setEditable(false);
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);

		check1 = new JCheckBox("Yo " + texto +" Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
        check1.setBackground(new Color(224,224,224));
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,320,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);

		boton2 = new JButton("No Acepto");
		boton2.setBounds(120,320,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);

		ImageIcon imagen =new ImageIcon("images/coca-cola.png");
		label2 = new JLabel(imagen);
		label2.setBounds(315,140,300,300);
		add(label2);
	}
	public void stateChanged(ChangeEvent e){
		if(check1.isSelected() == true){
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}
        if(check1.isSelected() == false){
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			Principal principal = new Principal();
			principal.setBounds(0,0,650,600);
			principal.setVisible(true);
			principal.setResizable(false);
			principal.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == boton2){
			Bienvenida bienvenida = new Bienvenida();
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
	public static void main(String args[]){
		Licencia terminos = new Licencia();
		terminos.setBounds(0,0,610,400);
		terminos.setVisible(true);
		terminos.setResizable(false);
		terminos.setLocationRelativeTo(null);
	}

}
