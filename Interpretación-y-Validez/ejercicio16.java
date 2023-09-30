
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio16 {
    /*
    Conjuntos numéricos: B = {6, 7, 8}. ¿El número 5 no está en el conjunto B?

    */
public static void main(String[] args) {
    Set<Integer> B = new HashSet<>(Arrays.asList(6, 7, 8));
    int numero = 4;
    if (!B.contains(numero)) {
      System.out.println("El número " + numero + " no está en el conjunto B.");
    } else {
      System.out.println("El número " + numero + " está en el conjunto B.");
    }
  }
}
