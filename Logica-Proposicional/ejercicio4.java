
public class ejercicio4 {
     /*
    4:
p: 20 es divisible por 5.
q: 7 es un número primo.
Determine si las siguientes proposiciones son verdaderas, falsas o contradictorias:
a) p → q
b) p ∧ ¬q

     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean resultado1 = !p || q;
        boolean resultado2 = p && !q;
        System.out.println("!p || q=" + resultado1);
        System.out.println("p && !q=" + resultado2);

    }
}
