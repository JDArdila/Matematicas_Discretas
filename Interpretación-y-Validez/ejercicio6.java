
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio6 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Calcula A ∩ X.

    */
    public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    Set<Object> interseccion = new HashSet<>(A);
    interseccion.retainAll(X);
    System.out.println("La intersección de los conjuntos A y X es: " + interseccion);
  }
}