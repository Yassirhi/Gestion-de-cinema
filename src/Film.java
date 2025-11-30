import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Film {
    private int id ;
    private String titre;
    private String duree;
    private String categorie;
    List<Seances> seances;

    public Film(int id, String titre, String duree, String categorie) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
        this.seances = new ArrayList<>();
    }
    public int getId() {  return id;}
    public void setId(int id) {  this.id = id;}
    public String getCategorie() { return categorie;}
    public void setCategorie(String categorie) {  this.categorie = categorie;}
    public String getDuree() {return duree;}
    public void setDuree(String duree) {  this.duree = duree; }
    public String getTitre() {   return titre;}
    public void setTitre(String titre) { this.titre = titre; }
    
    public void afficherFilms(){
        try{  String sql = "SELECT * from  Film";
            PreparedStatement stmt=DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            System.out.println("    =========== Films ==========");
            while(rs.next()){
                System.out.println("titre :"+rs.getString("titre")
                +" Duree :"+rs.getString("duree")
                +" Categorie :"+rs.getString("categorie")
            );
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ajouter_sience(Seances seance){
        try{
            String  sql = "INSERT INTO seance (film_id, horaire, salle, capaciteMax) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, seance.getId());
            ps.setString(2, seance.getHoraire());
            ps.setString(3, seance.getSalle());
            ps.setInt(4, seance.getCapaciteMax());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            System.out.println("Seance ajouté !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void ajouterFilm() {
        // seances.add(seance);
      try{  String sql = "INSERT INTO Film(titre,duree,categorie) VALUES (?,?,?)";
        PreparedStatement stmt=DatabaseConnection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // stmt.setInt(1, id);
            stmt.setString(1, titre);
            stmt.setString(2, duree);
            stmt.setString(3, categorie);
            stmt.executeUpdate();
            System.out.println("Film ajouté !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
