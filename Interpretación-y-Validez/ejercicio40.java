import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ejercicio40 {
    /*
Dado el conjunto A = {1, 2, 3}, encuentra el conjunto potencia de A (todos los subconjuntos posibles de A).
    */
public static void main(String[] args) {
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Set<Integer>> powerSet = new HashSet<>();
    powerSet.add(new HashSet<>());
    for (Integer element : A) {
      Set<Set<Integer>> newSets = new HashSet<>();
      for (Set<Integer> subset : powerSet) {
        Set<Integer> newSubset = new HashSet<>(subset);
        newSubset.add(element);
        newSets.add(newSubset);
      }
      powerSet.addAll(newSets);
    }
    System.out.println("Conjunto potencia de A: " + powerSet);
  }
}
