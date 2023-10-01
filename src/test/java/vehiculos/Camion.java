package vehiculos;

public class Camion extends Vehiculo {
	//atributos de la clase
	private int ejes;
	
	//atributos heredados
	
	public Camion() {
		Vehiculo.cantidadVehiculos += 1;
	}
	public Camion(int ejes) {
		this.ejes = ejes;
		Vehiculo.cantidadVehiculos += 1;
	}
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante,int ejes) {
		super(placa, 2,80,nombre,precio, peso, "4X2",fabricante);
		this.ejes = ejes;
		Vehiculo.cantidadVehiculos += 1;
	}

	//get y set
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
