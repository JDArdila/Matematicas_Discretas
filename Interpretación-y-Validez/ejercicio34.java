import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio34 {
    /*
 Conjuntos numéricos: Utilizando el conjunto universal U = {1, 2, 3, 4, 5}, encuentra el conjunto A = {2, 4}.


    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> A = new HashSet<>(Arrays.asList(2, 4));
    System.out.println("Conjunto universal U: " + U);
    System.out.println("Conjunto A: " + A);
  }
}
