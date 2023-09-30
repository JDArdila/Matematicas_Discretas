import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio41 {
        /*
    Si A es un subconjunto de un conjunto universal U, encuentra el complemento del complemento de A.
(A')’

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> complementA = new HashSet<>(U);
    complementA.removeAll(A);
    Set<Integer> complementComplementA = new HashSet<>(U);
    complementComplementA.removeAll(complementA);
    System.out.println("Complemento del complemento de A: " + complementComplementA);
  }
}
