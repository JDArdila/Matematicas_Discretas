
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio19 {
        /*
    Conjuntos numéricos: U = {1, 2, 3, 4, 5}, A = {3, 4}. Encuentra A'.
    */    
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5));
    Set<Integer> union = new HashSet<>(A);
    union.addAll(B);
    System.out.println("La unión de los conjuntos A y B es: " + union);
  }
}
