package com.example.pre_prg7_074.service.impl;

import com.example.pre_prg7_074.dao.LayananDao;
import com.example.pre_prg7_074.dao.TransaksiDao;
import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;
import com.example.pre_prg7_074.repository.LayananRepository;
import com.example.pre_prg7_074.repository.TransaksiRepository;
import com.example.pre_prg7_074.response.DtoResponse;
import com.example.pre_prg7_074.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    private TransaksiDao transaksiDao;

    @Autowired
    LayananDao layananDao;

    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private LayananRepository layananRepository;
    @Override
    public DtoResponse getAllTransaksi() {
        if (transaksiDao.getAllTransaksi() != null) return new DtoResponse(200, transaksiDao.getAllTransaksi());
        return new DtoResponse(200, null, "mEmptyData");
    }

    @Override
    public DtoResponse createTransaksi(Transaksi transaksi) {
        try {
            String nextId = generateNextId();
            transaksi.setIdTransaksi(nextId);

            // Ambil objek Layanan berdasarkan idLayanan
            double layanan = layananRepository.getHargaById(transaksi.getIdLayanan());

            // Validasi jika layanan ditemukan
            System.out.println("ASDASDASD: "+layanan);
            if (layanan != 0) {
                // Set harga total transaksi
                transaksi.setHargaTotalTransaksi(layanan * transaksi.getQtyTransaksi());

                transaksiRepository.save(transaksi); // Simpan transaksi
                return new DtoResponse(200, transaksi, "mCreateSuccess");
            } else {
                return new DtoResponse(404, transaksi, "mLayananNotFound");
            }
        } catch (Exception e) {
            return new DtoResponse(500, transaksi, "mCreateFailed");
        }
    }

    public String generateNextId() {
        List<String> allIds = transaksiRepository.getAllIds();
        if (allIds.isEmpty()) {
            return "TRAN001"; // Jika tidak ada data, mulai dari TRAN001
        } else {
            // Cari ID maksimum
            int maxId = 0;
            for (String id : allIds) {
                int currentId = Integer.parseInt(id.substring(4)); // Ambil angka setelah "TRAN"
                if (currentId > maxId) {
                    maxId = currentId;
                }
            }
            // Generate ID berikutnya
            return String.format("TRAN%03d", maxId + 1);
        }
    }
}
