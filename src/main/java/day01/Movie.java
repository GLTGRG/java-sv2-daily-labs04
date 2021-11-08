package day01;


import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfPublication;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfPublication) {
        this.title = title;
        yearOfPublication = yearOfPublication;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int counter =  0;

        for (Actor actual : actors){
            int age = yearOfPublication-actual.getYearOfBirth();
            if (age >= 20 && age <= 30) {
                counter++;
            }
        }
        return counter;
    }
}
