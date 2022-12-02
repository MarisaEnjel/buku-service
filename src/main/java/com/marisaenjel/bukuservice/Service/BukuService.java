/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.bukuservice.Service;

import com.marisaenjel.bukuservice.Entity.Buku;
import com.marisaenjel.bukuservice.Repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service

public class BukuService {
    @Autowired
    private BukuRepository bukuRepository;
    
    public Buku saveBuku(Buku buku) {
        return bukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return bukuRepository.findByBukuId(bukuId);
    }
}
