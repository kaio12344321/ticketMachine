/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.calebe.ticketmachine.coretest;

import org.junit.jupiter.api.*;

import br.calebe.ticketmachine.core.PapelMoeda;

/**
 *
 * @author Nicolas Moretti/ Kaio Henrique
 */

public class PapelMoedaTest {
    
    @Test
    public void testaValor(){
        PapelMoeda papelMoeda = new PapelMoeda(100, 5);
        
        Assertions.assertEquals(100, papelMoeda.getValor());
    }

    @Test
    public void testaQuantidade(){
        PapelMoeda papelMoeda = new PapelMoeda(100, 5);
        
        Assertions.assertEquals(5, papelMoeda.getQuantidade());
    }
    
}