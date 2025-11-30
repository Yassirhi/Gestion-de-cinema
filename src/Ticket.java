public class Ticket {
    private int numerounique;
    private int prix;
    private Seances seances;
    private Spectator spectator;

        public Ticket(int numerounique, int prix, Spectator spectator , Seances seances) {
            this.numerounique = numerounique;
            this.prix = prix;
            this.spectator = spectator;
            this.seances = seances;
    }

    public int getnumerounique() {return numerounique;}
    public void setnumerounique(int numerounique) {  this.numerounique = numerounique;}
    public int getprix() { return prix;}
    public void setprix(int prix) { this.prix = prix;}
    public Spectator getSpectateur() {  return spectator; }
    public Seances getSeances() { return seances;}

    public void setSeances(Seances seances) {
        this.seances = seances;
    }

    public void displayInfo() {
        System.out.println("numerounique : " + numerounique);
        System.out.println("prix : " + prix);

        if (spectator != null) {
            System.out.println("Spectateur : " + spectator.getName());
        }

        if (seances != null) {
            System.out.println("Séance : " + seances.getHoraire());
        }
    }
}

