package vehiculos;

public class Camion extends Vehiculo {
	//atributos de la clase
	private int ejes;
	protected static int camiones;
	
	//atributos heredados
	
	public Camion(String placa,String nombre,int precio,int peso, Fabricante fabricante,int ejes) {
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
	
	public static int getCantidadCamiones() {
		return Camion.camiones;
	}
	public static void setCantidadCamiones(int camiones) {
		Camion.camiones = camiones;
	}
}
