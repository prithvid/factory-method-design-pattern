package com.prithvid.designpatterns;

import java.math.BigDecimal;

/**
 * @author Prithviraj Diddahalli Ramegowda
 *         prithvid.com
 *         5/15/13
 */
public class DiscountedProduct implements Product {
    @Override
    public String getName() {
        return "Discounted Product";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(2.99);
    }
}
