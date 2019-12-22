/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    int cardId;
    
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

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "deck_card",
            joinColumns = {@JoinColumn(name = "card_id")},
            inverseJoinColumns = {@JoinColumn(name = "deck_id")})
    List<Deck> items;
    
    public Card() {
    }

    public Card(int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardText = cardText;
        this.legal = legal;
        this.traditionalFormatRuling = traditionalFormatRuling;
        this.advanceFormatRuling = advanceFormatRuling;
    }
}
