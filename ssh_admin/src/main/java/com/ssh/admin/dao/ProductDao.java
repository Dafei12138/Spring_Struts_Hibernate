package com.ssh.admin.dao;

import com.ssh.admin.model.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {

    void saveProduct(Product product);

}