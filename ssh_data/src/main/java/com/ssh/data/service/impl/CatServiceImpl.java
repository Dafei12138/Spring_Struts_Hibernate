package com.ssh.data.service.impl;

import com.ssh.data.dao.ICatDao;
import com.ssh.data.dao.impl.CatDaoImpl;
import com.ssh.data.entity.Cat;
import com.ssh.data.service.ICatService;

public class CatServiceImpl implements ICatService{

    private static ICatDao dao = new CatDaoImpl();

    public String findNameById(Integer id){
        Cat cat = dao.findCatById(id);
        return cat.getName();
    }
}
