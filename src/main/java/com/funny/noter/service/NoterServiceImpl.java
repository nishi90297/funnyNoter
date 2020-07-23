package com.funny.noter.service;
import com.funny.noter.entity.NoterEntity;
import com.funny.noter.repository.NoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoterServiceImpl implements NoterService{

    @Autowired
    public NoterRepository noterRepository;

    @Override
    public NoterEntity saveData(String data) {

        NoterEntity noterEntity= noterRepository.save(new NoterEntity(data));
        return noterEntity;
    }
}
