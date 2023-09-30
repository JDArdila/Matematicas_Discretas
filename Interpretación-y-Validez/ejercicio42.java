import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio42 {
    /*
    Dados los conjuntos A = {1, 2, 3, 4, 5} y B = {3, 4, 5, 6, 7}, encuentra la intersección entre los conjuntos complementarios de A y B.
(A' ∩ B')

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
    Set<Integer> complementA = new HashSet<>(U);
    complementA.removeAll(A);
    Set<Integer> complementB = new HashSet<>(U);
    complementB.removeAll(B);
    Set<Integer> intersection = new HashSet<>(complementA);
    intersection.retainAll(complementB);
    System.out.println("Intersección entre los conjuntos complementarios de A y B: " + intersection);
  }
}


