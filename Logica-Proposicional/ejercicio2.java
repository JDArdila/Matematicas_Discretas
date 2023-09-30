
public class ejercicio2 {
   /*
    p: 3 es un número impar.
q: 6 es divisible por 3.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p ∨ q
b) ¬p
     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean resultado1 = p || q;
        boolean resultado2 = !p;
        System.out.println("p || q=" + resultado1);
        System.out.println("!p=" + resultado2);

    }
}
