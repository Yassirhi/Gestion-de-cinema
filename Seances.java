import java.time.LocalDateTime;

public class Seances {
    private int id;
    private Film film; // relation avec Film
    private LocalDateTime horaire;
    private String salle;
    private int capaciteMax;


    public Seances(int id, Film film, LocalDateTime horaire, String salle, int capaciteMax) {
        this.id = id;
        this.film = film;
        this.horaire = horaire;
        this.salle = salle;
        this.capaciteMax = capaciteMax;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Film getFilm() { return film; }
    public void setFilm(Film film) { this.film = film; }

    public LocalDateTime getHoraire() { return horaire; }
    public void setHoraire(LocalDateTime horaire) { this.horaire = horaire; }

    public String getSalle() { return salle; }
    public void setSalle(String salle) { this.salle = salle; }

    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }
}
