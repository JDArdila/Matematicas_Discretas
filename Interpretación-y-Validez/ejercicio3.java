
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio3 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Calcula A ∪ X.

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    Set<Object> union = new HashSet<>();
    union.addAll(A);
    union.addAll(X);
    System.out.println("La unión de los conjuntos A y X es: " + union);
  }
}