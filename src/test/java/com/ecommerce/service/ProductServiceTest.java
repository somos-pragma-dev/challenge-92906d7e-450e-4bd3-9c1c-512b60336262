package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllProducts() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(100.0);
        when(productRepository.findAll()).thenReturn(Arrays.asList(product));
        List<Product> products = productService.getAllProducts();
        assertEquals(1, products.size());
    }

    @Test
    void createProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(100.0);
        when(productRepository.save(product)).thenReturn(product);
        Product createdProduct = productService.createProduct(product);
        assertNotNull(createdProduct);
        assertEquals("Test Product", createdProduct.getName());
    }

    @Test
    void getProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(100.0);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        Product foundProduct = productService.getProductById(1L);
        assertNotNull(foundProduct);
        assertEquals("Test Product", foundProduct.getName());
    }

    @Test
    void updateProduct() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(100.0);
        when(productRepository.existsById(1L)).thenReturn(true);
        when(productRepository.save(product)).thenReturn(product);
        Product updatedProduct = productService.updateProduct(1L, product);
        assertNotNull(updatedProduct);
        assertEquals("Test Product", updatedProduct.getName());
    }

    @Test
    void deleteProduct() {
        doNothing().when(productRepository).deleteById(1L);
        productService.deleteProduct(1L);
        verify(productRepository, times(1)).deleteById(1L);
    }
}