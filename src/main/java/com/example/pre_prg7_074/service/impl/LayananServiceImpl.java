package com.example.pre_prg7_074.service.impl;

import com.example.pre_prg7_074.dao.LayananDao;
import com.example.pre_prg7_074.model.Layanan;
import com.example.pre_prg7_074.repository.LayananRepository;
import com.example.pre_prg7_074.response.DtoResponse;
import com.example.pre_prg7_074.service.LayananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LayananServiceImpl implements LayananService {
    @Autowired
    private LayananDao layananDao;

    @Autowired
    private LayananRepository layananRepository;
    @Override
    public DtoResponse getAllLayanan() {
        if (layananDao.getAllLayanan() != null) return new DtoResponse(200, layananDao.getAllLayanan());
        return new DtoResponse(200, null, "mEmptyData");
    }

    @Override
    public DtoResponse getLayananById(int id) {
        if (layananDao.getLayananById(id) != null) return new DtoResponse(200, layananDao.getLayananById(id));
        return new DtoResponse(200, null, "mEmptyData by id");
    }

    @Override
    public DtoResponse createLayanan(Layanan layanan) {
        try {
            layanan.setStatusLayanan(1);
            layananRepository.save(layanan);
            return new DtoResponse(200, layanan, "mCreateSuccess");
        } catch (Exception e) {
            return new DtoResponse(500, layanan, "mCreateFailed");
        }
    }

    @Override
    public DtoResponse updateLayanan(Layanan menu) {
        try {
            Layanan existingMenu = layananRepository.findById(menu.getIdLayanan()).orElseThrow();
            if (menu.getNamaLayanan() != null) existingMenu.setNamaLayanan(menu.getNamaLayanan());
            if (menu.getDeskripsiLayanan() != null) existingMenu.setDeskripsiLayanan(menu.getDeskripsiLayanan());
            if (menu.getHargaLayanan() != 0) existingMenu.setHargaLayanan(menu.getHargaLayanan());


            Layanan updatedMenu = layananRepository.save(existingMenu);
            return new DtoResponse(200, updatedMenu, "mUpdateSuccess");
        } catch (Exception e) {
            return new DtoResponse(500, null, "mNotFound");
        }
    }

    @Override
    public DtoResponse deleteLayanan(Layanan menu) {
        try {
            Layanan existingMenu = layananRepository.findById(menu.getIdLayanan()).orElseThrow();
            existingMenu.setStatusLayanan(0);

            Layanan deletedMenu = layananRepository.save(existingMenu);
            if (deletedMenu != null)
                return new DtoResponse(200, deletedMenu, "mDeleteSuccess");
            else
                return new DtoResponse(404, null, "mNotFound");
        } catch (Exception e) {
            return new DtoResponse(500, null, "mDeleteFailed");
        }
    }
}
