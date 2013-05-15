package com.prithvid.designpatterns;

/**
 * @author Prithviraj Diddahalli Ramegowda
 *         prithvid.com
 *         5/15/13
 */
public class ProductFactory {


    public Product getProduct(ProductType type) {
        switch (type) {
            case REGULAR:
                return new RegularProduct();

            case TRENDING:
                return new TrendingProduct();

            case LIMITED:
                return new LimitedEdition();

            case DISCOUNTED:
                return new DiscountedProduct();

            default:
                return null;
        }

    }
}
