package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;
/*
box class implement ProductPrice in a different way because it is the composite class where
we can find inside it another box or maybe product
 */
public class Box implements ProductPrice{
   private List<ProductPrice> productPrices = new ArrayList<>();

    public void addProduct(ProductPrice productPrice)
    {
        productPrices.add(productPrice);
    }

    public void removeProduct(ProductPrice productPrice)
    {
        productPrices.remove(productPrice);
    }

    @Override
    public void showProductPrice() {
        for(int i = 0;i<productPrices.size();i++)
        {
            productPrices.get(i).showProductPrice();
        }
    }
}
