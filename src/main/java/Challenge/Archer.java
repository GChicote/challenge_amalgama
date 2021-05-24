package Challenge;

/**
 *
 * @author Gabriel
 */
public class Archer extends Unit {
    
    public Archer() {
        this.strength = 10;
        this.strengthOnTrain = 7;
        this.trainCost = 20;
        this.transformCost = 40;
        this.canTransform = true;
    }
    
    @Override
    public Knight transform() {
        return new Knight();
    }
    
}
