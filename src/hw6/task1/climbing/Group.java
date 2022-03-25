package hw6.task1.climbing;

import hw6.task1.climbing.Climber;
import hw6.task1.climbing.Mountain;
import java.util.Arrays;

public class Group {
    private Mountain mountain;
    int i;

    public Mountain getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    private Climber[] climbers = new Climber[3];

    public void addClimber(Climber climber) {
        for (i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                System.out.println(climber.getNameAndAddress() + "; ");
                return;
            }
        }
        System.out.println("Мест нет, группа для восхождения на гору " + mountain.getMountainName() + " заполнена");
    }

    public void addClimber(Climber... climbers) {
        System.out.print("Альпинисты: ");
        for (Climber climber : climbers) {
            addClimber(climber);
        }
        if (i == (this.climbers.length - 1)) {
            System.out.println(" - группа закрыта и начинает восхождение на гору " + mountain.getMountainName() + " в " + mountain.getMountainCountry() + " высотой " + mountain.getMountainHeight() + " м.");
        } else if (i < (this.climbers.length - 1)) {System.out.println(" - группа восхождения на гору " + mountain.getMountainName() + " открыта. Чтобы начать восхождение, заполните группу до конца.");}
    }

    public Group(Mountain mountain) {
            this.mountain = mountain;
        }

}
