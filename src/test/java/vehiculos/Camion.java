package vehiculos;

public class Camion extends Vehiculo {
	//atributos de la clase
	private int ejes;
	protected static int camiones = 0;
	
	//atributos heredados
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante,int ejes) {
		super(placa, 2,80,nombre,precio, peso, "4X2",fabricante);
		this.ejes = ejes;
		Camion.camiones += 1;
	}

	//get y set
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public int getCantidadCamiones() {
		return this.camiones;
	}
	public void setCantidadCamiones(int camiones) {
		this.camiones = camiones;
	}
}
