
public class ejercicio11 {
        /*
p: Todos los pájaros vuelan.
q: Los pingüinos son pájaros que no vuelan.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p → q
b) ¬p
     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean resultado1 = !p || q;
        boolean resultado2 = !p;
        System.out.println("!p || q=" + resultado1);
        System.out.println("!p=" + resultado2);

    }
}