/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author Bree
 */
@Entity
public class DeckCard {
    @EmbeddedId
    DeckCardKey id;
    
    @ManyToOne
    @MapsId("card_id")
    @JoinColumn(name="card_id")
    Card card;
    
    @ManyToOne
    @MapsId("deck_id")
    @JoinColumn(name="deck_id")
    Deck deck;
    
    private DeckSection deckSection
;    private int count;

    public DeckCard() {
    }

    public DeckCard(DeckCardKey id, Card card, Deck deck, DeckSection deckSelection, int count) {
        this.id = id;
        this.card = card;
        this.deck = deck;
        this.deckSection = deckSelection;
        this.count = count;
    }

    public DeckCardKey getId() {
        return id;
    }

    public void setId(DeckCardKey id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public DeckSection getDeckSelection() {
        return deckSection;
    }

    public void setDeckSelection(DeckSection deckSelection) {
        this.deckSection = deckSelection;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
