package Models;

public class ClientAffichage {


    public void afficherClient(Client c){
        System.out.println("Nom"+c.Nom);
        System.out.println("Prenom"+ c.Prenom);
        System.out.println("Code"+c.Code);
        System.out.println("AdressDeNaissance"+c.AnneeDeNaisance);
        System.out.println("Adresse"+c.Adresse);
    }
}
