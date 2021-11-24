package java_yourself;
/**
 * Scrieti intr-o clasa numita TestBA5 o metoda care primeste ca parametru un sir de numere si returneaza produsul
 * numerelor nenule din sir. Daca sirul e gol metoda va returna 1. Daca sirul are doar elemente cu valoarea 0 metoda va returna 1.
 */
public class NonZeroNumbersProduct {
    public static void main(String[] args) {
        int[] sir = new int[]{0,0,0};
        System.out.println(product(sir));

    }

    public static int product(int[] sir) {
        int product = 1;
        for(int i = 0; i < sir.length; i++) {
            if(sir[i] != 0) {
                product = product * sir[i];
            }
        }
        return product;
    }
}
