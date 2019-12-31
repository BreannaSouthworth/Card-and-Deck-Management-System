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
public class MonsterCard extends Card{
    @Column (name="monster_type")
    private MonsterType monsterType;
    
    @Column (name="tuner")
    private boolean tuner;
    
    @Column (name="special_summon")
    private boolean specialSummon;
    
    @Column (name="ability")
    private Ability ability;
    
    @Column (name="attribute")
    private Attribute attribute;
    
    @Column (name="type")
    private Type type;
    
    @Column (name="atk")
    private String atk;
    
    @Column (name="def")
    private String def;

    public MonsterCard() {
    }

    public MonsterCard(MonsterType monsterType, boolean tuner, boolean specialSummon, Ability ability, Attribute attribute, Type type, String atk, String def) {
        this.monsterType = monsterType;
        this.tuner = tuner;
        this.specialSummon = specialSummon;
        this.ability = ability;
        this.attribute = attribute;
        this.type = type;
        this.atk = atk;
        this.def = def;
    }

    public MonsterCard(MonsterType monsterType, boolean tuner, boolean specialSummon, Ability ability, Attribute attribute, Type type, String atk, String def, int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling, Set<DeckCard> deckCards) {
        super(cardId, cardName, cardText, legal, traditionalFormatRuling, advanceFormatRuling, deckCards);
        this.monsterType = monsterType;
        this.tuner = tuner;
        this.specialSummon = specialSummon;
        this.ability = ability;
        this.attribute = attribute;
        this.type = type;
        this.atk = atk;
        this.def = def;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public boolean isTuner() {
        return tuner;
    }

    public void setTuner(boolean tuner) {
        this.tuner = tuner;
    }

    public boolean isSpecialSummon() {
        return specialSummon;
    }

    public void setSpecialSummon(boolean specialSummon) {
        this.specialSummon = specialSummon;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}