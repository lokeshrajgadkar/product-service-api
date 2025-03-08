package io.lunarshade.product_service_api.controller;

import io.lunarshade.product_service_api.api.ProductAPI;
import io.lunarshade.product_service_api.model.ProductRequest;
import io.lunarshade.product_service_api.model.ProductResponse;
import io.lunarshade.product_service_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductAPI {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<Long> addProduct(ProductRequest productRequest) {
        long productId = productService.addProduct(productRequest);

        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ProductResponse> getProductById(long productId) {
        ProductResponse productResponse = productService.getProductById(productId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
}
