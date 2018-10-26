package com.ssh.data.dao.impl;


import com.ssh.data.dao.IProductDao;
import com.ssh.data.entity.Product;
import com.ssh.data.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 商品信息-服务层实现
 *
 */

public class ProductDaoImpl implements IProductDao {


    public void saveProduct(Product product) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.persist(product);
        trans.commit();
        session.close();

    }

}