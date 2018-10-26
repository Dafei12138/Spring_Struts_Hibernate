package com.ssh.data.dao;

import com.ssh.data.entity.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface IProductDao {

    void saveProduct(Product product);

}