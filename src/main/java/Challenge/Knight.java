package Challenge;

/**
 *
 * @author Gabriel
 */
public class Knight extends Unit {
    
    public Knight() {
        this.strength = 20;
        this.strengthOnTrain = 10;
        this.trainCost = 30;
        this.canTransform = false;
    }
    
    @Override
    public Knight transform() {
        return this;
    }
    
}
