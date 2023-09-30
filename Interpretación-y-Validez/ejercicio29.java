
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio29 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b'}, Y = {'a', 'b', 'c'}. ¿Es X un subconjunto de Y?

    */
public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b'));
    Set<Character> Y = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    if (Y.containsAll(X)) {
      System.out.println("X es un subconjunto de Y");
    } else {
      System.out.println("X no es un subconjunto de Y");
    }
  }
}
