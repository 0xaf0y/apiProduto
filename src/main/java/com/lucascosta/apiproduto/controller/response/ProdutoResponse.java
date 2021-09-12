package com.lucascosta.apiproduto.controller.response;

import java.math.BigDecimal;

public class ProdutoResponse {

    private Long idResponse;

    private String descricao;

    private BigDecimal valor;

    public ProdutoResponse(Long idResponse, String descricao, BigDecimal valor) {
        this.idResponse = idResponse;
        this.descricao = descricao;
        this.valor = valor;
    }
}
