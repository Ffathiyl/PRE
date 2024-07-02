package com.example.pre_prg7_074.service;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;
import com.example.pre_prg7_074.response.DtoResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface TransaksiService {
    DtoResponse getAllTransaksi();
    DtoResponse createTransaksi(Transaksi transaksi);
}
