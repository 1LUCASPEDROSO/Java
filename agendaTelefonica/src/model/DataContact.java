/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 182120037
 */
public class DataContact {
     private int idContato;
    private String nomeCOntato;
    private int telefoneContato;
    private String emailContato;  

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNomeCOntato() {
        return nomeCOntato;
    }

    public void setNomeCOntato(String nomeCOntato) {
        this.nomeCOntato = nomeCOntato;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
         
}
