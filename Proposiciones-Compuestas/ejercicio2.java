
import javax.swing.JOptionPane;


public class ejercicio2 {
   
/*
En una organización, se está planificando un evento importante. Para que el evento sea un éxito, se han establecido las siguientes condiciones:

P: Si se contrata a un buen orador, entonces el evento será interesante.
Q: Si el evento es interesante, entonces habrá una alta asistencia.
R: Si hay una alta asistencia, entonces se obtendrán patrocinadores.
Elige valores de verdad para P, Q y R que permitan que el evento sea un éxito o no. 
    Explora diferentes combinaciones y razona sobre cómo estas condiciones se relacionan para determinar el éxito del evento.

 */

    public static void main(String[] args) {
        String P, Q, R;
        P = JOptionPane.showInputDialog("Se contrato un buen orador? si/no");
        if (P.equals("si")) {
            Q = JOptionPane.showInputDialog("El evento es interesante? si/no");
            if (Q.equals("si")) {
                R = JOptionPane.showInputDialog("Si hay alta asistencia? si/no");
                if (R.equals("si")) {
                    JOptionPane.showMessageDialog(null, "se obtuvieron patrocinadores");
                }           
            }        
        } 
    }
}
