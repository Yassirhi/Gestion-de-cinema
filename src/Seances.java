import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Seances {
    private int id;
    private Film film; // relation avec Film
    private String horaire;
    private String salle;
    private int capaciteMax;


    public Seances(int id, Film film, String horaire, String salle, int capaciteMax) {
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
    public  String getHoraire() { return horaire;}
    public String getSalle() { return salle; }
    public void setSalle(String salle) { this.salle = salle; }
    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }

    public void afficherSeance(){
        try{  String sql = "SELECT * from  seance";
            PreparedStatement stmt=DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            System.out.println("    =========== Seance =========== ");
            while(rs.next()){
                System.out.println("film_id :"+rs.getString("film_id")
                +" Horaire :"+rs.getString("horaire")
                +" Salle :"+rs.getString("salle")
                +" Capacite Max :"+rs.getString("capaciteMax")
            );
                
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}