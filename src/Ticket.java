public class Ticket {
    private int id;
    private double prix;

    public Ticket(int id, double prix) {
        this.id = id;
        this.prix = prix;

    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public double getPrix() {return prix;}
}
