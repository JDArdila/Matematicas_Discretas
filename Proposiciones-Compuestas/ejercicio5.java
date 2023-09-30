
import javax.swing.JOptionPane;


public class ejercicio5 {
    /*
    Supongamos que estás desarrollando un programa de registro para una biblioteca. 
    Para registrarse, un usuario debe cumplir con las siguientes condiciones:

Debe ser mayor de 18 años (P).
Debe tener una dirección de correo electrónico válida (Q).
No debe tener multas pendientes en su cuenta de la biblioteca (R).
Escribe una proposición compuesta que represente las condiciones necesarias para 
    que un usuario pueda registrarse en la biblioteca. Luego, usa esta proposición 
    para determinar si un usuario con las siguientes características puede registrarse:

Edad: 20 años
Dirección de correo electrónico: "usuario@example.com"
Multas pendientes: 0

    */
 public static void main(String[] args) {
        boolean p=true;
        boolean q=true;
        boolean r=true;
        
        
        if (p==true && q==true && r==true) {
            System.out.println("la persona es mayor de edad");      
            System.out.println("La persona tiene correo electronico");
            System.out.println("La persona no tiene multas");
        }else{
            System.out.println("acceso denegado");
            
        }
    }
}
