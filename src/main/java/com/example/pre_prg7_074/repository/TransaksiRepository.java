package com.example.pre_prg7_074.repository;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransaksiRepository extends JpaRepository<Transaksi,String> {

    @Query(value = "SELECT \n" +
            "        t.idTransaksi,\n" +
            "\t\tl.namaLayanan,\n" +
            "        t.tanggalTransaksi,\n" +
            "        t.QtyTransaksi,\n" +
            "\t\tt.HargaTotalTransaksi\n" +
            "    FROM \n" +
            "        pre_trpenjualansalon t\n" +
            "    JOIN \n" +
            "        pre_mslayanan l ON t.idLayanan = l.idLayanan;",nativeQuery = true)
    List<Layanan> getAllTransaksi();

    @Query(value = "SELECT t.idTransaksi FROM Transaksi t", nativeQuery = false)
    List<String> getAllIds();
}
