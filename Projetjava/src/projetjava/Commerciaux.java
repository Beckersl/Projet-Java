
package projetjava;

public class Commerciaux extends Employe implements Payable {
   private int volumeVente;
   
    public Commerciaux(String n, String p, int pts, int v){
        super(n,p,pts);
        this.volumeVente = v;
    }


    public int calculSalaire(){
        int salaire = this.getPoints()*12+(this.volumeVente/10);
        return salaire;

    }
}
