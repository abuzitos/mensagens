// src/test/java/com/example/mensagens/MensagemControllerTest.java
package com.example.mensagens;

import java.util.List;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.mensagens.controller.MensagemController;
import com.example.mensagens.model.Mensagem;

public class MensagemControllerTest {

    private MensagemController controller = new MensagemController();

    @Test
    public void testGetMensagens() {
        List<Mensagem> mensagens = controller.getMensagens();
        assertEquals(10, mensagens.size());
    }

    @Test
    public void testGetMensagem() {
        Mensagem mensagem = controller.getMensagem(1);
        assertNotNull(mensagem);
        assertEquals("Bom dia", mensagem.getTexto());
    }

    @Test
    public void testAddMensagem() {
        Mensagem novaMensagem = new Mensagem(11, "Bonjour", "Francês");
        Response response = controller.addMensagem(novaMensagem);
        assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testUpdateMensagem() {
        Mensagem mensagemAtualizada = new Mensagem(1, "Buenos días", "Espanhol");
        Response response = controller.updateMensagem(1, mensagemAtualizada);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    public MensagemController getController() {
        return controller;
    }

    public void setController(MensagemController controller) {
        this.controller = controller;
    }
}