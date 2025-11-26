import java.util.ArrayList;
import java.util.List;

public class Spectator {
    private int id_spectator;
    private String name;
    private String email;
    List<Ticket> Tickets;

    public Spectator(int id_spectator, String name, String email){
        this.id_spectator = id_spectator;
        this.name = name;
        this.email = email;
        this.Tickets = new ArrayList<>();
    }

    public int getId_spectator() {return id_spectator;}
    public void setId_spectator(int id_spectator) {this.id_spectator = id_spectator;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public List<Ticket> getTickets() {return Tickets;}
    public void setTickets(List<Ticket> tickets) {this.Tickets = tickets;}

    public void acheterTicket(Ticket t){
        this.Tickets.add(t);
    }

}
