package com.example.pre_prg7_074.rest;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.response.DtoResponse;
import com.example.pre_prg7_074.service.LayananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/layanans")
public class LayananRest {

    @Autowired
    private LayananService layananService;

    public LayananRest(LayananService layananService) {
        this.layananService = layananService;
    }

    @GetMapping("/getAllLayanans")
    public DtoResponse getAllLayana() {
        return layananService.getAllLayanan();
    }

    @GetMapping("/getLayananById")
    public DtoResponse getLayananById(@RequestParam("id") int id) {
        return layananService.getLayananById(id);
    }

    @PostMapping("/saveLayanan")
    public DtoResponse saveMenu(@RequestBody Layanan layanan) {
        return layananService.createLayanan(layanan);
    }

    @PostMapping("/updateLayanan")
    public DtoResponse updateMenu(@RequestBody Layanan menu) {
        return layananService.updateLayanan(menu);
    }

    @PostMapping("/deleteLayanan")
    public DtoResponse deleteMenu(@RequestBody Layanan menu) {
        return layananService.deleteLayanan(menu);
    }
}
