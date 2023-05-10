package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncianteBeanTest {

    private static final AnuncianteBean anunciante = new AnuncianteBean();

    @BeforeAll
    static void SetUpBeforeClass() {
        br.unicamp.ic.inf335.beans.ProdutoBean produto = new br.unicamp.ic.inf335.beans.ProdutoBean(
                "001",
                "Borracha",
                "Borracha faber castel branca",
                5.00,

                "SP");

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();

        AnuncioBean anuncio = new AnuncioBean(produto, new ArrayList<>(), 0.5);
        anuncios.add(anuncio);
        anuncio = new AnuncioBean(produto, new ArrayList<>(), 0.0);
        anuncios.add(anuncio);
        anuncio = new AnuncioBean(produto, new ArrayList<>(), 1.0);
        anuncios.add(anuncio);
        anuncio = new AnuncioBean(produto, new ArrayList<>(), 2.0);
        anuncios.add(anuncio);
        anuncio = new AnuncioBean(produto, new ArrayList<>(), -0.5);
        anuncios.add(anuncio);

        anunciante.setNome("Anunciante1");
        anunciante.setCPF("999.999.999-90");
        anunciante.setAnuncios(anuncios);

    }
    @Test
    void valorMedioAnuncios() {

        assertEquals(2.5, anunciante.valorMedioAnuncios());

    }
}