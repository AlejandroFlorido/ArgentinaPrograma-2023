import java.util.Scanner;
class AreaDeRectangulo
{
    public static void main(String args[])
    {

        Scanner R= new Scanner(System.in);

            System.out.println("Ingresa la altura");
            double H= R.nextDouble();
            System.out.println("Ingresa la base");
            double B= R.nextDouble();

                double Area=B*H;
            System.out.println("El area es: "+Area);
            {
                R.close();
            }
    }
}