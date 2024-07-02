package com.example.pre_prg7_074.service;

import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.response.DtoResponse;

public interface LayananService {
    DtoResponse getAllLayanan();
    DtoResponse getLayananById(int id);
    DtoResponse createLayanan(Layanan layanan);
    DtoResponse updateLayanan(Layanan menu);
    DtoResponse deleteLayanan(Layanan menu);
}
