package com.prgs.etelco.TelcoECommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prgs.etelco.TelcoECommerce.model.Product;

@Service
public class ProductsService {
	List<Product> list = new ArrayList();

	public List<Product> getProducts() {
		return list;
	}

	public void saveProduct(Product newProduct) {
		list.add(newProduct);
	}

}
