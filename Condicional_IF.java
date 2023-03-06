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
                System.out.println("El numero "+Num1+"Es mayor al numero "+Num2);
            }
            else {
                if (Num1 < Num2) {
                    System.out.println("El numero "+Num2+"es mayor que el numero "+Num1);
                }
                else {
                    System.out.println("Ambos son iguales");
                }
            }
            V.close();
    }
}    