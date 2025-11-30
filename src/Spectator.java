import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Spectator {
    private int id_spectator;
    private String name;
    private String email;
    List<Ticket> Tickets;

    public Spectator( String name, String email){
        this.name = name;
        this.email = email;
        this.Tickets = new ArrayList<>();
    }

    public int getId_spectator() {return id_spectator;}
    public void setId_spectator(int id_spectator) {this.id_spectator = id_spectator;}
    public  String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public List<Ticket> getTickets() {return Tickets;}
    public void setTickets(List<Ticket> tickets) {this.Tickets = tickets;}

    public void ajouterSpectator() {
        try {
            String sql = "INSERT INTO Spectator (Nom, email) VALUES (?, ?)";
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, this.name);
            ps.setString(2, this.email);
            ps.executeUpdate();
            // Get the auto-generated ID
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                this.id_spectator = rs.getInt(1); // update the ID
            }
            System.out.println("Spectator inserted with ID: " + this.id_spectator);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void acheterTicket(Ticket t) {
        try {
            String sql = "INSERT INTO ticket (numerounique,prix,spectator_id,seance_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, t.getnumerounique());
            ps.setDouble(2, t.getprix());
            ps.setInt(3, t.getSpectateur().getId_spectator());
            ps.setInt(4, t.getSeances().getId());   
            ps.executeUpdate();
            System.out.println("Ticket inserted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void afficherTickets(){
        try{  String sql = "SELECT * from  ticket";
            PreparedStatement stmt=DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            System.out.println("    ========== Ticket ============");
            while(rs.next()){
            System.out.println("id :"+rs.getInt("id")
            +" Numero Unique : "+rs.getInt("numerounique")
            +" Teckit Prix : "+rs.getDouble("prix")
            +" Spectator id :"+rs.getInt("spectator_id")
            +" Seance id : "+rs.getInt("seance_id")
            );
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Spectator> afficherSpectators() {
        List<Spectator> spectators = new ArrayList<>();
        try {
            String sql = "SELECT * FROM spectator";
            Statement stmt = DatabaseConnection.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("     ========== Spectator ============");
            while (rs.next()) {
                System.out.println("id :"+rs.getInt("id_spectator")+", Nom :"+rs.getString("Nom")+ "email :"+rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return spectators;
    }
}