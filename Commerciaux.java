
package heritageemployes;

public class Commerciaux extends Employe {
   private int volumeVente;
   
    public Commerciaux(String n, String p, int pts, int v){
        super(n,p,pts);
        this.volumeVente = v;
    }
}