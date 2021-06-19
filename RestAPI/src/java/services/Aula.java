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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

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
    public Response getAll() {
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(dao.DaoGeneric.getAll()))
                .build();
        //return new Contato("José", "123", "jose");
    }

    @GET
    @Path("/{id}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") long id) {
        Contato ct = dao.DaoGeneric.getById(id);
        if (ct == null) {
            return Response.status(Response.Status.NOT_FOUND)
                           .build();
        } else {
            return Response.status(Response.Status.FOUND)
                    .entity(ct)
                    .build();
        }
    }

    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response inserir(String content) {
        Gson gson = new Gson();
        Contato ct = gson.fromJson(content, Contato.class);
        dao.DaoGeneric.persist(ct);
        return Response.status(Response.Status.CREATED)
                .entity(ct)
                .build();
    }

}
