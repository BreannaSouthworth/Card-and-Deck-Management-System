/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Bree
 */
@Entity
public class SpellCard extends Card{
    @Column (name="primary_type")
    private String primaryType;
    
    @Column (name="secondary_type")
    private String secondaryType;

    public SpellCard() {
    }

    public SpellCard(String primaryType, String secondaryType) {
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }

    public SpellCard(String primaryType, String secondaryType, int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling, Set<DeckCard> deckCards) {
        super(cardId, cardName, cardText, legal, traditionalFormatRuling, advanceFormatRuling, deckCards);
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }

    public String getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(String primaryType) {
        this.primaryType = primaryType;
    }

    public String getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(String secondaryType) {
        this.secondaryType = secondaryType;
    }
}
