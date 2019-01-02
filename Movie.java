package Jan2018;
import java.util.*;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;

    //default constructor:
    public Movie(){
    }
    //build constructor:

    public Movie(String title, String director, int releaseYear){
        super();
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

//public static Movie[] createMovies(){
//
//
//}

    public static void main(String[] args){

        Movie[] movie = new Movie[2]; //define the variable and set a length to it

        Scanner s = new Scanner(System.in);

        for(int i = 0; i< movie.length; i++) {
            movie[i] = new Movie();
            System.out.println("insert name of the movie");
            String movieName = s.next();
            movie[i].setTitle(movieName);
            System.out.println("insert director");
            String movieDirector = s.next();
            movie[i].setDirector(movieDirector);
            System.out.println("insert year ");
            int yearRelease = s.nextInt();
            movie[i].setReleaseYear(yearRelease);
            //test movie:
            System.out.println("movie you entered was: " + movie[i].getTitle());
        }
        System.out.println("Movies that have been created:");

        for(int i = 0; i< movie.length; i++){
            System.out.println(i+1 +". "+ movie[i].getTitle() + " by " + movie[i].getDirector() + " released in " + movie[i].getReleaseYear());
        }




    }


}

