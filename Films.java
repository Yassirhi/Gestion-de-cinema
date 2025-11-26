import java.util.ArrayList;

public class Films {
    int id ;
    String titre;
    String duree;
    String categorie;
    Liste<Seances> sceances;
    public Films(int id, String titre, String duree, String categorie) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
        this.sceances = new ArrayList<>();
    }

}
