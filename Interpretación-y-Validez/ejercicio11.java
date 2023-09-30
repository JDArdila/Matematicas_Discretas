
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio11 {
    /*
    Conjuntos alfabéticos: U = {'a', 'b', 'c', 'd', 'e'}, X = {'b', 'c'}. Determina X'.

    */
public static void main(String[] args) {
    Set<Character> U = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
    Set<Character> X = new HashSet<>(Arrays.asList('b', 'c'));
    Set<Character> com = new HashSet<>(U);
    com.removeAll(X);
    System.out.println("El complemento de X es: " + com);
  }
}