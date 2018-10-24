package com.example.demo.service;

import com.example.demo.dao.LearnDao;
import com.example.demo.domain.LearnResouce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LearnResouceServiceImpl implements LearnResouceService {

    @Autowired
    LearnDao learnMapper;


    @Override
    @Transactional
    public List<LearnResouce> getList() {
        return this.learnMapper.queryLearnResouce();
    }
}
