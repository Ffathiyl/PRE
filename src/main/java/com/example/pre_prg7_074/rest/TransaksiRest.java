package com.example.pre_prg7_074.rest;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.model.Transaksi;
import com.example.pre_prg7_074.response.DtoResponse;
import com.example.pre_prg7_074.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/tran")
public class TransaksiRest {
    @Autowired
    private TransaksiService transaksiService;

    public TransaksiRest(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    @GetMapping("/getAllTrans")
    public DtoResponse getAllTran() {
        return transaksiService.getAllTransaksi();
    }

    @PostMapping("/createLayanan")
    public DtoResponse saveTransaksi(@RequestBody Transaksi transaksi) {

        return transaksiService.createTransaksi(transaksi);
    }
}
