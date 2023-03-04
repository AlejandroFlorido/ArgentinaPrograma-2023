import java.util.Scanner;
class CondicionalIF
{

   
    public static void main(String args[])
    {

        Scanner V= new Scanner(System.in);
            System.out.println("Ingrese el primer numero");
            int Num1= V.nextInt();

            System.out.println("Ingrese el segundo numero");
            int Num2= V.nextInt();

                if (Num1 > Num2) {
                    System.out.println("El numero "+Num1+" es mas grande que el "+Num2);
                }
                else {
                    if (Num1 < Num2)
                        System.out.println("El numero "+Num2+" es mas grande que el "+Num1);
                    }
                        {
                            System.out.println("Ambos son iguales");
                        }
                        V.close();
    }
}