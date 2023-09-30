
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio9 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Determina A - X.

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    Set<Integer> diferencia = new HashSet<>(A);
    for (Character c : X) {
      diferencia.remove((int) c);
    }
    System.out.println("La diferencia de los conjuntos A y X es: " + diferencia);
  }
}