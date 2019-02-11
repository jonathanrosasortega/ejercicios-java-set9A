/*los métodos pueden ser
invierte, simplifica, multiplica, divide*/
public class Fraccion {
	// atributos
	private int masmenos;
	private int numerador;
	private int denominador;

	// Constructor y otros métodos /////////////////////
	public Fraccion(int num, int denom) {
		if (denom == 0) {
			System.out.println("Una fracción no puede tener su denominador a cero");
		} else {
			if (num*denom >= 0) {
				this.masmenos = 1;
			} else {
				this.masmenos = -1;
			}
			this.numerador = Math.abs(num);
			this.denominador = Math.abs(denom);
		}
	}

	public int getNumerador(){
		return this.numerador;
	}
	public int getDenominador(){
		return this.denominador;
	}

	public String toString(){
		if (masmenos == -1) {
			return "-" + this.numerador + "/" + this.denominador;
		} else {
			return this.numerador + "/" + this.denominador;
		}
	}

	public Fraccion invierte(){ /*Devuelve un nuevo objeto "Fraccion" reemplazando al actual*/
		return new Fraccion(this.masmenos * this.denominador, this.numerador);
	}

	public Fraccion simplifica(){ /*Devuelve un nuevo objeto "Fraccion" reemplazando al actual*/
		int posneg = this.masmenos;
		int num = this.numerador;
		int denom = this.denominador;

		for (int i=2; i<Math.min(this.numerador, this.denominador); i++) { /*Math.min devuelve el menor de 2 números*/
			while ((num%i == 0) && (denom%i == 0)){ /* Mientras la división entre 1 de los 2 sea exacta*/
				num /= i;
				denom /= i;
			}
		}
	return new Fraccion(posneg * num, denom);
	}

	public Fraccion multiplica(int numero){ /*Multiplicando por un nº entero*/
		return new Fraccion(this.masmenos * this.numerador * numero, this.denominador);
	}
	public Fraccion divide(int numero){ /*Dividiendo entre un nº entero*/
		return new Fraccion(this.masmenos * this.numerador, this.denominador * numero);
	}
	
	public Fraccion multiplica(Fraccion f){ /*Multiplicando por otra fracción*/
		return new Fraccion(this.masmenos * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
	}
	public Fraccion divide(Fraccion f){ /*Dividiendo entre otra fracción*/
		return new Fraccion(this.masmenos * this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
	}
}
