public class Terminal{
  private String numTerminal;
  private int segundosLlamada = 0;

  public Terminal(String s){
    this.numTerminal = s;
  }

  public String toString (){
    String nombre = this.numTerminal;
    int num = this.segundosLlamada;
    return "Nº " + nombre + "-" + num + "s de conversación";
  }

  public String getNumero(){
    return numTerminal;
  }

  public int getSegundos(){
    return segundosLlamada;
  }
  public void llama(Terminal t, int seg){
    this.segundosLlamada += seg;
    t.segundosLlamada += seg;
  }
}
