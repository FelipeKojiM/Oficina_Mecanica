/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprogdesktop;

/**
 *
 * @author HP
 */
public class Cliente {
    
    String nomeCliente;
    String logradouroCliente;
    String numeroCliente;
    String telefoneCliente;
    
    void Cliente(){
        this.nomeCliente = nomeCliente;
        this.logradouroCliente = logradouroCliente;
        this.numeroCliente = numeroCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCliente() { return nomeCliente;}

    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente;}

    public String getLogradouroCliente() { return logradouroCliente;}

    public void setLogradouroCliente(String logradouroCliente) {  this.logradouroCliente = logradouroCliente;}

    public String getNumeroCliente() { return numeroCliente; }

    public void setNumeroCliente(String numeroCliente) { this.numeroCliente = numeroCliente;}

    public String getTelefoneCliente() { return telefoneCliente;    }

    public void setTelefoneCliente(String telefoneCliente) { this.telefoneCliente = telefoneCliente;}  
}
