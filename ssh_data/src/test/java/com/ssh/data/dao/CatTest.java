package com.ssh.data.dao;

import com.ssh.data.entity.Cat;
import com.ssh.data.service.ICatService;
import com.ssh.data.service.impl.CatServiceImpl;
import com.ssh.data.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class CatTest {

    private static ICatService catService = new CatServiceImpl();

    @Test
    public void testAdd() {
        Cat mother = new Cat();
        mother.setName("mother");
        mother.setDescription("the mother cat");
        mother.setCrateDate(new Date());

        Cat kitty = new Cat();
        kitty.setName("kitty");
        kitty.setCrateDate(new Date());
        kitty.setDescription("son of cat");
        kitty.setMother(mother);

        Cat miny = new Cat();
        miny.setName("kitty");
        miny.setCrateDate(new Date());
        miny.setDescription("daugter of cat");
        miny.setMother(mother);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        session.persist(mother);
        session.persist(kitty);
        session.persist(miny);

        List<Cat> catList = session.createQuery(" from Cat").list();

        for(Cat cat:catList){
            System.out.println(cat);
        }

        trans.commit();
        session.close();
    }

    @Test
    public void find() {
//        ICatService catService = new CatServiceImpl();

        String name = catService.findNameById(1);
        System.out.println("mingzi" + name);
    }
}
