
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio17 {
    /*
    Conjuntos alfabéticos: Y = {'x', 'y', 'z'}. ¿La letra 'a' no pertenece al conjunto Y?

    */
public static void main(String[] args) {
    Set<Character> Y = new HashSet<>(Arrays.asList('x', 'y', 'z'));
    char letra = 'a';
    if (!Y.contains(letra)) {
      System.out.println("La letra " + letra + " no pertenece al conjunto Y.");
    } else {
      System.out.println("La letra " + letra + " pertenece al conjunto Y.");
    }
  }
}
