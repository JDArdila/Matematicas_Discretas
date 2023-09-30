
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio20 {
    /*
    Conjuntos alfabéticos: U = {'a', 'b', 'c', 'd', 'e'}, X = {'b', 'c'}. Determina X'.
    */
 public static void main(String[] args) {
    Set<Character> U = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
    Set<Character> X = new HashSet<>(Arrays.asList('b', 'c'));
    Set<Character> complementoX = new HashSet<>(U);
    complementoX.removeAll(X);
    System.out.println("El complemento de X es: " + complementoX);
  }
}
