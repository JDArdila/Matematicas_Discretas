
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio8 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b', 'c', 'd'}, Y = {'b', 'c'}. Calcula X \ Y.

    */
    public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd'));
    Set<Character> Y = new HashSet<>(Arrays.asList('b', 'c'));
    Set<Character> diferencia = new HashSet<>(X);
    diferencia.removeAll(Y);
    System.out.println("La diferencia de los conjuntos X e Y es: " + diferencia);
  }
}