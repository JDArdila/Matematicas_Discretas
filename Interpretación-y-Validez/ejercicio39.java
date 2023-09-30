import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio39 {
    /*
Usando los conjuntos A = {1, 2, 3, 4} y B = {3, 4, 5, 6}, encuentra el complemento de la unión de los complementos de A y B.
(A' ∩ B')'

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6));
    Set<Integer> complementA = new HashSet<>(U);
    complementA.removeAll(A);
    Set<Integer> complementB = new HashSet<>(U);
    complementB.removeAll(B);
    Set<Integer> unionComplements = new HashSet<>(complementA);
    unionComplements.addAll(complementB);
    Set<Integer> result = new HashSet<>(U);
    result.removeAll(unionComplements);
    System.out.println("Complemento de la unión de los complementos de A y B: " + result);
  }
}
