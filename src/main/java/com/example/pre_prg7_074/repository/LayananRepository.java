package com.example.pre_prg7_074.repository;

import com.example.pre_prg7_074.model.Layanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LayananRepository extends JpaRepository<Layanan,Integer> {

    @Query(value = "SELECT * FROM pre_mslayanan WHERE StatusLayanan = :status",nativeQuery = true)
    List<Layanan> getAllLayanan(@Param("status") int status);

    @Query(value = "SELECT * FROM pre_mslayanan WHERE IdLayanan = :id", nativeQuery = true)
    List<Layanan> getLayananById(@Param("id") int id);

    @Query(value = "SELECT HargaLayanan FROM pre_mslayanan WHERE IdLayanan = :id", nativeQuery = true)
    double getHargaById(int id);
}
