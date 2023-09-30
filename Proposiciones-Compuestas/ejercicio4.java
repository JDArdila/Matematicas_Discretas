
import javax.swing.JOptionPane;


public class ejercicio4 {
/*
    Diseña un sistema de control de acceso que determine si un usuario puede 
    acceder a un sistema en función de múltiples condiciones. Debes usar proposiciones 
    compuestas y Java para implementar este sistema. Por ejemplo:

Un usuario puede acceder si tiene credenciales de administrador (credencialesAdmin) 
    Y si su dirección IP está en la lista de IP permitidas (ipPermitida).
Además, si el usuario es un empleado temporal (esTemporal) o es un administrador, 
    puede acceder sin importar su dirección IP.

    */
    public static void main(String[] args) {
        String CredencialesAdministrador, ipPermitida,esTemporal;
        
        esTemporal = JOptionPane.showInputDialog("el usuario es temporal? si/no");
        if (esTemporal.equals("si")) {
            JOptionPane.showMessageDialog(null, "Acceso concedido, puede acceder sin ip");
        }else{
        CredencialesAdministrador = JOptionPane.showInputDialog("tiene credenciales de administrador? si/no");
        ipPermitida = JOptionPane.showInputDialog("¿Su ip se encuentra en la lista de direcciones permitidas? si/no");
        if (CredencialesAdministrador.equals("si") && ipPermitida.equals("si")) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        }else{
            JOptionPane.showMessageDialog(null,"Acceso denegado");
        }
        }
    }
}
