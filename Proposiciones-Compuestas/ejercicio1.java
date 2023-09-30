
import javax.swing.JOptionPane;

/*
En un videojuego de aventuras, el jugador debe enfrentarse a un dragón y resolver un acertijo para avanzar. El acertijo consiste en tres proposiciones:

P: Si el dragón es amigable, entonces es posible hablar con él.
Q: Si se puede hablar con el dragón, entonces revelará el camino secreto.
R: Si se revela el camino secreto, entonces el jugador podrá avanzar.
Elige valores de verdad para P, Q y R (verdadero o falso) que permitan al jugador avanzar o quedar atrapado. Explica 
la secuencia de razonamiento que lleva al jugador a avanzar o quedarse en su lugar basándose en las proposiciones compuestas.

 */

public class ejercicio1 {

    public static void main(String[] args) {
        String P, Q, R;
        P = JOptionPane.showInputDialog("EL dragon es amigable? si/no");
        if (P.equals("si")) {
            Q = JOptionPane.showInputDialog("Pudo hablar con el dragon? si/no");
            if (Q.equals("si")) {
                R = JOptionPane.showInputDialog("Revelo el camino secreto? si/no");
                if (R.equals("si")) {
                    JOptionPane.showMessageDialog(null, "El jugador puede avanzar");
                } else {
                    JOptionPane.showMessageDialog(null, "El jugador no puede avanzar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "PELIGRO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "PELIGRO");
        }
    }
}
