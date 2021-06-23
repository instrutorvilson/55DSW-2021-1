/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import entities.Compromisso;
import entities.Contato;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * REST Web Service
 *
 * @author vilso
 */
@Path("compromisso")
public class CompromissoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CompromissoResource
     */
    public CompromissoResource() {
    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
      return Response.status(Response.Status.OK)
              .entity(dao.DaoGeneric.getAllCompromissos())
              .build();
    }
    
    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response inserir(String content) {
        Gson gson = new Gson();
        Compromisso cp = gson.fromJson(content, Compromisso.class);
        dao.DaoGeneric.persist(cp);
        return Response.status(Response.Status.CREATED)
                .entity(gson.toJson(cp))
                .build();
    }
   
    
}
