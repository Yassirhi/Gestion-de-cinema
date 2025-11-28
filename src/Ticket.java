public class Ticket {
    private int numerounique;
    private int prix;
    private Spectateur spectateur;
    private Seances seances;


    public Ticket() {
        this.numerounique = 0;
        this.prix = 0;
        this.spectateur = null;
        this.seances = null;
    }
    public Ticket(int numerounique, int prix, Spectateur spectateur, Seances seances) {
        this.numerounique = numerounique;
        this.prix = prix;
        this.spectateur = spectateur;
        this.seances = seances;
    }

    public int getnumerounique() {
        return numerounique;
    }

    public void setnumerounique(int numerounique) {
        this.numerounique = numerounique;
    }

    public int getprix() {
        return prix;
    }

    public void setprix(int prix) {
        this.prix = prix;
    }

    public Spectateur getSpectateur() {
        return spectateur;
    }

    public void setSpectateur(Spectateur spectateur) {
        this.spectateur = spectateur;
    }

    public Seances getSeances() {
        return seances;
    }

    public void setSeances(Seances seances) {
        this.seances = seances;
    }

    public void displayInfo() {
        System.out.println("numerounique : " + numerounique);
        System.out.println("prix : " + prix);

        if (spectateur != null) {
            System.out.println("Spectateur : " + spectateur.getNom());
        }

        if (seances != null) {
            System.out.println("Séance : " + seances.getDate());
        }
    }
}

