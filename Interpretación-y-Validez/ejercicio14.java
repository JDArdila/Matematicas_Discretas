
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio14 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b', 'c', 'd'}. ¿La letra 'd' pertenece al conjunto X?

    */
public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd'));
    char letra = 'd';
    if (X.contains(letra)) {
      System.out.println("La letra " + letra + " pertenece al conjunto X.");
    } else {
      System.out.println("La letra " + letra + " no pertenece al conjunto X.");
    }
  }
}
