/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hopital;

/**
 *
 * @author pierre
 */
public class Employe {
    protected int numero;
    protected String nom;
    protected String prenom;
    protected String adress;
    protected int tel;
    
    public Employe(int numero, String nom, String prenom, String adress, int tel){
        this.numero=numero;
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.tel=tel;             
    }

    
    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdress() {
        return adress;
    }

    public int getTel() {
        return tel;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}
