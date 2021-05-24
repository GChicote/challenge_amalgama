package Challenge;

/**
 *
 * @author Gabriel
 */
public class Pikeman extends UnitType {
    
    public Pikeman() {
        this.strength = 5;
        this.strengthOnTrain = 3;
        this.trainCost = 10;
        this.transformCost = 30;
        this.canTransform = true;
    }

    @Override
    public Archer transform() {
        return new Archer();
    }
    
}
