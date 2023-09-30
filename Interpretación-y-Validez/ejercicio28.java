
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio28 {
    /*
    Conjuntos numéricos: A = {1, 2}, B = {1, 2, 3, 4}. ¿Es A un subconjunto de B?

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2));
    Set<Integer> B = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    if (B.containsAll(A)) {
      System.out.println("A es un subconjunto de B");
    } else {
      System.out.println("A no es un subconjunto de B");
    }
  }
}
