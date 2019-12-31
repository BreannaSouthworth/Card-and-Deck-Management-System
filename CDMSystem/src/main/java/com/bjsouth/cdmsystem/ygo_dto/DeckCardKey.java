/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Bree
 */
@Embeddable
public class DeckCardKey implements Serializable{
    @Column(name="card_id")
    private int cardId;
    
    @Column(name="deck_id")
    private int deckId;

    public DeckCardKey() {
    }

    public DeckCardKey(int cardId, int deckId) {
        this.cardId = cardId;
        this.deckId = deckId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deckId) {
        this.deckId = deckId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.cardId;
        hash = 59 * hash + this.deckId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DeckCardKey other = (DeckCardKey) obj;
        if (this.cardId != other.cardId) {
            return false;
        }
        if (this.deckId != other.deckId) {
            return false;
        }
        return true;
    }
}
