import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principal {

    public static void main(String[] args) {
        StackArrayList calculos = new StackArrayList ();
        
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("LeerArchivo.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            String []arreglo;
            String s;
            int a;
            int Contador = 0;
            int variableMomentanea=0;
            int variableuno=0;
            int variableDos=0;
            int variableOperadora=0;
            String letra;
            System.out.println("");
            System.out.println("Bienvenido al programa Calculadora Postfix: ");
            System.out.println("");
           
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println ("De la Exprecion en Postfix: ");
                System.out.println (strLinea);
                List<String> ListaUsuario = new ArrayList<String>(Arrays.asList(strLinea.split(" ")));
                a= ListaUsuario.size();
                
               while (Contador<=a-1){
                   
                   letra=ListaUsuario.get(Contador);                   
                   

                   if (!letra.equals("+") && !letra.equals("-") && !letra.equals("*") && !letra.equals("/")) {
                       
                       variableMomentanea =Integer.parseInt(letra);
                       calculos.push(variableMomentanea);
                   }
                   
                  if (letra.equals ("+")){
                       
                       variableuno = (int)calculos.pop(); 
                       variableDos = (int) calculos.pop();
                       variableOperadora = variableuno + variableDos;
                       calculos.push(variableOperadora); 
                   }
                   if (letra.equals("-")){
                       variableuno = (int) calculos.pop(); 
                       variableDos = (int) calculos.pop();
                       variableOperadora = variableuno - variableDos;
                       calculos.push(variableOperadora); 
                   }
                    if (letra.equals("*")){
                       variableuno = (int) calculos.pop(); 
                       variableDos = (int) calculos.pop();
                       variableOperadora = variableuno * variableDos;
                       calculos.push(variableOperadora); 
                   }
                    if (letra.equals("/")){
                       variableuno = (int) calculos.pop(); 
                       variableDos = (int) calculos.pop();
                       variableOperadora = variableuno / variableDos;
                       calculos.push(variableOperadora); 
                  } 
                  // System.out.println ("Letra: "+letra);
                  // System.out.println ("ListaUsuario: "+ListaUsuario);
                  // System.out.println ("variable momentanea: "+variableMomentanea);
                  // System.out.println ("variable uno: "+variableuno);
                  // System.out.println ("variable dos: "+variableDos);
                 // System.out.println ("variable operadora: "+variableOperadora);
                    Contador ++;
               }
                System.out.println("el resultado del calculo es: "+ variableOperadora);
                System.out.println(" ");
                Contador = 0;
            }
            // Cerramos el archivo
            entrada.close();
        }catch (IOException e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

    }
    
}
