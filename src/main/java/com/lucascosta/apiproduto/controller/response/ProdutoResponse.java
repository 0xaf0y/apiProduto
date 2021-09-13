package com.lucascosta.apiproduto.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ProdutoResponse {

    @JsonProperty("id")
    private final Long idResponse;

    private final String descricao;

    private final BigDecimal valor;


    public ProdutoResponse(Long idResponse, String descricao, BigDecimal valor) {
        this.idResponse = idResponse;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getIdResponse() {
        return idResponse;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
