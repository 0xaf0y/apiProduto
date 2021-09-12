package com.lucascosta.apiproduto.controller;

import com.lucascosta.apiproduto.controller.request.ProdutoRequest;


import com.lucascosta.apiproduto.controller.response.ProdutoResponse;
import com.lucascosta.apiproduto.mapper.ProdutoMapper;
import com.lucascosta.apiproduto.model.Produto;
import com.lucascosta.apiproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ProdutoResponse inserir(@RequestBody ProdutoRequest produtoRequest){
        Produto retorno = produtoService.inserir(produtoMapper.toProduto(produtoRequest));
        ProdutoResponse produtoResponse = produtoMapper.toResponse(retorno);
        return produtoResponse;
    }

    /*  */


    //todo depois adicionar model mapper ou mapstruct para mapear os atributos do dto

}
