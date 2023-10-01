package vehiculos;

public class Camioneta extends Vehiculo{
	//atributos
	private boolean volco;
	protected static int camionetas = 0;
	
	//atributos heredados

	public Camioneta(String placa,int puertas,String nombre,int precio,int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90,nombre,peso, precio,"4X4",fabricante);
		this.volco = volco;
		Camioneta.camionetas += 1;
	}
	
	//get y set
	
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public int getCantidadCamionetas() {
		return this.camionetas;
	}
	public void setCantidadCamionetas(int camionetas) {
		this.camionetas = camionetas;
	}
}
