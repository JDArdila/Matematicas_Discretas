
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio15 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 4 está en A y la letra 'b' está en X?

    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    int numero = 4;
    char letra = 'b';
    if (A.contains(numero)) {
      System.out.println("El número " + numero + " está en el conjunto A.");
    } else {
      System.out.println("El número " + numero + " no está en el conjunto A.");
    }
    if (X.contains(letra)) {
      System.out.println("La letra " + letra + " está en el conjunto X.");
    } else {
      System.out.println("La letra " + letra + " no está en el conjunto X.");
    }
  }
}
