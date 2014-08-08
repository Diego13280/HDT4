// este ejemplo utiliza el patron de diseno Factory
// para seleccionar la implementacion a utilizar
// de un stack

public class StackEjemplo {
  public static void main(String[] args) {
    // llamada al factory:
	StackFactory<String> sFactory = new StackFactory<String>();
	// Solicitar la implementacion deseada del Stack:
	//  AL: implementacion con ArrayList
	//  V:   implementacion con Vector
	Stack<String> miStack = sFactory.getStack("AL");
	
	
    miStack.push("Adios");  //1
	miStack.push("Hola");   //2

    String cadena = miStack.pop();
    System.out.println(cadena);
	cadena = miStack.pop();
	System.out.println(cadena);
  }
}