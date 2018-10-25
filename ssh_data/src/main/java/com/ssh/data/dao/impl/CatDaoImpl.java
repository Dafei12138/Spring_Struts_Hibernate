package com.ssh.data.dao.impl;

import com.ssh.data.dao.ICatDao;
import com.ssh.data.entity.Cat;
import com.ssh.data.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CatDaoImpl implements ICatDao{

   public Cat findCatById(Integer id){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction trans = session.beginTransaction();
       Cat cat = session.get(Cat.class , id);
       trans.commit();
       session.close();
       return cat;
   }

}
