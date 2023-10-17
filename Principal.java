import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
	private JMenuBar menubar;
	private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcercaDe;
	private JMenuItem miRojo, miNegro, miMorado, miNuevo, miSalir, miVacaciones, miElCreador;
	private JLabel labelLogo,labelBienvenido,labelTitulo,labelNombre,labelApellidoPaterno,
				   labelApellidoMaterno,labelDepartamento,labelAntiguedad,labelResultado,label1Footer;
	private JTextField txtNombre, txtApellidoPaterno, txtApellidoMaterno;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;
	String texto = "";

	public Principal(){
		UIManager UI=new UIManager();
			UI.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
			UI.put("OptionPane.messageForeground", Color.decode("#008F39"));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida =  new Bienvenida();
		texto = ventanaBienvenida.nombre;

		menubar = new JMenuBar();
		menubar.setBackground(new Color(255,0,0));
		setJMenuBar(menubar);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		menubar.add(menuOpciones);

		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorFondo);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		menubar.add(menuCalcular);

		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		menubar.add(menuAcercaDe);

		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);

		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);

		miMorado = new JMenuItem("Morado");
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		miMorado.setForeground(new Color(255,0,0));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);

		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);

		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);

		miVacaciones = new JMenuItem("vacaciones");
		miVacaciones.setFont(new Font("Andale Mono", 1, 14));
		miVacaciones.setForeground(new Color(255,0,0));
		menuCalcular.add(miVacaciones);
		miVacaciones.addActionListener(this);

		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(10,10,250,100);
		add(labelLogo);

		labelBienvenido = new JLabel("Bienvenido "+ texto);
		labelBienvenido.setBounds(280,50,300,30);
		labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);

		labelTitulo = new JLabel("Datos del trabajador para el calculo de vacaciones");
		labelTitulo.setBounds(45,140,545,30);
		labelTitulo.setFont(new Font("Andale Mono", 0, 24));
		labelTitulo.setForeground(new Color(255,255,255));
		add(labelTitulo);

		labelNombre = new JLabel("Nombre Completo:");
		labelNombre.setBounds(15,220,150,30);
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);

		// Agregar los setBackground a todos  textfield, textarea y combobox en color gris
		txtNombre = new JTextField();
		txtNombre.setBounds(15,250,150,30);
		txtNombre.setBackground(new Color(224,224,224));
		txtNombre.setFont(new Font("Andale Mono", 1, 14));
		txtNombre.setForeground(new Color(255,0,0));
		add(txtNombre);

		labelApellidoPaterno = new JLabel("Apellido Paterno:");
		labelApellidoPaterno.setBounds(15,290,150,30);
		labelApellidoPaterno.setFont(new Font("Andale Mono", 1, 12));
		labelApellidoPaterno.setForeground(new Color(255,255,255));
		add(labelApellidoPaterno);

		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.setBounds(15,320,150,30);
		txtApellidoPaterno.setBackground(new Color(224,224,224));
		txtApellidoPaterno.setFont(new Font("Andale Mono", 1, 14));
		txtApellidoPaterno.setForeground(new Color(255,0,0));
		add(txtApellidoPaterno);

		labelApellidoMaterno = new JLabel("Apellido Materno:");
		labelApellidoMaterno.setBounds(15,360,150,30);
		labelApellidoMaterno.setFont(new Font("Andale Mono", 1, 12));
		labelApellidoMaterno.setForeground(new Color(255,255,255));
		add(labelApellidoMaterno);

		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setBounds(15,390,150,30);
		txtApellidoMaterno.setBackground(new Color(224,224,224));
		txtApellidoMaterno.setFont(new Font("Andale Mono", 1, 14));
		txtApellidoMaterno.setForeground(new Color(255,0,0));
		add(txtApellidoMaterno);

		labelDepartamento = new JLabel("Selecciona Departamento:");
		labelDepartamento.setBounds(220,220,150,30);
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,250,200,30);
		comboDepartamento.setBackground(new Color(224,224,224));
		comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new Color(255,0,0));
        comboDepartamento.addItem  ("");
		comboDepartamento.addItem("Atencion al cliente");
		comboDepartamento.addItem("Departamento de Logistica");
		comboDepartamento.addItem("Departamento de Gerencia");
		add(comboDepartamento);

		labelAntiguedad = new JLabel("Selecciona Antigüedad:");
		labelAntiguedad.setBounds(220,290,150,30);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,330,200,30);
		comboAntiguedad.setBackground(new Color(224,224,224));
		comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new Color(255,0,0));
        comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 Año de Servicio");
		comboAntiguedad.addItem("2 a 6 años de Servicio");
		comboAntiguedad.addItem("7 años o mas de Servicio");
		add(comboAntiguedad);

		labelResultado = new JLabel("Resulatado del calculo:");
		labelResultado.setBounds(220,360,150,30);
		labelResultado.setFont(new Font("Andale Mono", 1, 12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n   Aqui aparece el resultado del calculo de las vaciones");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(220,390,390,100);
		add(scrollpane1);

		label1Footer = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
		label1Footer.setBounds(130,510,350,20);
		label1Footer.setFont(new Font("Andale Mono", 1, 12));
		label1Footer.setForeground(new Color(255,255,255));
		add(label1Footer);
    }
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == miVacaciones) {

			String seleccionNombre = txtNombre.getText();
			String seleccioApellidoPaterno = txtApellidoPaterno.getText();
			String seleccioApellidoMaterno = txtApellidoMaterno.getText();
			String seleccionDepartamento = comboDepartamento.getSelectedItem().toString();	
			String seleccionAntiguedad = comboAntiguedad.getSelectedItem().toString();	

			if (seleccionNombre.trim().equals("") || seleccioApellidoMaterno.trim().equals("") || seleccioApellidoPaterno.trim().equals("") || seleccionDepartamento.equals("") || seleccionAntiguedad.equals("")) {
				JOptionPane.showMessageDialog(null, "No se permiten campos en blanco");										
			} else {
				if (seleccionDepartamento.equals("Atencion al cliente") && seleccionAntiguedad.equals("1 Año de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 6 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Atencion al cliente") && seleccionAntiguedad.equals("2 a 6 años de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 14 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Atencion al cliente") && seleccionAntiguedad.equals("7 años o mas de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 20 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Logistica") && seleccionAntiguedad.equals("1 Año de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 7 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Logistica") && seleccionAntiguedad.equals("2 a 6 años de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 15 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Logistica") && seleccionAntiguedad.equals("7 años o mas de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 22 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Gerencia") && seleccionAntiguedad.equals("1 Año de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 10 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Gerencia") && seleccionAntiguedad.equals("2 a 6 años de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 20 dias de vacaciones");
				}
				if (seleccionDepartamento.equals("Departamento de Gerencia") && seleccionAntiguedad.equals("7 años o mas de Servicio")) {
					textarea1.setText("\n\n   El Empleado "+seleccionNombre+" "+seleccioApellidoPaterno+" "+seleccioApellidoMaterno+" del departamento "+seleccionDepartamento+" Tiene derecho a 30 dias de vacaciones");
				}


	    	}
		}
		if (e.getSource() == miRojo) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if (e.getSource() == miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if (e.getSource() == miMorado) {
			getContentPane().setBackground(new Color(128,0,128));
		}
		if (e.getSource() == miNuevo) {
			//getContentPane().setBackground(new Color(255,0,0));
			txtNombre.setText("");
			textarea1.setText("");
			txtApellidoMaterno.setText("");
			txtApellidoPaterno.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);

			/*comboDepartamento.removeAllItems();
			comboDepartamento.addItem  (null);
			comboDepartamento.addItem("Atencion al cliente");
			comboDepartamento.addItem("Departamento de Logistica");
			comboDepartamento.addItem("Departamento de Gerencia");
			add(comboDepartamento);

			comboAntiguedad.removeAllItems();
			comboAntiguedad.addItem  (null);
			comboAntiguedad.addItem("1 Año de Servicio");
			comboAntiguedad.addItem("2 a 6 años de Servicio");
			comboAntiguedad.addItem("7 años o mas de Servicio");
			add(comboAntiguedad);*/
		}
		if (e.getSource() == miSalir) {
			Bienvenida bienvenida = new Bienvenida();
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == miElCreador) {
			JOptionPane.showMessageDialog(null, "\nNombre: Dael Flodo"+"\nhttps://www.linkedin.com/in/davidflodo/");
		}
	}

	public static void main(String args[]){
		Principal principal = new Principal();
		principal.setBounds(0,0,650,600);
		principal.setVisible(true);
		principal.setResizable(false);
		principal.setLocationRelativeTo(null);
	}
}