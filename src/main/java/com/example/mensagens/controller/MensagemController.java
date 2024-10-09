package com.example.mensagens.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.mensagens.model.Mensagem;
import com.example.mensagens.service.MensagemService;

@Path("/mensagens")
public class MensagemController {

    private MensagemService mensagemService = new MensagemService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mensagem> getMensagens() {
        return mensagemService.getMensagens();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensagem getMensagem(@PathParam("id") int id) {
        return mensagemService.getMensagem(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMensagem(Mensagem mensagem) {
        mensagemService.addMensagem(mensagem);
        return Response.status(Response.Status.CREATED).entity(mensagem).build();
    }

    @PATCH
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateMensagem(@PathParam("id") int id, Mensagem mensagem) {
        mensagemService.updateMensagem(id, mensagem);
        return Response.ok(mensagem).build();
    }

    public MensagemService getMensagemService() {
        return mensagemService;
    }

    public void setMensagemService(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }
}