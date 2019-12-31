/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Bree
 */
@Entity
@Table(name="card")
@Inheritance(strategy = InheritanceType.JOINED)
public class Card {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="card_id")
    private int cardId;
    
    @Column(name="card_name")
    private String cardName;
    
    @Column(name="card_text")
    private String cardText;
    
    @Column(name="legal")
    private boolean legal;
    
    @Column(name="traditional_format_ruling")
    private String traditionalFormatRuling;
    
    @Column(name="advance_format_ruling")
    private String advanceFormatRuling;

    @OneToMany(mappedBy = "card")
    Set<DeckCard> deckCards;
    
    public Card() {
    }

    public Card(int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling, Set<DeckCard> deckCards) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardText = cardText;
        this.legal = legal;
        this.traditionalFormatRuling = traditionalFormatRuling;
        this.advanceFormatRuling = advanceFormatRuling;
        this.deckCards = deckCards;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public String getTraditionalFormatRuling() {
        return traditionalFormatRuling;
    }

    public void setTraditionalFormatRuling(String traditionalFormatRuling) {
        this.traditionalFormatRuling = traditionalFormatRuling;
    }

    public String getAdvanceFormatRuling() {
        return advanceFormatRuling;
    }

    public void setAdvanceFormatRuling(String advanceFormatRuling) {
        this.advanceFormatRuling = advanceFormatRuling;
    }

    public Set<DeckCard> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(Set<DeckCard> deckCards) {
        this.deckCards = deckCards;
    }
}
