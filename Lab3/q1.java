import java.util.*;

class Film {
    String name;
    String language;
    String category;
    String lead_actor;
    int run_time;

    Film() {
        language = null;
        name = null;
        category = null;
        lead_actor = null;
        run_time = 0;
    }

    Film(String name, String language, String category, String lead_actor, int run_time) {
        this.language = language;
        this.category = category;
        this.lead_actor = lead_actor;
        this.run_time = run_time;
    }

    public void get_input() {
        System.out.println("Enter the details of the movie:\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:\t");
        this.name = sc.nextLine();
        System.out.println("Category:\t");
        this.category = sc.nextLine();
        System.out.println("Language:\t");
        this.language = sc.nextLine();
        System.out.println("Lead Actor:\t");
        this.lead_actor = sc.nextLine();
        System.out.println("Run Time:\t");
        this.run_time = sc.nextInt();
    }
}

class FilmMain {

    public static void main(String[] args) {

        Film films;
        Vector<Film> Films = new Vector<Film>();

        films = new Film();
        films.name = "Terminator";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.run_time = 10;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "Terminator 2";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.run_time = 20;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "Robot 1";
        films.language = "Tamil";
        films.lead_actor = "Rajini";
        films.run_time = 10;
        films.category = "Comedy";
        Films.add(films);

        films = new Film();
        films.name = "Robot 2";
        films.language = "Tamil";
        films.lead_actor = "Rajini";
        films.run_time = 30;
        films.category = "Comedy";
        Films.add(films);

        int min = 9999999;
        int imin = 0;

        for(int i = 0; i < 4; i++){
            films = Films.get(i);
            if(films.lead_actor.equals("Arnold"))
                if(films.run_time < min){
                    min = films.run_time;
                    imin = i;
                }
            if(films.category.equals("Comedy"))
                System.out.println(films.name + " is a Comedy movie");
            if(films.lead_actor.equals("Rajini") || films.lead_actor.equals("Shahrukh"))
                System.out.println(films.name + " is a movie with Rajni or Shahrukh");
        }

        films = Films.get(imin);
        System.out.println("Shortest Arnold film is " + films.name + " and run time: " + min);
    }

}