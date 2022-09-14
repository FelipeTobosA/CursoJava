
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String args[]) {
        /*
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        //leer info por consola digitada por el usuario
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
         */
        //Tarea 
        /*
            Se solicita incluir la siguiente información acerca de un libro:

            titulo

            autor

            Debes imprimir la información en el siguiente formato:

            Proporciona el titulo:
            Proporciona el autor:
            <titulo> fue escrito por <autor>
         */
        System.out.println("Programa que solicita la informacion acerca de un libro");
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo+" fue escrito por "+autor);
        
    }

}
