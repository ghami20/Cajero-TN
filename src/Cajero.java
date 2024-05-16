
public class Cajero {
	private String ubicacion;
	private double saldo;
	public Cajero(String ubicacion, double saldo) {
		super();
		this.ubicacion = ubicacion;
		this.saldo = saldo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cajero [ubicacion=" + ubicacion + ", saldo=" + saldo + "]";
	}
	
	
}
