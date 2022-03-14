/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retornoboletostrategy;

/**
 *
 * @author SCHARLES
 */
public class Principal {
    
    public static void main(String[] args) {
        ProcessarBoletos processador = null;
        processador = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        //processador.setLeituraRetorno(new LeituraRetornoBancoBrasil());
        //processador.processar("src/main/java/banco-brasil-1.csv");
        processador.setLeituraRetorno(new LeituraRetornoBradesco());
        processador.processar("src/main/java/bradesco-1.csv");
        
        //"src/main/java/banco-brasil-1.csv"
        //"src/main/java/bradesco-1.csv"
    }
    
}
