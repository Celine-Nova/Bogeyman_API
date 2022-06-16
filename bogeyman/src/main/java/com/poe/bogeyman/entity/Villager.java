/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.bogeyman.entity;

import com.poe.bogeyman.entityemployement.Profession;
//MODEL POJO
public class Villager {
    private Long id;
    private boolean isWerewolf;
    private String name;
    private Profession profession;
    private boolean isLive;
    private boolean isSleep;
    private boolean isMayor;

    public Villager() {
    }

    public Villager(boolean isWerewolf, String name, Profession profession, boolean isLive, boolean isSleep, boolean isMayor) {
        this.isWerewolf = isWerewolf;
        this.name = name;
        this.profession = profession;
        this.isLive = isLive;
        this.isSleep = isSleep;
        this.isMayor = isMayor;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIsWerewolf() {
        return isWerewolf;
    }

    public void setIsWerewolf(boolean isWerewolf) {
        this.isWerewolf = isWerewolf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public boolean isIsLive() {
        return isLive;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    public boolean isIsSleep() {
        return isSleep;
    }

    public void setIsSleep(boolean isSleep) {
        this.isSleep = isSleep;
    }

    public boolean isIsMayor() {
        return isMayor;
    }

    public void setIsMayor(boolean isMayor) {
        this.isMayor = isMayor;
    }

    @Override
    public String toString() {
        return "Villagers{" + "id=" + id + ", isWerewolf=" + isWerewolf + ", name=" + name + ", profession=" + profession + ", isLive=" + isLive + ", isSleep=" + isSleep + ", isMayor=" + isMayor + '}';
    }
    

}
