/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Bree
 */
@Entity
@Table(name="deck")
public class Deck {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="deck_id")
    private int deckId;
    
    @Column(name="deck_name")
    private String deckName;
    
    @Column(name="wins")
    private int wins;
    
    @Column(name="loses")
    private int loses;
    
    @OneToMany(mappedBy = "deck")
    Set<DeckCard> deckCards;

    public Deck() {
    }

    public Deck(int deckId, String deckName, int wins, int loses, Set<DeckCard> deckCards) {
        this.deckId = deckId;
        this.deckName = deckName;
        this.wins = wins;
        this.loses = loses;
        this.deckCards = deckCards;
    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deckId) {
        this.deckId = deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }
    
    public Set<DeckCard> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(Set<DeckCard> deckCards) {
        this.deckCards = deckCards;
    }
}
