package com.ssh.data.service.impl;


import com.ssh.data.dao.IProductDao;
import com.ssh.data.dao.impl.ProductDaoImpl;
import com.ssh.data.entity.Product;
import com.ssh.data.service.IProductService;

public class ProductServiceImpl implements IProductService {

    private IProductDao productDao ;// = new ProductDaoImpl();

    @Override
    public void saveProduct(Product product) {

        productDao.saveProduct(product);

    }

}