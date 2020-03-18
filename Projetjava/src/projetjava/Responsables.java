
package ProjetJava;

import java.util.HashSet;

public class Responsables extends Employe implements Payable {

    private HashSet<Employe> listeEmployes;
    
    public Responsables(String n, String p, int pts){
        super(n, p, pts);
        HashSet<Employe> listeEmployes = new HashSet();
    }   
        public String toString() {
         return super.toString();
        }
        public String getNom() {
            return super.getNom();
}
        public String getPrenom(){
            return super.getPrenom();
        }
        public int getMatricule(){
            return super.getMatricule();
        }
        public int getPoints(){
            return super.getPoints();
        }
        
        public int calculSalaire(){
            int salaire = this.points*12;
            return salaire;
    
        }
        public void addEmploye(Employe emp){
            listeEmployes.add(emp);
        }
    
}
