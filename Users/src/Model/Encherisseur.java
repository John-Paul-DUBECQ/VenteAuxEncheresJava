package Model;

public class Encherisseur {

    private String pseudo;
    private Encherisseur encherisseur;

    public Encherisseur(String pseudo){
        this.pseudo = pseudo;
    }

    public String getPseudo(){
        return pseudo;
    }

    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }

    public Encherisseur getEncherisseur(){
        return encherisseur;
    }

    public void setEncherisseur(Encherisseur encherisseur){
        this.encherisseur = encherisseur;
    }

    @Override
    public String toString() {
        return this.pseudo;
    }
}
