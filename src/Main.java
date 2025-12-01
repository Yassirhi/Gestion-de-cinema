
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Film films = new Film(1, "film1", "23", "Heror");
        Film films1 = new Film(1, "film1", "23", "Heror");
        Seances seance = new Seances(1, films, "23", "12", 234);
        Spectator spectator = new Spectator("Anass", "anass23@gmail.com");
        Spectator spectator1 = new Spectator("Ayoub", "ayoub32@gmail.com");
        Ticket ticket = new Ticket(12, 1470, spectator1,seance);
        Scanner input = new Scanner(System.in);
        int choix;
        do {
            // Display menu
            System.out.println("===== Cinema Management System =====");
            System.out.println("1. Ajouter film");
            System.out.println("2. Afficher film");
            System.out.println("3. Ajouter Seances");
            System.out.println("4. Afficher Seances");
            System.out.println("5. Ajouter Spectators");
            System.out.println("6. Afficher Spectators");
            System.out.println("7. Ajouter Tickets");
            System.out.println("8. Afficher Tickets");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choix = input.nextInt();
            switch (choix) {
                case 1:
                    films1.ajouterFilm();
                    break;
                case 2:
                    films.afficherFilms();
                    break;
                case 3:
                    films.ajouter_sience(seance);
                    System.out.println("Seance ID: " + seance.getId() + ", Film: " + seance.getFilm().getTitre());
                    spectator.acheterTicket(ticket);
                    break;
                case 4:
                    seance.afficherSeance();
                    break;
                case 5:
                    spectator1.ajouterSpectator();
                    break;
                case 6:
                    Spectator.afficherSpectators();
                    break;
                case 7:
                   spectator.acheterTicket(ticket);
                    break;
                case 8:
                    spectator.afficherTickets();
                    break;
                    case 9:
                        System.exit(0);
                default:
                    System.out.println("Invalid choice!.");
            }
            System.out.println(); // empty line
        } while (choix != 0);
        input.close();
    }
}
