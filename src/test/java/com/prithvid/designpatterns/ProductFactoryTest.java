package com.prithvid.designpatterns;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * @author Prithviraj Diddahalli Ramegowda
 *         prithvid.com
 *         5/15/13
 */
public class ProductFactoryTest {
    @Test
    public void testGetProduct() throws Exception {
        ProductFactory productFactory = new ProductFactory();

        final Product product = productFactory.getProduct(ProductType.DISCOUNTED);
        assertSame(product.getName(), "Discounted Product");

    }
}
