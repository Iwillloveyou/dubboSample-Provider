package com.product.api;

import java.util.List;

import com.product.api.domain.ProductDTO;

public interface ProductApi {

	List<ProductDTO> getProducts();
}
