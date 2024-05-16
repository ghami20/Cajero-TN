import javax.swing.JOptionPane;

public abstract class Usuario {
	private String nombre;
	private String dni;
	private String rol;
	private String pin;
	public Usuario(String nombre, String dni, String rol, String pin) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.rol = rol;
		this.pin = pin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", rol=" + rol + ", pin=" + pin + "]";
	}
	public boolean iniciarSesion(String dni,String pin) {
		if (this.getDni().equals(dni)) {
			if (this.getPin().equals(pin)) {
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Pin incorrecto");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usuario incorrecto");
			return false;
		}

	}
	
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Ingresaste al cajero: "+ cajero);
	}
	
}	
