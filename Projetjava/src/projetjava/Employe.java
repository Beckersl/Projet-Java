
package heritageemployes;

public class Employe implements Payable{
     private String nom;
    private String prenom;
    static int compteur = 0;
    private int matricule;
    private int points;
    
public Employe (String n,String p, int pts){
   
    this.nom = n;
    this.prenom = p;
    this.points = pts;
    Employe.compteur += 1;
    this.matricule = Employe.compteur;
    
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
    public int getPoints(){
        return points;
    }

    public int calculSalaire(){
        int salaire = this.pts*12;
        return salaire;

    }

@Override
public String toString(){
    
    return "Rôle: "+this.getClass().getSimpleName()+" \n Nom : "+this.nom+"\n Prénom : "+this.prenom+"\n Matricule : "+this.matricule;
}

    
}
