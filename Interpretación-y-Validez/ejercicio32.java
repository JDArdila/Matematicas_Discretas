
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio32 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b'}, Y = {'a', 'b', 'c'}. ¿Es X un subconjunto propio de Y?
    */
public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b'));
    Set<Character> Y = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    if (Y.containsAll(X) && !X.equals(Y)) {
      System.out.println("X es un subconjunto propio de Y");
    } else {
      System.out.println("X no es un subconjunto propio de Y");
    }
  }
}
