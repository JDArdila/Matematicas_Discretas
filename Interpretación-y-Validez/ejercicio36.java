import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio36 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b'}. ¿Es A un subconjunto propio de X?

    */
public static void main(String[] args) {
    Set<Integer> U = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Character> V = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    System.out.println("Conjunto universal U: " + U);
    System.out.println("Conjunto V: " + V);
    System.out.println("Conjunto A: " + A);
    System.out.println("Conjunto X: " + X);
  }
}
