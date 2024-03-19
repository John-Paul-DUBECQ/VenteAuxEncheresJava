package Model;

public class Enchere {
    private Float montantOffre;
    private Enchere enchere;

    public Float getMontantOffre(){
        return this.montantOffre;
    }

    public void setMontantOffre(Float montantOffre){
        this.montantOffre = montantOffre;
    }

    public Enchere getEnchere(){
        return this.enchere;
    }

    public void setEnchere(Enchere enchere){
        this.enchere = enchere;
    }
}
