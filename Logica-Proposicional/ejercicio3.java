
public class ejercicio3 {

    /*
    p: 8 es un número par.
q: 9 es un número impar.
Determine si las siguientes proposiciones son verdaderas, falsas o contradictorias:
a) p ∨ q
b) p ∧ q

     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean resultado1 = p || q;
        boolean resultado2 = p && q;
        System.out.println("p || q=" + resultado1);
        System.out.println("p && q=" + resultado2);

    }
}
