package com.ssh.data.dao;

import com.ssh.data.entity.Cat;

public interface ICatDao {
    Cat findCatById(Integer id);
}
