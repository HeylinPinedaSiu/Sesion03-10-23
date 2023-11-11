import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        /*Metodos
        Que no requieren datos de entrada ni devuelven datos de salida
        Que no requieren datos de entrada pero devuelven datos de salida
        Requieren datos de entrada pero no devuelven datos de salida
        Requieren datos de entrada y devuelven datos de salida
         ***********************************
        Metodos sobrecargados (Sobrecarga de metodos)
        Consiste en reutilizar el nombre de un metodo pero con distintas
        listas de parametros de entrada*/
        mostrarHora();
        mostrarHora(2,15,36);
        mostrarHora(2, 0);
    }
    
    //Declaracion de metodos
    //Version sin parametros de entrada
    public static void mostrarHora(){   
        System.out.print("Horas: ");
        int hr = lector.nextInt();
        System.out.print("Minutos: ");
        int min = lector.nextInt();
        System.out.print("Segundos: ");
        int seg = lector.nextInt();
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);
    }
    
    //Sobrecargar el metodo mostrarHora()
    public static void mostrarHora(int hr, int min, int seg){
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);
    }
    
    public static void mostrarHora(int hr, int min){
        int seg = 46;
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);
    }
}
