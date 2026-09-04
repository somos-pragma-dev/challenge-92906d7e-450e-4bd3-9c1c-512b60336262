package com.ecommerce.service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.Collections;
import java.util.Optional;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    private Product product;
    private ProductDTO productDTO;

    @BeforeEach
    void setUp() {
        product = new Product(1L, "Product 1", 10.0);
        productDTO = new ProductDTO(1L, "Product 1", 10.0);
    }

    @Test
    void getAllProducts() {
        Mockito.when(productRepository.findAll(Mockito.any())).thenReturn(Collections.singletonList(product));
        Page<Product> productPage = new PageImpl<>(Collections.singletonList(product));
        Mockito.when(productRepository.findAll(Mockito.any())).thenReturn(productPage);
        Page<ProductDTO> result = productService.getAllProducts(Mockito.any());
        Mockito.verify(productRepository).findAll(Mockito.any());
        Mockito.verifyNoMoreInteractions(productRepository);
    }

    @Test
    void getProductById() {
        Mockito.when(productRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(product));
        ProductDTO result = productService.getProductById(Mockito.anyLong());
        Mockito.verify(productRepository).findById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(productRepository);
    }

    @Test
    void createProduct() {
        Mockito.when(productRepository.save(Mockito.any())).thenReturn(product);
        ProductDTO result = productService.createProduct(Mockito.any());
        Mockito.verify(productRepository).save(Mockito.any());
        Mockito.verifyNoMoreInteractions(productRepository);
    }
}