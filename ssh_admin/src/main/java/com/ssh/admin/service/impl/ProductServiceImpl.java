package com.ssh.admin.service.impl;

import com.ssh.admin.dao.ProductDao;
import com.ssh.admin.model.Product;
import com.ssh.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProduct(Product product) {

        productDao.saveProduct(product);

    }

}