package hw6.task1;

import hw6.task1.climbing.Climber;
import hw6.task1.climbing.Group;
import hw6.task1.climbing.Mountain;

import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args){

       Climber climber1 = new Climber("John", "New York");
       Climber climber2 = new Climber("Andrew", "Marselle");
       Climber climber3 = new Climber("Vasya", "Moscow");
       Climber climber4 = new Climber("Maria", "Edinburgh");
       Climber climber5 = new Climber("Alex", "Madrid");
       Climber climber6 = new Climber("Vladislav", "Saratov");
       Climber climber7 = new Climber("Jane", "Chicago");

        Mountain mountain1 = new Mountain("Everest", "Nepal", 8849);
        Mountain mountain2 = new Mountain("Kilimanjaro", "Tanzania", 5895);
        Mountain mountain3 = new Mountain("Montblanc", "France", 4810);

        Group group1 = new Group(mountain1);
        Group group2 = new Group(mountain2);
        Group group3 = new Group(mountain3);

        group1.addClimber(climber1, climber2, climber3, climber5);
        group2.addClimber(climber4, climber5);
        group3.addClimber(climber6, climber7);

    }
}
