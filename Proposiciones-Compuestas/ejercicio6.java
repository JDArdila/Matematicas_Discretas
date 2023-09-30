
public class ejercicio6 {
    /*
    Supongamos que estás desarrollando una aplicación de comercio electrónico y necesitas establecer reglas de negocio para determinar si un cliente puede realizar una compra. Las reglas son las siguientes:

El cliente debe tener una cuenta activa (P).
El producto debe estar en stock (Q).
El cliente debe tener un método de pago válido registrado (R).
El cliente debe haber iniciado sesión (S).
Escribe una proposición compuesta que represente las condiciones necesarias para 
    que un cliente pueda realizar una compra en la aplicación. Luego, determina 
    si un cliente en particular puede realizar una compra con la siguiente información:

Tiene una cuenta activa.
El producto está en stock.
Tiene un método de pago válido registrado.
No ha iniciado sesión.

    */
public static void main(String[] args) {
        boolean p=true;
        boolean q=true;
        boolean r=true;
        boolean s=false;               
        if (p==true && q==true && r==true && s==true ) {
            System.out.println("la persona tiene cuenta activa");      
            System.out.println("el producto esta en stock");
            System.out.println("La persona tiene un metodo valido");
            System.out.println("La persona no ha iniciado sesion");
        }else{
            System.out.println("Compra denegada");          
        }
    }
}
