package com.lucascosta.apiproduto.mapper;

import com.lucascosta.apiproduto.controller.request.ProdutoRequest;
import com.lucascosta.apiproduto.controller.response.ProdutoResponse;
import com.lucascosta.apiproduto.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto toProduto(ProdutoRequest produtoRequest);

    @Mapping(source = "produto.id", target = "idResponse")
    @Mapping(source = "valor", target = "valor")
    ProdutoResponse toResponse(Produto produto);
}
