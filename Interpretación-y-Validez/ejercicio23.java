
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio23 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b', 'c', 'd'}. ¿La letra 'd' pertenece al conjunto X?

    */
public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd'));
    if (X.contains('d')) {
      System.out.println("La letra 'd' pertenece al conjunto X");
    } else {
      System.out.println("La letra 'd' no pertenece al conjunto X");
    }
  }
}
