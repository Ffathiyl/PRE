package com.example.pre_prg7_074.vo;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class TransaksiVo {

    private String idTransaksi;
    private int idLayanan;
    private String namaLayanan;
    private int qtyTransaksi;
    private double hargaTotalTransaksi;
    private Date tanggalTransaksi;

    public TransaksiVo() {
    }

    public TransaksiVo(Transaksi transaksi,Layanan layanan) {
        this.idTransaksi = transaksi.getIdTransaksi();
        this.idLayanan = transaksi.getIdLayanan();
        this.namaLayanan = layanan.getNamaLayanan();
        this.qtyTransaksi = transaksi.getQtyTransaksi();
        this.hargaTotalTransaksi = transaksi.getHargaTotalTransaksi();
        this.tanggalTransaksi = transaksi.getTanggalTransaksi();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public int getQtyTransaksi() {
        return qtyTransaksi;
    }

    public void setQtyTransaksi(int qtyTransaksi) {
        this.qtyTransaksi = qtyTransaksi;
    }

    public double getHargaTotalTransaksi() {
        return hargaTotalTransaksi;
    }

    public void setHargaTotalTransaksi(double hargaTotalTransaksi) {
        this.hargaTotalTransaksi = hargaTotalTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
}
