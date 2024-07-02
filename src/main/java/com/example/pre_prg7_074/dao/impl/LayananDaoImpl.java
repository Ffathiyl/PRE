package com.example.pre_prg7_074.dao.impl;

import com.example.pre_prg7_074.dao.LayananDao;
import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.repository.LayananRepository;
import com.example.pre_prg7_074.vo.LayananVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LayananDaoImpl implements LayananDao {
    @Autowired
    private LayananRepository layananRepository;

    @Override
    public List<LayananVo> getAllLayanan() {
        Iterable<Layanan> menus = layananRepository.getAllLayanan(1);
        List<LayananVo> menuVos = new ArrayList<>();
        for (Layanan item : menus) {
            LayananVo menuVo = new LayananVo(item);
            menuVos.add(menuVo);
        }
        return menuVos;
    }

    @Override
    public List<LayananVo> getLayananById(int id) {
        Iterable<Layanan> menus = layananRepository.getLayananById(id);
        List<LayananVo> menuVos = new ArrayList<>();
        for (Layanan item : menus) {
            LayananVo menuVo = new LayananVo(item);
            menuVos.add(menuVo);
        }
        return menuVos;
    }
}
