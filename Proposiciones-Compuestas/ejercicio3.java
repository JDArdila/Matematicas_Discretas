
import javax.swing.JOptionPane;

public class ejercicio3 {

    /*

En una red de computadoras, se están implementando medidas de seguridad. Se han establecido las siguientes condiciones:

P: Si un usuario tiene acceso a los servidores internos, entonces debe tener autenticación de dos factores.
Q: Si un usuario tiene autenticación de dos factores, entonces tiene acceso a ciertos recursos confidenciales.
R: Si un usuario tiene acceso a ciertos recursos confidenciales, entonces se registra su actividad.
Elige valores de verdad para P, Q y R que permitan un sistema seguro o no. Investiga cómo estas condiciones interactúan para garantizar la seguridad en la red de computadoras.

     */

    public static void main(String[] args) {
        String P, Q, R;
        P = JOptionPane.showInputDialog("un usuario tiene acceso a los servidores internos? si/no");
        if (P.equals("si")) {
            Q = JOptionPane.showInputDialog("tiene autenticación de dos factores? si/no");
            if (Q.equals("si")) {
                R = JOptionPane.showInputDialog("tiene acceso a ciertos recursos confidenciales? si/no");
                if (R.equals("si")) {
                    JOptionPane.showMessageDialog(null, "se registro su actividad");
                }
            }
        }
    }
}
