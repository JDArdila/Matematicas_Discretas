import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio38 {
    /*
Dados los conjuntos A = {1, 2, 3, 4, 5} y B = {4, 5, 6, 7, 8}, encuentra la diferencia simétrica entre A y B.
A △ B

    */
 public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> B = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> symmetricDifference = new HashSet<>(A);
    symmetricDifference.addAll(B);
    Set<Integer> tmp = new HashSet<>(A);
    tmp.retainAll(B);
    symmetricDifference.removeAll(tmp);
    System.out.println("Diferencia simétrica entre A y B: " + symmetricDifference);
  }
}
