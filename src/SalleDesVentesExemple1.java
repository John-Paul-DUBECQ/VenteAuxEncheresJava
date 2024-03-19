import Model.*;


public class SalleDesVentesExemple1 {
    public static void main(String[] args) {
        Article articleAVendre= new Article(1,"Tableau de maître",1);
        Vente vente;
// Création du singleton pour la vente et initialisation
        vente = Vente.getInstance();
        vente.setArticle(articleAVendre);
        vente.debutDeVente();
// Création d'enchérisseur
// Ajout des enchérisseur à la vente
        Encherisseur encherisseur1=new Encherisseur("Marcel");
        ajoutEncherisseur(encherisseur1, vente);
        Encherisseur encherisseur2=new Encherisseur("Honorine");
        ajoutEncherisseur(encherisseur2, vente);
        Encherisseur encherisseur3=new Encherisseur("Hortense");
        ajoutEncherisseur(encherisseur3, vente);
        Encherisseur encherisseur4=new Encherisseur("Marcel");
        ajoutEncherisseur(encherisseur1, vente);
// L'enchérisseur propose une enchère
        float montant=(float)20;
        encherirSurVente(vente,encherisseur1,montant);
    }

    public static void ajoutEncherisseur(Encherisseur encherisseur, Vente vente){
        if (vente.addEncherisseur(encherisseur))
        {
            System.out.println(encherisseur.getPseudo() + " a été ajouté");
        }
        else
        {
            encherisseur.setPseudo(encherisseur.getPseudo()+1);
            System.out.println("Le pseudo de l'enchérisseur existe déjà. Pseudo transformé en"+encherisseur);
            vente.addEncherisseur(encherisseur);
        }
    }
    public static void encherirSurVente(Vente vente, Encherisseur encherisseur, Float montant){
        if (vente.encherir(encherisseur, montant)){
            System.out.println(encherisseur+" mène l'enchère avec "+montant+" €");
        }
        else {
            System.out.println("Montant trop bas. L'enchère de "+montant+" € de " + encherisseur+" a été rejetée.");
        }
    }
}
