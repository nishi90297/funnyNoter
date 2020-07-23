package com.funny.noter.service;

import com.funny.noter.entity.NoterEntity;

public interface NoterService {

    public NoterEntity saveData(String data);
    public NoterEntity getData(String id);
}
