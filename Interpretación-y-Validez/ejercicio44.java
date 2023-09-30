import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio44 {
        /*
    Dados los conjuntos A = {1, 2, 3} y B = {2, 3, 4}, encuentra el resultado de la siguiente expresión:
A ∩ (B ∪ {5, 6})

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> B = new HashSet<>(Arrays.asList(2, 3, 4));
    Set<Integer> C = new HashSet<>(Arrays.asList(5, 6));
    Set<Integer> union = new HashSet<>(B);
    union.addAll(C);
    Set<Integer> intersection = new HashSet<>(A);
    intersection.retainAll(union);
    System.out.println("Intersección entre A y la unión de B y C: " + intersection);
  }
}
