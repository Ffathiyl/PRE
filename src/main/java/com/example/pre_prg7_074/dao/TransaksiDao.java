package com.example.pre_prg7_074.dao;

import com.example.pre_prg7_074.vo.TransaksiVo;

import java.util.List;

public interface TransaksiDao {
    List<TransaksiVo> getAllTransaksi();
    List<TransaksiVo> getTransaksiByNama(String nama);
}
