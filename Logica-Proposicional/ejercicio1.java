
public class ejercicio1 {

    /*
    p: Los números enteros son racionales.
q: 2 + 2 = 4.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p → q
b) p ∧ q
     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;
        boolean resultado1 = p && q;
        boolean resultado2 = !p || q;
        System.out.println("p&&q= " + resultado1);
        System.out.println("!p||q= " + resultado2);
    }
}
