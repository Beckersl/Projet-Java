/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author waityouc
 */
public class Employe {
    
    private String nom;
    private String prenom;
    static int compteur = 0;
    private int matricule;
    
public Employe (String n,String p){
   

    this.nom = n;
    this.prenom = p;
    this.compteur += 1;
    this.matricule = this.compteur;
}

    public String getNom() {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getPrenom() {
        return prenom;
    }

@Override
public String toString(){
    
    return "Rôle: "+this.getClass().getSimpleName()+" \n Nom : "+this.nom+"\n Prénom : "+this.prenom+"\n Matricule : "+this.matricule;
}

}


