
package heritageemployes;

public class Responsables extends Employe {
    
    public Responsables(String n, String p, int pts){
        super(n, p, pts);
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
        
    
}
