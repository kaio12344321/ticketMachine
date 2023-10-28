/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.calebe.ticketmachine.coretest;

import org.junit.jupiter.api.*;

import br.calebe.ticketmachine.core.TicketMachine;

/**
 *
 * @author Nicolas Moretti/ Kaio Henrique
 */

public class TicketMachineTest {
    
    @Test
    public void testaSaldo(){
        TicketMachine ticketmachine = new TicketMachine(100);
        
        Assertions.assertEquals(0, ticketmachine.getSaldo());
    }
    
}