/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dao;

import com.bjsouth.cdmsystem.ygo_dto.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bree
 */
@Repository
public interface CardRepo extends JpaRepository<Card, Integer>{
    
}
