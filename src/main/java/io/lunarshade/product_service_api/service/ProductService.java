package io.lunarshade.product_service_api.service;

import io.lunarshade.product_service_api.model.ProductRequest;
import io.lunarshade.product_service_api.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
