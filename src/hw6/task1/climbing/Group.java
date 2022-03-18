package hw6.task1.climbing;

import hw6.task1.climbing.Climber;
import hw6.task1.climbing.Mountain;
import java.util.Arrays;

public class Group {
    private Mountain mountain;
    public Mountain getMountain() {
        return mountain;
    }
    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    private Climber[] climbers = new Climber[3];
    public void addClimber(Climber climber){
        for (int i = 0; i < climbers.length; i++){
            if (climbers[i] == null){
                climbers[i] = climber;
                return;
            }
        }
        System.out.println("Мест нет, группа для восхождения на гору "+ mountain.getMountainName() + " заполнена");
    }
    public void addClimber(Climber...climbers){
        System.out.print("Альпинисты: ");
        for (Climber climber:climbers){
            addClimber(climber);
            System.out.print(climber.getNameAndAdress() + "; ");
        }
        System.out.print(" - поднимаются на гору " + mountain.getMountainName() + " в " + mountain.getMountainCountry() + " высотой "+ mountain.getMountainHeight() + " м.\n" );
    }

    public Group(Mountain mountain) {
        this.mountain = mountain;
    }
}
