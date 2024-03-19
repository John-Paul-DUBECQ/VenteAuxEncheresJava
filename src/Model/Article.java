package Model;

public class Article {
    private int numero;
    private String description;
    private float prix;

    public Article(int numero, String description, float prix){
        this.prix = prix;
        this.description = description;
        this.numero = numero;
    }

    private int getNumero(){
        return this.numero;
    }

    private void setNumero(int numeroAChanger){
        this.numero = numeroAChanger;
    }

    private String getDescription(){
        return this.description;
    }

    private void setDescription(String descriptionAChanger){
        this.description = descriptionAChanger;
    }

    private float getPrix(){
        return this.prix;
    }

    private void setPrix(float prixAChanger){
        this.prix = prixAChanger;
    }
}
