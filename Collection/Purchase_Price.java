// Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price

package String_Manipulation;

public class Purchase_Price {
    public static void main(String[] args) {
        int laptopPrice = 76000;
        double discountPrice = laptopPrice * 0.10;
        int purchasePrice = laptopPrice - (int)discountPrice;

        System.out.println("Purchase price: " + purchasePrice);
    }
}
