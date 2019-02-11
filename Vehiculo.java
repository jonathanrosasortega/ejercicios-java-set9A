public abstract class Vehiculo {
	//atributos de clase /////////////////////////////////////////
	private static int kilometrosTotales = 0;
	private static int vehiculosCreados = 0;
	// atributos de instancia ////////////////////////////////////
	private int Kilometraje;
	// Métodos ///////////////////////////////////////////////////

	//Constructor
	public Vehiculo() {
		this.Kilometraje = 0;
		this.vehiculosCreados++;
	}

	public int getKilometraje() { //Devolviendo un int, el del return
		return this.Kilometraje;
	}

	public static int getkilometrosTotales() { //Devolviendo un int, el del return.
		//Se añade static por ser atributo de clase lo que se devuelve
		return Vehiculo.kilometrosTotales;
	}

	public void anda(int distancia) {
		this.Kilometraje += distancia;
		Vehiculo.kilometrosTotales += distancia;
	}

}