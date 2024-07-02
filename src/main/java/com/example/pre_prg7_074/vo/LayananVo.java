package com.example.pre_prg7_074.vo;

import com.example.pre_prg7_074.model.Layanan;

public class LayananVo {

    private Integer Id;
    private String Nama;
    private String Deskripsi;
    private Integer Harga;
    private Integer Status;

    public LayananVo() {
    }

    public LayananVo(Layanan layanan) {
        Id = layanan.getIdLayanan();
        Nama = layanan.getNamaLayanan();
        Deskripsi = layanan.getDeskripsiLayanan();
        Harga = layanan.getHargaLayanan();
        Status = layanan.getStatusLayanan();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer harga) {
        Harga = harga;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }
}
