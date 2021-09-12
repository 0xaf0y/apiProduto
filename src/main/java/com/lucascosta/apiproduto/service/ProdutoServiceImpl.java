package com.lucascosta.apiproduto.service;

import com.lucascosta.apiproduto.model.Produto;
import com.lucascosta.apiproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto inserir(Produto produto) {
        return produtoRepository.save(produto);
    }
}
