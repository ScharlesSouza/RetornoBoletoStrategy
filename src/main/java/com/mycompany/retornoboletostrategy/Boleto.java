/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retornoboletostrategy;


import java.util.Date;

/**
 *
 * @author SCHARLES
 */
public class Boleto {
    private int id;
    private String codBanco, agencia, contaBancaria, cpfcliente;//CPF cliente ficara como String por causa dos zeros a esuqerda.
    private double valor, multa, juros;
    private Date dataVencimento, dataPagamento;

    public Boleto() {
    }

    public Boleto(int id, String codBanco, String agencia, String contaBancaria, String cpfcliente, double valor, double multa, double juros, Date dataVencimento, Date dataPagamento) {
        this.id = id;
        this.codBanco = codBanco;
        this.agencia = agencia;
        this.contaBancaria = contaBancaria;
        this.cpfcliente = cpfcliente;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getCpfcliente() {
        return cpfcliente;
    }

    public void setCpfcliente(String cpfcliente) {
        this.cpfcliente = cpfcliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", codBanco=" + codBanco + ", agencia=" + agencia + ", contaBancaria=" + contaBancaria + ", cpfcliente=" + cpfcliente + ", valor=" + valor + ", multa=" + multa + ", juros=" + juros + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + '}';
    }

  
   
    
}
