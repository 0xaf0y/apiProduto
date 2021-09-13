package com.lucascosta.apiproduto.controller;

import com.lucascosta.apiproduto.controller.request.ProdutoRequest;


import com.lucascosta.apiproduto.controller.response.ProdutoResponse;
import com.lucascosta.apiproduto.mapper.ProdutoMapper;
import com.lucascosta.apiproduto.model.Produto;
import com.lucascosta.apiproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    ProdutoMapper produtoMapper;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoResponse inserir(@RequestBody ProdutoRequest produtoRequest) {
        Produto produto = produtoService.inserir(produtoMapper.toProduto(produtoRequest));
        return produtoMapper.toResponse(produto);
    }
    /*
     * Foi criado uma classe de dto para transitar com os objetos de forma melhor
     * o ideal é utilizar no método get.
     * */
}
