package com.product.service.biz;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.ProductApi;
import com.product.api.domain.ProductDTO;
import com.product.domain.Product;
import com.product.service.ProductService;

@Service
public class ProductBiz implements ProductApi {

	private Logger logger = LoggerFactory.getLogger(ProductBiz.class);
	
	@Autowired
	private ProductService productService;
	
	@Override
	public List<ProductDTO> getProducts() {
		List<Product> listProducts = productService.getProducts();
		List<ProductDTO> listProductsDto = new ArrayList<ProductDTO>();
		for(Product item: listProducts){
			ProductDTO productDto = new ProductDTO();
			productDto.setProId(item.getProId());
			productDto.setProName(item.getProName());
			productDto.setProPrice(item.getProPrice());
			productDto.setProNum(item.getProNum());
			listProductsDto.add(productDto);
		}
		return listProductsDto;
	}

}
