/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import entities.Contato;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author vilso
 */
@Path("contato")
public class Aula {

    @Context
    private UriInfo context;
 
    public Aula() {
    }

    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getJson() {
       Gson gson = new Gson(); 
       return gson.toJson(dao.DaoGeneric.getAll());
      //return new Contato("José", "123", "jose");
    }  
    
}
