package com.lucascosta.apiproduto.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private final String descricao;

    @Column(nullable = false)
    private final BigDecimal valor;

    public Produto(Long id, String descricao, BigDecimal valor) {
        this.descricao = Objects.requireNonNull(descricao);
        this.valor = Objects.requireNonNull(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //    /*
//    *@Entity -> Anota que esta classe é uma entida de banco de dados.
//     *@Table -> Anota que é uma tabela
//     *@Getter -> Adiciona apenas o método get em todos os atributos.
//     *@NoArgsConstructor -> Cria um construtor vazio.
//     *@AllArgsConstructor -> Cria um construtor com todos os atributos
//     *@EqualsAndHashCode(exclude = {"descricao", "valor"}) -> Criou apenas o equals e hash code do atribuito id.
//    */

}
