/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retornoboletostrategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
    public List<Boleto> lerArquivo(String caminhoArquivo) {
        
        List<Boleto> listaBoletos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String linha;
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
            while(leitor.ready()){
                linha = leitor.readLine();
                String[] textoSeparado = linha.split(";");
                Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(textoSeparado[0]));
                boleto.setCodBanco(textoSeparado[1]);  
                boleto.setDataVencimento(sdf.parse(textoSeparado[2]));
                boleto.setDataPagamento(sdf.parse(textoSeparado[3]));
                boleto.setCpfcliente(textoSeparado[4]);                
                boleto.setValor(Double.parseDouble(textoSeparado[5]));
                boleto.setMulta(Double.parseDouble(textoSeparado[6]));
                boleto.setJuros(Double.parseDouble(textoSeparado[7]));
                
                listaBoletos.add(boleto);
            }
            leitor.close();
            return listaBoletos;
        } catch (IOException ex) {
            Logger.getLogger(LeituraRetornoBancoBrasil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LeituraRetornoBancoBrasil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaBoletos;
    }
    
}
