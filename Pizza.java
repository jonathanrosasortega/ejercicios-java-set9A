public class Pizza {
  //atributos
  private static int numPedidas=0;
  private static int numServidas=0;
  private String estado;
  private String nombrePizza = "";
  private String tipoPizza = "";
  // Constructor y otros métodos /////////////////////
  public Pizza(String nombre, String tamano){
    this.estado = "pedida";
    this.nombrePizza = nombre;
    this.tipoPizza = tamano;
    numPedidas++;
  }


  public void sirve(){
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      numServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }

  public static int getTotalPedidas(){ // Se pone static para acceder a un atributo de Pizza (En general, no de una Pizza concreta)
		return Pizza.numPedidas;
	}
  public static int getTotalServidas(){ // Se pone static para acceder a un atributo de Pizza (En general, no de una Pizza concreta)
		return Pizza.numServidas;
	}

  public String toString(){
		return "Pizza " + this.nombrePizza + " " + this.tipoPizza + ", " + this.estado;
	}
}
