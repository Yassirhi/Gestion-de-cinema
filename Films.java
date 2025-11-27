import java.util.ArrayList;

public class Films {
     int id ;
    private String titre;
    private String duree;
    private String categorie;
    List<Seances> seances;
    public Films(int id, String titre, String duree, String categorie) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
        this.seances = new List<Seances>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void ajouterSeance(Seances seance) {
        seances.add(seance);
    }
}
