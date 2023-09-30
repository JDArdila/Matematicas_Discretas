
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio30 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b'}. ¿Es A un subconjunto de X?

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b'));
    if (X.containsAll(A)) {
      System.out.println("A es un subconjunto de X");
    } else {
      System.out.println("A no es un subconjunto de X");
    }
  }
}
