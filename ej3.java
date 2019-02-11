/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefine el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/
public class ej3 {
	public static void main(String[] args) {

	Pinguino pingu = new Pinguino();
	Pinguino pinga = new Pinguino();
	
	Perro seven = new Perro();

	Gato misifu = new Gato("persa");

	Lagarto salazzle = new Lagarto();

	Canario trompetilla = new Canario();

	pingu.vuela();
	pinga.pesca();

	seven.ladra();
	seven.caza();

	misifu.ronronea();
	misifu.come("pescado");
	misifu.come("rata cruda");

	salazzle.caza();
	salazzle.modoGEX();

	trompetilla.canta();
	/*System.out.println(prueba);*/

	}
}

/*
public class PruebaAnimales {
	public static void main(String[] args) {
		Pinguino tux = new Pinguino(Sexo.MACHO);
		tux.come("palomitas");
		tux.programa();
		Perro laika = new Perro(Sexo.HEMBRA);
		laika.duerme();
		laika.dameLaPata();
		laika.amamanta();
		laika.cuidaCrias();
		Lagarto godzilla = new Lagarto(Sexo.MACHO);
		godzilla.tomaElSol();
		godzilla.duerme();
	}
}*/
