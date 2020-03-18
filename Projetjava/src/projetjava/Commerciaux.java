
package heritageemployes;

public class Commerciaux extends Employe implements Payable {
   private int volumeVente;
   
    public Commerciaux(String n, String p, int pts, int v){
        super(n,p,pts);
        this.volumeVente = v;
    }


    public int calculSalaire(){
        int salaire = this.pts*12+(this.v/10);
        return salaire;

    }
}