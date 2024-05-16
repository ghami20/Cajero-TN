import java.time.LocalDateTime;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class Cliente extends Usuario{
	private int nroCuenta;

	public Cliente(String nombre, String dni, String rol, String pin, int nroCuenta) {
		super(nombre, dni, rol, pin);
		this.nroCuenta = nroCuenta;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	@Override
	public String toString() {
		return "Cliente [nroCuenta=" + nroCuenta + "]";
	}
	public boolean RetirarDinero(int monto,Cajero cajero,Cuenta cuenta) {
		
		if (monto>0 && monto<=cuenta.getSaldo()) {
			
			if (monto>0 && monto<=cajero.getSaldo()) {
				
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				cajero.setSaldo(cajero.getSaldo()-monto);
				cuenta.setOperaciones(cuenta.getOperaciones() + "Retire dinero fecha: " + LocalDateTime.now() + " Monto a retirar " + monto);
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "No hay dinero en cajero");
				return false;
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "No hay dinero suficiente en cuenta");

			return false;

		}

		
		
	}
	public boolean DepositarEnCuenta(int monto,Cajero cajero,Cuenta cuenta) {
		if (monto>0) {
			
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				cajero.setSaldo(cajero.getSaldo()+monto);
				cuenta.setOperaciones(cuenta.getOperaciones() + " \nDeposite dinero fecha: " + LocalDateTime.now() + " Monto a depositar " + monto + "\n");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Ingreso invalido");
				return false;
			}
			
		
	}
	@Override
	public void menu(Cajero cajero) {
		
		Cuenta nueva = new Cuenta(100,this,"Movimientos\n");
		
		JOptionPane.showMessageDialog(null, "Bienvenido cliente");
		String[] opciones = {
				"Retirar dinero",
				"Depositar dinero",
				"Ver cuenta",

				"Salir"
		};
		
		int opcion=0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción ", "Menu cliente", 0, 0, null, opciones, opciones[0]);
		
			
			switch (opcion) {
			case 0: 
				int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto"));
			
				 if (this.RetirarDinero(monto, cajero,nueva)) {
						JOptionPane.showMessageDialog(null, "Se retiro dinero en cuenta");
					} else {
						JOptionPane.showMessageDialog(null, "Error al retirar");

					}
				break;
			case 1:
				 monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto"));

				 if (this.DepositarEnCuenta(monto, cajero,nueva)) {
					JOptionPane.showMessageDialog(null, "Se deposito dinero en cuenta");
				} else {
					JOptionPane.showMessageDialog(null, "Error al depositar");

				}
				
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Cuenta " + nueva.getCliente().getNroCuenta() + "\n" + nueva.getOperaciones() + "\n Saldo restante " + nueva.getSaldo());
				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Salir");				
				break;
			}
		} while (opcion!=3);
	
	
	}
	
	
}
