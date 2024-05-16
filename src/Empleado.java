
public class Empleado extends Usuario{
	private String puesto;

	public Empleado(String nombre, String dni, String rol, String pin, String puesto) {
		super(nombre, dni, rol, pin);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + "]";
	}
	
	public boolean AgregarDinero(int monto) {
		return true;
	}
}
