package Challenge;

/**
 *
 * @author Gabriel
 */
public class Unit {
    private UnitType unit;

    
    public  Unit(UnitType type) {
        this.unit = type;
    }

    
    public int getStrength() {
        return this.unit.getStrength();
    }
    
    public int getStrengthOnTrain() {
        return this.unit.getStrengthOnTrain();
    }
    
    public int getTrainCost() {
        return this.unit.getTrainCost();
    }
    
    public int getTransformCost() {
        return this.unit.getTransformCost();
    }
    
    public boolean canTransform() {
        return this.unit.canTransform();
    }
    
    
    public UnitType getUnitType() {
        return this.unit;
    }
    
    protected void train() {
        this.unit.train();
    }
    
    protected void transform() {
        this.unit = this.unit.transform();
    }
    
}
