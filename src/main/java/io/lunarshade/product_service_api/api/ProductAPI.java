package io.lunarshade.product_service_api.api;

import io.lunarshade.product_service_api.model.ProductRequest;
import io.lunarshade.product_service_api.model.ProductResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/product")
@OpenAPIDefinition(info = @Info(title = "Product Service API", description = "This is an Product Service API to manage the products"))
public interface ProductAPI {

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest);

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("productId") long productId);

}
