package com.example.pre_prg7_074.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "pre_trpenjualansalon")
public class Transaksi {

    @Id
    @Column(name = "IdTransaksi")
    private String idTransaksi;

    @Column(name = "IdLayanan")
    private int idLayanan;

    @Column(name = "QtyTransaksi")
    private int qtyTransaksi;

    @Column(name = "HargaTotalTransaksi")
    private double hargaTotalTransaksi;

    @Column(name = "TanggalTransaksi")
    private Date tanggalTransaksi;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi, int idLayanan, int qtyTransaksi, double hargaTotalTransaksi, Date tanggalTransaksi) {
        this.idTransaksi = idTransaksi;
        this.idLayanan = idLayanan;
        this.qtyTransaksi = qtyTransaksi;
        this.hargaTotalTransaksi = hargaTotalTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
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
