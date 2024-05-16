
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
	
}	
