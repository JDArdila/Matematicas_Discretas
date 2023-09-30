
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio25 {
    /*
    Conjuntos numéricos: B = {6, 7, 8}. ¿El número 5 no está en el conjunto B?

    */
public static void main(String[] args) {
    Set<Integer> B = new HashSet<>(Arrays.asList(6, 7, 8));
    if (B.contains(5)) {
      System.out.println("El número 5 está en el conjunto B");
    } else {
      System.out.println("El número 5 no está en el conjunto B");
    }
  }
}
