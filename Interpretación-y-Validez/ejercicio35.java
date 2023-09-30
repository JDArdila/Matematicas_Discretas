import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio35 {
    /*
Conjuntos alfabéticos: Utilizando el conjunto universal V = {'a', 'b', 'c', 'd', 'e'}, encuentra el conjunto X = {'b', 'c', 'd'}.


    */
public static void main(String[] args) {
    Set<Character> V = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
    Set<Character> X = new HashSet<>(Arrays.asList('b', 'c', 'd'));
    System.out.println("Conjunto universal V: " + V);
    System.out.println("Conjunto X: " + X);
  }
}
