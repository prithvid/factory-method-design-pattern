package com.prithvid.designpatterns;

import java.math.BigDecimal;

/**
 * @author Prithviraj Diddahalli Ramegowda
 *         prithvid.com
 *         5/15/13
 */
public class RegularProduct implements Product {
    @Override
    public String getName() {
        return "Regular Product";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(9.99);
    }
}
