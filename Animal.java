public abstract class Animal {
	private static int edad;
	private static String genero;

	// Métodos ///////////////////////////////////////////////////
	//constructor
	public Animal () {
		this.edad = 0;
		this.genero = "INDEFINIDO";
	}

	public Animal (String sex) {
		this.edad = 0;
		this.genero = sex;
	}

	public void setEdad (int tiempo) {
		this.edad = tiempo;
	}

	public int getEdad (){
		return this.edad;
	}

	public String getGenero (){
		return this.genero;
	}

	public String toString () {
		String salida = "";

		salida = salida + "Sexo: " + this.genero + "\nEdad: " + this.edad;
		
    return salida;
	}
}
/*
public abstract class Animal {
	private Sexo sexo;
	
	public Animal () {
		this.sexo = Sexo.MACHO;
	}
	public Animal (Sexo s) {
		this.sexo = s;
	}
	public Sexo getSexo() {
		return this.sexo;
	}
	public void duerme() {
		System.out.println("Zzzzzzz");
	}
	public void come(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
}*/
