
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio5 {
    /*
    Conjuntos alfabéticos: X = {'a', 'b', 'c'}, Y = {'b', 'c', 'd'}. Determina X ∩ Y.

    */
public static void main(String[] args) {
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    Set<Character> Y = new HashSet<>(Arrays.asList('b', 'c', 'd'));
    Set<Character> interseccion = new HashSet<>(X);
    interseccion.retainAll(Y);
    System.out.println("La intersección de los conjuntos X e Y es: " + interseccion);
  }
}