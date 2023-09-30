    
public class ejercicio10 {
        /*
p: Los números negativos son irracionales.
q: 1 + 1 = 2.
Determine si las siguientes proposiciones son verdaderas, falsas o contradictorias:
a) p ∧ q
b) ¬(p ∧ q)
     */
    public static void main(String[] args) {
        boolean p = false;
        boolean q = true;
        boolean resultado1 = p && q;
        boolean resultado2 = !(p && q);
        System.out.println("p && q=" + resultado1);
        System.out.println("!(p && q)=" + resultado2);

    }
}