/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retornoboletostrategy;

import java.util.List;

/**
 *
 * @author SCHARLES
 */
public interface LeituraRetorno {
    
    List<Boleto> lerArquivo(String caminhoArquivo);
   
}
