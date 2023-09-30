import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio43 {
        /*
    Dados los conjuntos A = {1, 2, 3, 4} y B = {3, 4, 5, 6}, encuentra el complemento de la unión de A y B.
(A ∪ B)'

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6));
    Set<Integer> union = new HashSet<>(A);
    union.addAll(B);
    Set<Integer> complement = new HashSet<>(U);
    complement.removeAll(union);
    System.out.println("Complemento de la unión de A y B: " + complement);
  }
}
