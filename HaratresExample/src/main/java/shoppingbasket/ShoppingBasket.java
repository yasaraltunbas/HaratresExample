package shoppingbasket;

import java.util.*;

public class ShoppingBasket {


    private List<Integer> nonDiscountProduct = new ArrayList();
    public int calculatePrice(int[] basket) throws Exception {

        int total = 0;
        try {
            validateBasket(basket);
            for (int i = 0; i < basket.length; i++) {
                total += basket[i];

                if (i + 1 < basket.length && basket[i] > basket[i + 1]) {
                    total -= basket[i + 1];
                }
                else {
                    nonDiscountProduct.add(basket[i]);
                }
            }
            Collections.sort(nonDiscountProduct);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return total;

    }

    public List<Integer> getNonDiscountProduct() {
        return nonDiscountProduct;
    }

    public void validateBasket(int[] basket) throws Exception {
        for (int i = 0; i < basket.length; i++) {

            if (basket[i] <= 0 || basket[i] >= 2000) {
                throw new Exception();
            }
        }

        if (basket.length <= 1 || basket.length >= 100) {
            throw new Exception();
        }

    }
}
