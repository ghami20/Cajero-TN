
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
	public boolean RetirarDinero(int monto,Cajero cajero) {
		return true;
	}
	public boolean DepositarEnCuenta(int monto,Cajero cajero) {
		return true;
	}
	
	
}
