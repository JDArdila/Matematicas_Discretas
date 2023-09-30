import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio45 {
        /*
    Si A es un subconjunto de un conjunto universal U, encuentra la diferencia entre A y el complemento de A.
A – A’

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> complementA = new HashSet<>(U);
    complementA.removeAll(A);
    Set<Integer> difference = new HashSet<>(A);
    difference.retainAll(complementA);
    System.out.println("Diferencia entre A y el complemento de A: " + difference);
  }
}
