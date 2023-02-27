import java.util.Scanner;
class AreaDeCirculo
{
    public static void main(String args[])
    {
        /*
        La definicion de la clase(class): define una nueva clase a traves de la palabra clave "class" en los cedigos de Java. Debe estar comprendida entre llaves:"Apertura {} Cierre" en los codigos de Java.

        Metodo principal(main): cada aplicacion de Java debe contener el metodo, en este caso public static void main (String [ ] args)

        Public:se coloca para que pueda ejecutarse en cualquier lugar.

        Static:con esto el metodo principal puede ser llamado sin crear el objeto.

        Void:el metodo principal no devuelve nada.

        String:el metodo principal acepta un unico argumento.  

        */

        Scanner C= new Scanner(System.in);

            System.out.println ("Ingresa el radio");
            double r= C.nextDouble();
            double area=(22*r*r)/7;

            // 22/7 es la forma de escribir π en codigos //

            System.out.println ("El area del circulos es:"+ area);
            {
                C.close();
            }

    }     

}