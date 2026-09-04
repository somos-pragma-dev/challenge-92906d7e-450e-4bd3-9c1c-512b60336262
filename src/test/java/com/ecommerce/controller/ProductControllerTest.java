package com.ecommerce.controller;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Collections;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void getAllProducts() throws Exception {
        Mockito.when(productService.getAllProducts(Mockito.any())).thenReturn(Collections.emptyList());
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void getProductById() throws Exception {
        ProductDTO productDTO = new ProductDTO(1L, "Product 1", 10.0);
        Mockito.when(productService.getProductById(Mockito.anyLong())).thenReturn(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/1"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createProduct() throws Exception {
        ProductDTO productDTO = new ProductDTO(null, "Product 1", 10.0);
        Mockito.when(productService.createProduct(Mockito.any())).thenReturn(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
               .contentType("application/json")
               .content("{\"name\":\"Product 1\",\"price\":10.0}"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}