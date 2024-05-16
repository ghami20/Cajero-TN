import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Empleado nuevo = new Empleado("Natanael","87654321","empleado","1234","Mantenimiento");
		Cliente yo = new Cliente("Gamaliel","12345678","cliente","1234",1);
		Cajero corrientes = new Cajero("corrientes 2024",100);
		
		
		String[] rol = {
				"Empleado",
				"Cliente",
				"Salir"
		};
		String dni="";
		String pin="";
		int rolElegido=0;
		do {
			rolElegido = JOptionPane.showOptionDialog(null, "Elija rol", "Menu", 0, 0, null, rol, rol[0]);

			if (rolElegido!=2) {
				 dni = JOptionPane.showInputDialog("Ingrese dni");
				 pin = JOptionPane.showInputDialog("Ingrese pin");
			} 
			switch (rolElegido) {
			case 0: 
				if (nuevo.iniciarSesion(dni, pin)) {
					nuevo.menu(corrientes);
				} else {
					JOptionPane.showMessageDialog(null, "No pudo ingresar");
				}
				
				break;
			case 1:
				if (yo.iniciarSesion(dni, pin)) {
					yo.menu(corrientes);
				} else {
					JOptionPane.showMessageDialog(null, "No pudo ingresar");
				}
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Salir");
	
				break;
			}
		} while (rolElegido!=2);
		
		
		
	}
}
