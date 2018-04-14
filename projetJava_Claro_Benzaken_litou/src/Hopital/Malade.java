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
public class Malade {


    private int numero;
    private String nom;
    private String prenom;
    private String adress;
    private int tel;
    private String mutuelle;
    
    public Malade(int numero, String nom, String prenom, String adress,int tel,String mutuelle){
        this.numero=numero;
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.tel=tel;
        this.mutuelle=mutuelle;
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

    public String getMutuelle() {
        return mutuelle;
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

    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }

    /**
     * permet au patient de sortir de l'hopital une fois qu'il est soigné et de le supprimer de la bdd
     */
    public void sortir(){
        
    }
    

}
