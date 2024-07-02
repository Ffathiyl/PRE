package com.example.pre_prg7_074.dao.impl;

import com.example.pre_prg7_074.dao.TransaksiDao;
import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;
import com.example.pre_prg7_074.repository.LayananRepository;
import com.example.pre_prg7_074.repository.TransaksiRepository;
import com.example.pre_prg7_074.vo.LayananVo;
import com.example.pre_prg7_074.vo.TransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransaksiDaoImpl implements TransaksiDao {
    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private LayananRepository layananRepository;

    @Override
    public List<TransaksiVo> getAllTransaksi() {
        Iterable<Transaksi> transaksis = transaksiRepository.findAll();
        List<TransaksiVo> transaksiVos = new ArrayList<>();

        for (Transaksi transaksi : transaksis) {
            Layanan layanan = layananRepository.findById(transaksi.getIdLayanan()).orElse(null);
            if (layanan != null) {
                TransaksiVo transaksiVo = new TransaksiVo(transaksi, layanan);
                transaksiVos.add(transaksiVo);
            }
        }

        return transaksiVos;
    }

}
