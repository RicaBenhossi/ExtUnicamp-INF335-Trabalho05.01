package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.*;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest extends ProdutoBeanTest {

    private static final ArrayList<AnuncioBean> anuncios = new ArrayList<>();

    @BeforeAll
    static void setUpBeforeClass() {
        ProdutoBean Produto = new ProdutoBean(
                "001",
                "Borracha",
                "Borracha faber castel branca",
                5.00,
                "SP");

        AnuncioBean Anuncio = new AnuncioBean(Produto, new ArrayList<>(), 0.0);
        anuncios.add(Anuncio);
        Anuncio = new AnuncioBean(Produto, new ArrayList<>(), 0.5);
        anuncios.add(Anuncio);
        Anuncio = new AnuncioBean(Produto, new ArrayList<>(), 1.0);
        anuncios.add(Anuncio);
        Anuncio = new AnuncioBean(Produto, new ArrayList<>(), 2.0);
        anuncios.add(Anuncio);
        Anuncio = new AnuncioBean(Produto, new ArrayList<>(), -1.0);
        anuncios.add(Anuncio);
    }

    @Test
    void getValor() {

        assertAll("Recuperando valores com desconto",
                () -> assertEquals(5, anuncios.get(0).getValor()),
                () -> assertEquals(2.5, anuncios.get(1).getValor()),
                () -> assertEquals(0, anuncios.get(2).getValor()),
                () -> assertEquals(0, anuncios.get(3).getValor()),
                () -> assertEquals(5, anuncios.get(4).getValor())
        );
    }
}