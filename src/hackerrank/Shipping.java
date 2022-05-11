package hackerrank;

public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        if (items < 5 && availableSmallPackages < items) {
            return -1;
        }
        if (items < 5) {
            return items;
        }
        int minNumberOfPackages = 0;
        while (items >= 5 && availableLargePackages > 0) {
            items = items - 5;
            availableLargePackages--;
            minNumberOfPackages++;
        }
        if (items > availableSmallPackages) {
            return -1;
        } else {
            minNumberOfPackages += items;
            return minNumberOfPackages;
        }
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(4, 2, 5));
    }
}
