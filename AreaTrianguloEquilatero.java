import java.util.Scanner;
class AreaTrianguloEquilatero
{
    public static void main(String args[])
    {
        //Realizar un ejercicio que permita calcular el area de un triangulo equilatero//

        Scanner T= new Scanner(System.in);
        System.out.println("Ingrese el lado del triangulo");
        double L= T.nextDouble();
        double Area=(Math.sqrt(3)/4)*(L*L);
        System.out.println("El area es: "+Area);
        {
            T.close();
        }
    }

}
