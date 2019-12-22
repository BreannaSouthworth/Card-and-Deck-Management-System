/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Bree
 */
@Entity
public class TrapCard extends Card{
    @Column (name="primary_type")
    private String primaryType;
    
    @Column (name="secondary_type")
    private String secondaryType;

    public TrapCard() {
    }

    public TrapCard(String primaryType, String secondaryType) {
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }

    public TrapCard(String primaryType, String secondaryType, int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling) {
        super(cardId, cardName, cardText, legal, traditionalFormatRuling, advanceFormatRuling);
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }
}
