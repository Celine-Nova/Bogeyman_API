package com.poe.bogeyman.api;

import com.poe.bogeyman.entity.Villager;
import com.poe.bogeyman.entity.VillagerDAO;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    //url
@Path("/villagers")
public class VillagerApi {

    //HTTP Verb
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Villager> getVillagers(@Context HttpServletRequest request) {
        VillagerDAO villagerList = (VillagerDAO) request.getSession().getAttribute("villagerList");
        if (villagerList == null) {
            villagerList = new VillagerDAO();
        }
        /*ArrayList<Villager> Villagers = new ArrayList<>();
        Villagers.add(new Villager("Celine", "Dion"));
        Villagers.add(new Villager("JC", "Dom"));*/
        return villagerList.getVillagers();
    }

    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Villager postVillager(Villager newVillager, @Context HttpServletRequest request) {
        VillagerDAO villagerList = (VillagerDAO) request.getSession().getAttribute("villagerList");
        if (villagerList == null) {
            villagerList = new VillagerDAO();
        }
        Villager villager = villagerList.addVillager(newVillager);
        request.getSession().setAttribute("villagerList", villagerList);
        return villager;
    }
}
