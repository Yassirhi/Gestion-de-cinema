import java.sql.Connection;
import java.sql.SQLException;

class main
{
    public static void main(String[] args) {
        Film film = new Film(1,"inception","128","ACTION");
        film.ajouterFilm();
        film.afficherFilms();
    }
}