package com.example.mensagens.service;

import java.util.ArrayList;
import java.util.List;

import com.example.mensagens.model.Mensagem;

public class MensagemService {

    private List<Mensagem> mensagens = new ArrayList<>();

    public MensagemService() {
        mensagens.add(new Mensagem(1, "Bom dia", "Português"));
        mensagens.add(new Mensagem(2, "Good morning", "Inglês"));
        mensagens.add(new Mensagem(3, "Buenos días", "Espanhol"));
        mensagens.add(new Mensagem(4, "Bonjour", "Francês"));
        mensagens.add(new Mensagem(5, "Guten Morgen", "Alemão"));
        mensagens.add(new Mensagem(6, "Buongiorno", "Italiano"));
        mensagens.add(new Mensagem(7, "Доброе утро", "Russo"));
        mensagens.add(new Mensagem(8, "おはようございます", "Japonês"));
        mensagens.add(new Mensagem(9, "早上好", "Chinês"));
        mensagens.add(new Mensagem(10, "좋은 아침", "Coreano"));
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public Mensagem getMensagem(int id) {
        return mensagens.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    public void addMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void updateMensagem(int id, Mensagem mensagem) {
        Mensagem existingMensagem = getMensagem(id);
        if (existingMensagem != null) {
            existingMensagem.setTexto(mensagem.getTexto());
            existingMensagem.setLingua(mensagem.getLingua());
        }
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}