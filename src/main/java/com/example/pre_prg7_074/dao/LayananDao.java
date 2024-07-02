package com.example.pre_prg7_074.dao;

import com.example.pre_prg7_074.vo.LayananVo;

import java.util.List;

public interface LayananDao {

    List<LayananVo> getAllLayanan();
    List<LayananVo> getLayananById(int id);
}
