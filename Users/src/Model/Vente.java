package Model;

import java.util.ArrayList; // import the ArrayList class

public class Vente {
    public static Vente instance;
    private Article article = null;
    private ArrayList<Encherisseur> encherisseursList = new ArrayList<Encherisseur>();
    private ArrayList<Enchere> encheresList = new ArrayList<Enchere>();

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public Boolean encherir(Encherisseur encherisseur, Float montant) {
        return true;
    }

    public Vente() {

    }

    public void debutDeVente(){
        String[] args = {"test", "test"};
        Chronometre.main(args);
    }

    public static synchronized Vente getInstance() {
        if (instance == null) {
            instance = new Vente();
        }
        return instance;
    }

    public boolean addEncherisseur(Encherisseur encherisseur) {
            encherisseursList.add(encherisseur);
        return true;
    }

}
