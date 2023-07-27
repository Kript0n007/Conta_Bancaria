package org.example;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Conta {
    private String nome;
    private Float saldo;

    private Float investimento;

    public Float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Float investimento) {
        this.investimento = investimento;
    }

    public void resgatar_invest( Float valor){
        if (valor > this.investimento){
            System.out.println("Voce nao tem esse valor investido, tente um valor menor!!");


        }else  {
            this.investimento -= valor;
            this.saldo += valor;


        }

    }

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 100.0F;
        this.investimento = 0F;
    }

    public void resgatar ( Float resgate) {
        if ( resgate > this.saldo){
            System.out.println("Saldo insuficiente, tente um valor mais baixo");



        } else { this.saldo -= resgate;}


    }

    public void investir ( Float valor) {
        if ( valor > this.saldo ) {
            System.out.println( "saldoo insufuciente, invista um valor menor!!");

        } else {

            this.saldo -= valor;
            this.investimento += valor;


        }
    }
    public void depositar(Float quantidade) {
        if (quantidade > 0) {
            this.saldo += quantidade;
            System.out.println(quantidade + " saldo depositado com sucesso. saldo total: " + saldo);
        } else {
            System.out.println("Quantidade de saldo inválida.");
        }
    }




    public void setNome(String nome){
        this.nome =nome;
    }
    public void setSaldo(Float saldo){
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public Float getSaldo() {
        return saldo;
    }



}
