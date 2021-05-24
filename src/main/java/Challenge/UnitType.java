/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

/**
 *
 * @author Gabriel
 */
public abstract class UnitType {
    protected int strength;
    protected int strengthOnTrain;
    protected int trainCost;
    protected int transformCost;
    protected boolean canTransform;
    
    public UnitType() {}
    
    
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
    

    
    protected void train() {
        this.strength += this.strengthOnTrain;
    }
    
    abstract public UnitType transform();
    
}
