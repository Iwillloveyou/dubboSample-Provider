package com.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.product.domain.Product;
import com.product.mapper.ProductMapper;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper productMapper;
	
	
	@Override
	public List<Product> getProducts() {
		List<Product> listProduct = productMapper.getProducts();
		return listProduct;
	}

}
