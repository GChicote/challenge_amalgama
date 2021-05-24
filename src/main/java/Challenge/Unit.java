package Challenge;

/**
 *
 * @author Gabriel
 */
public abstract class Unit {
    
    protected int strength;
    protected int strengthOnTrain;
    protected int trainCost;
    protected int transformCost;
    protected boolean canTransform;
    
    public  Unit() {}

    // Getters
    public int getStrength() {
        return strength;
    }

    public int getStrengthOnTrain() {
        return strengthOnTrain;
    }

    public int getTrainCost() {
        return trainCost;
    }
    
    public int getTransformCost() {
        return transformCost;
    }
    
    public boolean canTransform() {
        return this.canTransform;
    }


    ////////////////////////////////////////////////////////////////////////////
    protected void train() {
        this.strength += this.strengthOnTrain;
    }
    
    abstract public Unit transform();
    
}
