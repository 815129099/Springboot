package com.example.demo.dao;

import com.example.demo.domain.LearnResouce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LearnDao {
    public List<LearnResouce> queryLearnResouce();
}
