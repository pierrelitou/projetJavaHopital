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
public class Medecin extends Employe {
    
    private String specialite;
    
    public Medecin(int numero, String nom, String prenom, String adress, int tel, String specialite) {
        super(numero, nom, prenom, adress, tel);
        this.specialite=specialite;
    }
    
}
