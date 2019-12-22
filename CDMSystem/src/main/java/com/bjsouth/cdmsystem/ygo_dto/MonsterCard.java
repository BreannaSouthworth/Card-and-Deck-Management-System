/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.ygo_dto;

/**
 *
 * @author Bree
 */
public class MonsterCard extends Card{
    private int monsterCardId;
    private String monsterType;
    private boolean tuner;
    private boolean specialSummon;
    private Ability ability;
    private Attribute attribute;
    private Type type;
    private String atk;
    private String def;

    public MonsterCard() {
    }

    public MonsterCard(int monsterCardId, String monsterType, boolean tuner, boolean specialSummon, Ability ability, Attribute attribute, Type type, String atk, String def) {
        this.monsterCardId = monsterCardId;
        this.monsterType = monsterType;
        this.tuner = tuner;
        this.specialSummon = specialSummon;
        this.ability = ability;
        this.attribute = attribute;
        this.type = type;
        this.atk = atk;
        this.def = def;
    }

    public MonsterCard(int monsterCardId, String monsterType, boolean tuner, boolean specialSummon, Ability ability, Attribute attribute, Type type, String atk, String def, int cardId, String cardName, String cardText, boolean legal, String traditionalFormatRuling, String advanceFormatRuling) {
        super(cardId, cardName, cardText, legal, traditionalFormatRuling, advanceFormatRuling);
        this.monsterCardId = monsterCardId;
        this.monsterType = monsterType;
        this.tuner = tuner;
        this.specialSummon = specialSummon;
        this.ability = ability;
        this.attribute = attribute;
        this.type = type;
        this.atk = atk;
        this.def = def;
    }

    public int getMonsterCardId() {
        return monsterCardId;
    }

    public void setMonsterCardId(int monsterCardId) {
        this.monsterCardId = monsterCardId;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
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
