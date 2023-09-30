
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio26 {
    /*
    Conjuntos alfabéticos: Y = {'x', 'y', 'z'}. ¿La letra 'a' no pertenece al conjunto Y?

    */
 public static void main(String[] args) {
    Set<Character> Y = new HashSet<>(Arrays.asList('x', 'y', 'z'));
    if (Y.contains('a')) {
      System.out.println("La letra 'a' pertenece al conjunto Y");
    } else {
      System.out.println("La letra 'a' no pertenece al conjunto Y");
    }
  }
}
