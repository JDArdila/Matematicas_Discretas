
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio24 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 4 está en A y la letra 'b' está en X?

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    if (A.contains(4)) {
      System.out.println("El número 4 está en el conjunto A");
    } else {
      System.out.println("El número 4 no está en el conjunto A");
    }
    if (X.contains('b')) {
      System.out.println("La letra 'b' está en el conjunto X");
    } else {
      System.out.println("La letra 'b' no está en el conjunto X");
    }
  }
}
