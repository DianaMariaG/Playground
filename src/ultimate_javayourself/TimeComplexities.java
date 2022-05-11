package ultimate_javayourself;

public class TimeComplexities {
    /**
     * public class Main {
     *
     *     public static void main(String[] args) {//O(n+1+1+3n+1)->O(4n+3)->O(n)
     * 	    //Complexitati timp
     *         //n-> lungimea sirului
     *         //O-> notatie pentru cel mai rau caz
     *         int[] arr={3,5,1,2,4};//O(n)
     *         int s=0;//O(1)
     *         int i=0;//O(1)
     *         while(i<arr.length){//O(3*n)
     *             s+=arr[i];//O(1)
     *             i++;//O(1)
     *         }
     *         System.out.println(s);//O(1)
     *     }
     * }
     *   public static void main(String[] args) {//O(n^2)
     * 	    //bubble sort
     *         //reguli simplificare:
     *         //  -scoatem constantele
     *         //  - + e o operatie ce alege functia ce merge mai repede catre infinit
     *         int[] arr={6,3,7,1,9};//O(n)
     *
     *         for(int i=0;i<arr.length;i++)//O(2n+1+n^2)->O(n+n^2)->O(n^2)
     *             for(int j=i+1;j<arr.length;j++)//O(6n+1)->O(n)
     *                 if(arr[i]>arr[j]){//O(1)
     *                     int aux=arr[i];//O(1)
     *                     arr[i]=ar
     * 	    //O(1)->timp constant->formule
     *         //O(logn)->timp logaritmic->cautarea binara
     *         //O(n)-> timp liniar -> suma numerelor dintr-un sir; cautare liniara
     *         //O(n*logn)-> timp log-liniar -> sortarile eficient
     *         //O(n^2)-> timp patratic -> sortarile ineficiente, suma numerelor dintr-o matrice
     *         //O(n^k)-> timp polinomial
     *         //O(2^n) -> timp exponential -> fibonacci recursiv ineficient
     *         //O(n!)-> timp factorial -> backtracking
     *         //12 10 8 5 2
     *         //O(n^3)
     *         //O(n*logn+n^2*logn)->O(n^2*logn)
     *
     *         /O(1)->spatiu constant->doar variabile, fara siruri
     *         //O(n)-> spatiu liniar -> sir de o dimensiune, liste
     *         //O(n^2)-> spatiu patratic -> matrici, siruri bidimensionala, liste de liste
     *         //O(n^k)-> spatiu polinomial -> liste de dimensiune k,siruri de dimensiune k
     *
     */
}
