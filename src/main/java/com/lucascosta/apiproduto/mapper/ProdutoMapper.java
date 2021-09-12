package com.lucascosta.apiproduto.mapper;

import com.lucascosta.apiproduto.controller.request.ProdutoRequest;
import com.lucascosta.apiproduto.controller.response.ProdutoResponse;
import com.lucascosta.apiproduto.model.Produto;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    @Mapping(source = "produtoRequest.descricao", target = "descricao")
    @Mapping(source = "produtoRequest.valor", target = "valor")
 //   @Mapping(target = "id", defaultValue = "id")

    Produto toProduto(ProdutoRequest produtoRequest);

    @Mapping(source = "id", target = "idResponse")
    @Mapping(source = "produto.descricao", target = "descricao")
    @Mapping(source = "produto.valor", target = "valor")

    ProdutoResponse toResponse(Produto produto);

}
