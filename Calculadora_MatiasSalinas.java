import java.util.Scanner;
public class Main {
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.int);
        double total = 0;
        double seleccion = 1;

        while (seleccion != 0) {
            /*listado que se mostrara con las opciones disponibles */
            System.out.println("presione 1. suma");
            System.out.println("presione 2. resta");
            System.out.println("presione 3. multiplicacion");
            System.out.println("presione 4. division");
            System.out.println("presione 0. salir");
            System.out.println("");
            int seleccion = sc.nextInt();

            if (seleccion == 1) {
                /*pedidio de datos para la operacion */
                System.out.println("Num1: ");
                double num1 = sc.nextDouble();
                System.out.println("Num2: ");
                double num2 = sc.nextDouble();

                /*ejecicion de la misma y muestra de resultados */
                double suma = num1+num2;
                System.out.println("");
                System.out.println("La suma es " +suma);
                /*se acumula el resultado de la operacion para mostrarlo luego en un total global */
                total = total+suma;

                /*en los proimos casos se repite el mismo patron para la resta, multiplicacion y division */
    
            } else if (seleccion == 2) {
                System.out.println("Num1: ");
                double num1 = sc.nextDouble();
                System.out.println("num2: ");
                double num2 = sc.nextDouble();
    
                double resta = num1-num2;
                System.out.println("");
                System.out.println("La resta de los numeros es: " +resta);
                total = total+resta;
            } else if (seleccion == 3){
                System.out.println("num1: ");
                double num1 = sc.nextDouble();
                System.out.println("num2: ");
                double num2 = sc.nextDouble();
    
                double mult = num1*num2;
                System.out.println("");
                System.out.println("la multiplicacion de los numeros es " +mult);
                total = total+mult;
            } else if (seleccion == 4) {
                System.out.println("num1: ");
                double num1 = sc.nextDouble();
                System.out.println("num2: ");
                int num2 = sc.nextDouble();

                /*en el caso division agrego un if para corroborar que no se divida por 0 */
                if (num2==0) {
                    System.out.println("La division no es posible cuando el segundo numero (divisor) es 0")
                } else {
                    /*si no es el caso en el cual se introdujo 0 como divisor, se opera con noemalidad */
                    double division = num1/num2;
                    System.out.println("");
                    System.out.println("la division de los numeros es: " +division);
                    total = total+division;
                }
            } else if (seleccion == 0) {
                System.out.println("Saliendo...")
                break
            } else {
                System.out.println("El numero elegido no corresponde a una opcion. Saliendo...");
                break
            }
        }

        /*luego de realizar la cantidad deseada de operaciones se muestra un total de todo */
        System.out.println("");
        System.out.println("El total de las operaciones es: " +total);
    }
}