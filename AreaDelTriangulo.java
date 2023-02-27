import java.util.Scanner;
class AreaDelTriangulo
{
    //Ejercicio para calcular area de un triangulo//
    public static void main(String args[])
    {
        Scanner C= new Scanner(System.in);
        
            System.out.println("Enter width of triangle");
            double B= C.nextDouble();

            System.out.println("enter high of triangle");
            double H= C.nextDouble();

            // El area es Base*Altura/2//

            double area=(B*H)/2;
            System.out.println("The area is: "+area);
    }
}
