
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio27 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 5 no está en A y la letra 'x' no pertenece a X?

    */
 public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    if (!A.contains(5)) {
      System.out.println("El número 5 no está en el conjunto A");
    } else {
      System.out.println("El número 5 está en el conjunto A");
    }
    if (!X.contains('x')) {
      System.out.println("La letra 'x' no pertenece al conjunto X");
    } else {
      System.out.println("La letra 'x' pertenece al conjunto X");
    }
  }
}
