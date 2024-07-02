package com.example.pre_prg7_074.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pre_mslayanan")
public class Layanan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLayanan")
    private int idLayanan;

    @Column(name = "NamaLayanan")
    private String namaLayanan;

    @Column(name = "DeskripsiLayanan")
    private String deskripsiLayanan;

    @Column(name = "HargaLayanan")
    private int hargaLayanan;

    @Column(name = "StatusLayanan")
    private int statusLayanan;

    public Layanan() {
    }

    public Layanan(int idLayanan, String namaLayanan, String deskripsiLayanan, int hargaLayanan, int statusLayanan) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.deskripsiLayanan = deskripsiLayanan;
        this.hargaLayanan = hargaLayanan;
        this.statusLayanan = statusLayanan;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public String getDeskripsiLayanan() {
        return deskripsiLayanan;
    }

    public void setDeskripsiLayanan(String deskripsiLayanan) {
        this.deskripsiLayanan = deskripsiLayanan;
    }

    public int getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(int hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    public int getStatusLayanan() {
        return statusLayanan;
    }

    public void setStatusLayanan(int statusLayanan) {
        this.statusLayanan = statusLayanan;
    }
}
