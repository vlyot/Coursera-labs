package Lab2;

public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        for (int idx = 0; idx < superheroes.length; idx++) {
            String elem = superheroes[idx];
            System.out.println(elem);
            
        }
        //TODO 1: Print all the 5 superheroes names as suggested in the example

        // Print the introduction years
        System.out.println("Introduction Years:");
        for (int idx = 0; idx < introductionYears.length; idx++) {
            int elem = introductionYears[idx];
            System.out.println(elem);
            
        }
        // TODO 4a: print the original year of introduction of the third superhero 
        // TODO 4b: modify the year of introduction of the third superhero
        // TODO 4c: print the modified year of introduction of the third superhero

        System.out.println(superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println(superheroes[2]);
        System.out.println(introductionYears[2]);
        introductionYears[2] =  2011;
        System.out.println(introductionYears[2]);

        // TODO 5a: print the length of the array containing superhero names
        // TODO 5b: print the length of the array containing superhero year of introduction
        int lnames = superheroes.length;
        System.out.println(lnames);

        System.out.println(introductionYears.length);
    }
}
