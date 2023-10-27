package br.calebe.ticketmachine.coretest;

import org.junit.jupiter.api.*;

import br.calebe.ticketmachine.core.PapelMoeda;

/**
 *
 * @author Nicolas Moretti/Kaio Henrique
 *
 */

public class PapelMoedaTest {
    @Test
    public void testObjectInstance(){
        PapelMoeda papelMoeda = new PapelMoeda(100, 5);
        Assertions.assertEquals(100, papelMoeda.getValor());
    }
}