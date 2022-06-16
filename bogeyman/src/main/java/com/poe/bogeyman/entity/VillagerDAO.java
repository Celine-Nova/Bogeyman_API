/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.bogeyman.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;


public class VillagerDAO {
    private ArrayList<Villager> villagers = new ArrayList<>();
    private Long nextId = 1L;
    
    public Villager addVillager(Villager newVillager){
        newVillager.setId(nextId);
        nextId++;
        villagers.add(newVillager);
        return newVillager;
    }
     public ArrayList<Villager> getvillagers() {
        return villagers;
    }

    public Optional<Villager> getvillager(Long id){
        for(Villager v : villagers){
            if(v.getId().equals(id))
                return Optional.of(v);
        }
        return Optional.empty();
    }
    
    public void updateVillager(Villager villager) {
        
        Iterator<Villager> it = villagers.iterator();
        int index = 0;
        
        while(it.hasNext() && index == 0) {
            Villager v = it.next();
            if (v.getId().equals(villager.getId())){
                index = villagers.indexOf(v);
            }
        }
        villagers.set(index, villager);
    }
    
    public void deleteVillager(Long id){
        for(Villager v : villagers){
            if(v.getId().equals(id)){
                villagers.remove(v);
            }
        }
    }

    public ArrayList<Villager> getVillagers() {
        return villagers;
    }

    public void setVillagers(ArrayList<Villager> villagers) {
        this.villagers = villagers;
    }

    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }
    

}
