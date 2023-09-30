import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio46 {
        /*
    Si el conjunto universal es U = {a, b, c, d, e}, encuentra el complemento de U.
U'

    */
 public static void main(String[] args) {
    Set<String> U = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
    Set<String> complementU = new HashSet<>(U);
    complementU.removeAll(U);
    System.out.println("Complemento de U: " + complementU);
  }
}
