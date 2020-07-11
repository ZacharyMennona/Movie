import java.text.DecimalFormat;

class Movie
{
    public String title;
    public int year;
    public String director;
    public int duration;
    public String actors;
    public String genre;
    public double rating;

    Movie(String title, int year, String director,
                 int duration, String actors, String genre,
                 double rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.actors = actors;
        this.genre = genre;
        this.rating = rating;
    }

}

    public class mennonaIMDB extends Movie {
        mennonaIMDB(String title, int year, String director, int duration, String actors, String genre, double rating) {
            super(title, year, director, duration, actors, genre, rating);
        }

        public static void main(String[] args) {
            Movie[] arr;
            arr = new Movie[10];
            arr[0] = new Movie("The Shawshank Redemption",
                    1994,
                    "Frank Darabont",
                    142,
                    "Timm Robbins, Morgan Freeman, and Bob Gunton",
                    "Drama",
                    Math.random()*10);
            arr[1] = new Movie("The Godfather",
                    1972,
                    "Francis Coppola",
                    175,
                    "Marlon Brando, Al Pacino",
                    "Crime, Drama",
                    Math.random()*10);
            arr[2] = new Movie("The Godfather: Part II",
                    1974,
                    "Francis Coppola",
                    202,
                    "Al Pacino, Robert De Niro, Robert Duvall",
                    "Crime, Drama",
                    Math.random()*10);
            arr[3] = new Movie("The Dark Knight",
                    2008,
                    "Christopher Nolan",
                    152, "Christian Bale, Heath Ledger",
                    "Action, Crime, Drama",
                    Math.random()*10);
            arr[4] = new Movie("12 Angry Men",
                    1957, "Sidney Lumet",
                    96, "Henry Fonda Lee, Lee J. Cobb, Martin Balsam",
                    "Crime, Drama",
                    Math.random()*10);
            arr[5] = new Movie("Schindler's List",
                    1993,
                    "Steven Spielberg",
                    195,
                    "Liam Neeson, Ralph Fiennes",
                    "Biography, Drama",
                    Math.random()*10);
            arr[6] = new Movie("The Lord of the Rings: The Return of the King",
                    2003,
                    "Peter Jackson",
                    201,
                    "Elijah Wood, Viggo Mortensen, Ian McKellen, Orlando Bloom",
                    "Adventure, Drama",
                    Math.random()*10);
            arr[7] = new Movie("Pulp Fiction",
                    1994, "Guentin Taratino",
                    154,
                    "John Travolta, Uma Thurman, Samuel L. Jackson, Bruce Willis",
                    "Crime, Drama",
                    Math.random()*10);
            arr[8] = new Movie("The Good, the Bad, and the Ugly",
                    191966,
                    "Sergio Leone",
                    178,
                    "Clint Eastwood",
                    "Western",
                    Math.random()*10);
            arr[9] = new Movie("Fight Club",
                    1999,
                    "David Fincher",
                    175,
                    "Brad Pitt, Edward Norton",
                    "Drama",
                    Math.random()*10);
            DecimalFormat df = new DecimalFormat("###.#");
            for (Movie movie : arr) {
                System.out.println("Title: '" + movie.title + "' || Rating: " + df.format(movie.rating));
            }
            double lowestRating = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(arr[0].rating, arr[1].rating), arr[2].rating), arr[3].rating), arr[4].rating), arr[5].rating), arr[6].rating), arr[7].rating) , arr[8].rating), arr[9].rating);
            double highestRating = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(arr[0].rating, arr[1].rating), arr[2].rating), arr[3].rating), arr[4].rating), arr[5].rating), arr[6].rating), arr[7].rating) , arr[8].rating), arr[9].rating);
            for (Movie movie : arr) {
                if (movie.rating == (highestRating)) {
                    System.out.println("Highest Rated Movie: '" + movie.title + "' || Rating: " + df.format(movie.rating));
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if (movie.rating == (lowestRating)) {
                        System.out.println("Lowest Rated Movie: '" + movie.title + "' || Rating: " + df.format(movie.rating));
                }
            }
            }
        }
