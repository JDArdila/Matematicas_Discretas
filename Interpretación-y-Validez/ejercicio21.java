
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio21 {
    /*
    Combinado: U = {1, 2, 3, 4, 5}, X = {'a', 'b', 'c'}. Calcula X'.
    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    Set<Integer> com = new HashSet<>();
    for (int i : U) {
      if (!X.contains((char) i)) {
        com.add(i);
      }
    }
    System.out.println("El complemento de X es: " + com);
  }
}
