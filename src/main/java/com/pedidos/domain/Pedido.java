package com.pedidos.domain;
public class Pedido {

    private String id;
    private String descricao;
    private String status;

    // Construtores, getters e setters
    public Pedido(String id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
