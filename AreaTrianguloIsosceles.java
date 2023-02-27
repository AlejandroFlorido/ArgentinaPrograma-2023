import java.util.Scanner;
class AreaTrianguloIsosceles
{
    public static void main(String args[])
    {
        Scanner T= new Scanner(System.in);

        System.out.println("Ingresa el largo de uno de los lados");
        double A= T.nextDouble();

        System.out.println("Ingresa el segundo lado");
        double B= T.nextDouble();

        double Area=(B/4)*Math.sqrt((4*A*A)+(B*B));

        System.out.println("El area del triangulo isosceles es: " + Area);
    }
    
}

