
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ejercicio22 {
    /*
    Conjuntos numéricos: A = {1, 2, 3, 4, 5}. ¿El número 3 está en el conjunto A?

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    if (A.contains(3)) {
      System.out.println("El número 3 está en el conjunto A");
    } else {
      System.out.println("El número 3 no está en el conjunto A");
    }
  }
}