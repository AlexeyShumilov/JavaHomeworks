package hw6.task1;

import hw6.task1.climbing.Climber;
import hw6.task1.climbing.Group;
import hw6.task1.climbing.Mountain;

import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args){

       Climber[] climbers1 = new Climber[3];

       climbers1[0] = new Climber("John", "New York");
       climbers1[1] = new Climber("Andrew", "Marselle");
       climbers1[2] = new Climber("Vasya", "Moscow");

       Climber[] climbers2 = new Climber[2];
       climbers2[0] = new Climber("Maria", "Edinburgh");
       climbers2[1] = new Climber("Alex", "Madrid");

       Climber[] climbers3 = new Climber[2];
       climbers3[0] = new Climber("Vladislav", "Saratov");
       climbers3[1] = new Climber("Jane", "Chicago");

        Mountain mountain1 = new Mountain("Everest", "Nepal", 8849);
        Mountain mountain2 = new Mountain("Kilimanjaro", "Tanzania", 5895);
        Mountain mountain3 = new Mountain("Montblanc", "France", 4810);

        Group group1 = new Group(mountain1);
        Group group2 = new Group(mountain2);
        Group group3 = new Group(mountain3);

        group1.addClimber(climbers1);
        group2.addClimber(climbers2);
        group3.addClimber(climbers3);

    }
}
