public class Caballo {
	//atributos /////////////////////////////////////////
	private String raza;
	private int peso;
	private String nombre;
	private boolean sexo; //macho = true, hembra = false
	private int edad;

	// Métodos //////////////////////////////////////////

	//Constructor
	Caballo(String name, String sex) {
		this.nombre = name;
		if(sex.equals("macho")) {
			this.sexo = true;
		} else {
			this.sexo = false;
		}
		this.edad = -1;
		this.peso = -1;
		this.raza = "";
	}

	String getNombre () {
		return this.nombre;
	}

	int getEdad () {
		return this.edad;
	}
  
	String getRaza () {
		return this.raza;
	}

	void setEdad (int time){
		this.edad = time;
	}

	void setPeso (int heavy) {
		this.peso = heavy;
	}

	void setRaza (String modelo) {
		this.raza = modelo;
	}

	public String toString() {
		String ficha;
		ficha = "Nombre: " + this.nombre + "\n";
		if (this.sexo == true) {
			ficha += "Sexo: Macho\n";
		} else {
			ficha += "Sexo: Hembra\n";
		}
		if (!this.raza.equals("")) {
			ficha += "Raza: " + this.raza + "\n";
		}
		if (this.edad >= 0) {
			ficha += "Edad: " + this.edad + "\n";
		}
		if (this.peso >= 0) {
			ficha += "Peso: " + this.peso + "\n";
		}
		return ficha;
	}
}
