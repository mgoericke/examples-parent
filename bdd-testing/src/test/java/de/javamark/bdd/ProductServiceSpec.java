package de.javamark.bdd;

import de.javamark.bdd.model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.mock;
import static org.mockito.BDDMockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceSpec {

    private ProductRepository productRepository;
    private ProductService productService;

    @Before
    public void setUp() {
        this.productRepository = mock(ProductRepository.class);
        this.productService = new ProductService(productRepository);
    }

    @Test
    public void givenProductExists_serviceShouldBeAbleToFindTheProduct() {

        // given
        given(productRepository.findByName("Sweeties")).willReturn(new Product("Sweeties", 1.99));

        // then ...
        Assert.assertEquals(productService.getProduct("Sweeties").getName(), "Sweeties");

        // verify (mock).method was invoked
        verify(productRepository).findByName("Sweeties");
    }
}
