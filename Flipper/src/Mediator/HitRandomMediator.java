package Mediator;

import Flipper.Bumper;
import Flipper.Target;

import java.util.Random;

public class HitRandomMediator implements Mediator {
    private Bumper bumper;
    private Target target;


    public HitRandomMediator(Bumper bumper, Target target){
        this.bumper = bumper;
        this.target = target;
    }

    @Override
    public void flipperElementHitSequence() {
        boolean checkPlay = true;
        Random random = new Random();

        while (checkPlay == true) {

            int randomNumber = random.nextInt(5);
            int randomHits = random.nextInt(10);

            switch (randomNumber) {
                case 0:
                    System.out.println("Lost Ball");
                    checkPlay = false;
                    break;
                case 1:
                case 2:
                case 3:
                    bumper.bumperGetsHit(randomHits);
                    System.out.println("Hit Bumper");
                    break;
                case 4:
                case 5:
                    target.targetGetsHit(randomHits);
                    System.out.println("Hit Target");
                    break;

            }
        }

    }

}
