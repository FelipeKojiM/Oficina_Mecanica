/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprogdesktop;

/**
 *
 * @author HP
 */
public class Servicos {
    
    String preDiagnostico;
    String preServicosCustos;
    String item;
    String servico;
    String valorPecaServico;
    String quantidadePecas;
    String valorMaodeObra;
    Double valorTotalPecas = 0.0;
    Double valorTotalMaodeObra = 0.0;
    Double valorTotalPeca = 0.0;
    String subTotal;
    
    void Servicos(){
        this.preDiagnostico = preDiagnostico;
        this.preServicosCustos = preServicosCustos;
        this.item = item;
        this.servico = servico;  
        this.valorPecaServico = valorPecaServico;      
        this.quantidadePecas = quantidadePecas;
        this.valorMaodeObra = valorMaodeObra;        
        this.valorTotalPecas = valorTotalPecas;
        this.valorTotalMaodeObra = valorTotalMaodeObra;
        this.valorTotalPeca = valorTotalPeca;
        this. subTotal = subTotal;   
    }

    public String getPreDiagnostico() { return preDiagnostico;}

    public void setPreDiagnostico(String preDiagnostico) { this.preDiagnostico = preDiagnostico;}

    public String getPreServicosCustos() { return preServicosCustos;}

    public void setPreServicosCustos(String preServicosCustos) { this.preServicosCustos = preServicosCustos;}

    public String getItem() { return item;}

    public void setItem(String item) {  this.item = item;}

    public String getServico() { return servico;}

    public void setServico(String servico) { this.servico = servico;}

    public String getValorPecaServico() {  return valorPecaServico;}

    public void setValorPecaServico(String valorPecaServico) { this.valorPecaServico = valorPecaServico;}

    public String getQuantidadePecas() {  return quantidadePecas;}

    public void setQuantidadePecas(String quantidadePecas) { this.quantidadePecas = quantidadePecas;}

    public String getValorMaodeObra() { return valorMaodeObra;}

    public void setValorMaodeObra(String valorMaodeObra) { this.valorMaodeObra = valorMaodeObra;}

    public Double getValorTotalPecas() {  return valorTotalPecas;}

    public void setValorTotalPecas(Double valorTotalPecas) { this.valorTotalPecas = valorTotalPecas;}

    public Double getValorTotalMaodeObra() { return valorTotalMaodeObra;}

    public void setValorTotalMaodeObra(Double valorTotalMaodeObra) { this.valorTotalMaodeObra = valorTotalMaodeObra;}

    public Double getValorTotalPeca() { return valorTotalPeca;}

    public void setValorTotalPeca(Double valorTotalPeca) { this.valorTotalPeca = valorTotalPeca;}

    public String getSubTotal() { return subTotal;}

    public void setSubTotal(String subTotal) { this.subTotal = subTotal;}
    
    
}
