
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio18 {
    /*
    Combinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 5 no está en A y la letra 'x' no pertenece a X?

    */
  public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Character> X = new HashSet<>(Arrays.asList('a', 'b', 'c'));
    int numero = 5;
    char letra = 'x';
    if (!A.contains(numero)) {
      System.out.println("El número " + numero + " no está en el conjunto A.");
    } else {
      System.out.println("El número " + numero + " está en el conjunto A.");
    }
    if (!X.contains(letra)) {
      System.out.println("La letra " + letra + " no pertenece al conjunto X.");
    } else {
      System.out.println("La letra " + letra + " pertenece al conjunto X.");
    }
  }
}
