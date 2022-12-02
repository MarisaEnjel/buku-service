/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marisaenjel.bukuservice.Repository;

import com.marisaenjel.bukuservice.Entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */
public interface BukuRepository extends JpaRepository<Buku, Long>{

    public Buku findByBukuId(Long bukuId);
    
}