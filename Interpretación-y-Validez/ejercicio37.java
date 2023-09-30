import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio37 {
    /*
Dados los conjuntos A = {1, 2, 3, 4}, B = {3, 4, 5}, C = {2, 4, 6}, y D = {5, 6, 7}, encuentra el resultado de la siguiente expresión:
(A ∪ B) ∩ (C ∪ D)

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5));
    Set<Integer> C = new HashSet<>(Arrays.asList(2, 4, 6));
    Set<Integer> D = new HashSet<>(Arrays.asList(5, 6, 7));
    Set<Integer> unionAB = new HashSet<>(A);
    unionAB.addAll(B);
    Set<Integer> unionCD = new HashSet<>(C);
    unionCD.addAll(D);
    Set<Integer> result = new HashSet<>(unionAB);
    result.retainAll(unionCD);
    System.out.println("Resultado: " + result);
  }
}