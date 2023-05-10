package br.unicamp.ic.inf335.beans;

import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    private static final ArrayList<ProdutoBean> Produtos = new ArrayList<ProdutoBean>();
    @BeforeAll
    static void SetUpBeforeClass() {
        ProdutoBean Produto = new ProdutoBean(
                "001",
                "Borracha",
                "Borracha faber castel branca",
                5.00,
                "SP");
        Produtos.add(Produto);

        Produto = new ProdutoBean(
                "002",
                "Caneta ponta fina 0.5",
                "Caneta ponta fina 0.5 preta fine pen",
                20.00,
                "SP");
        Produtos.add(Produto);

        Produto = new ProdutoBean(
                "003",
                "Lápis ",
                "Lápis comum",
                2.00,
                "SP");
        Produtos.add(Produto);

        Produto = new ProdutoBean(
                "004",
                "Lápis 6B",
                "Lápis 6B desenho",
                2.00,
                "SP");
        Produtos.add(Produto);
    }

    @Test
    void compareTo() {

        assertAll("Comparando valor dos produtos.",
                () -> assertEquals(1, Produtos.get(0).compareTo(Produtos.get(2))),
                () -> assertEquals(0, Produtos.get(2).compareTo(Produtos.get(3))),
                () -> assertEquals(-1, Produtos.get(0).compareTo(Produtos.get(1)))
        );
    }
}