public class Gato extends Mamifero /**/{
	private String raza;

	public Gato (String r){
		this.raza = r;
	}

	public void ronronea(){
		System.out.println("purrrrrrrr");
	}

	public void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("¡MIAU!");
		} else {
			System.out.println("Meh!");
		}
	}

}