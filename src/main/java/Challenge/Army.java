package Challenge;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Gabriel
 */
public abstract class Army {
    
    protected int pikemen;
    protected int archers;
    protected int knights;
    protected ArrayList<Unit> units;
    protected int goldCoins;
    protected ArrayList<Battle> battleHistory;

    public Army() {
        this.units = new ArrayList<>();
        this.goldCoins = 1000;
        this.battleHistory = new ArrayList<>();
    }
    
    
    // Getters
    public int getPikemen() {
        return pikemen;
    }

    public int getArchers() {
        return archers;
    }

    public int getKnights() {
        return knights;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public ArrayList<Battle> getBattleHistory() {
        return battleHistory;
    }

    // Setters
    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    ////////////////////////////////////////////////////////////////////////////  
    public int armyStrength() {
        return this.units.stream().reduce(0, (Integer p, Unit u) -> {
            return p + u.getStrength();
        }, Integer::sum);
    }
    
    public Unit mostPowerfulUnit() {
        return units
                .stream()
                .max( Comparator.comparing(Unit::getStrength) )
                .orElseThrow();
    }
    
    public Unit lessPowerfulUnit() {
        return units
                .stream()
                .min( Comparator.comparing(Unit::getStrength) )
                .orElseThrow();
    }
    
    public void dischargeUnit(Unit u) {
        this.units.remove(u);
    }
    
    public void train(Unit u) throws InsufficientGoldException {
        if (canTrain(u)) {
            this.setGoldCoins(getGoldCoins() - u.getTrainCost());
            u.train();
        } else {
            throw new InsufficientGoldException("Not onough gold to train unit!");
        }
    }
    
    public void transform(Unit u) throws CannotTransformException, InsufficientGoldException {
        if (canTransform(u)) {
            this.dischargeUnit(u);
            this.units.add(u.transform());
        }
        else if (!u.canTransform())
            throw new CannotTransformException("This unit is unable to tansform!");
        else
            throw new InsufficientGoldException("Not enough gold to transform unit!");
    }
    
    public void addBattleTohistory(Battle battle) {
        this.battleHistory.add(battle);
    }
    
    public void attack(Army enemy) {
        Battle batalla = new Battle(this, enemy);
        batalla.applyConsequences();
        this.addBattleTohistory(batalla);
        enemy.addBattleTohistory(batalla);
    }
    
    public boolean canTransform(Unit u) {
        return this.getGoldCoins() >= u.getTransformCost() && u.canTransform(); 
    }
    
    public boolean canTrain(Unit u) {
        return this.getGoldCoins() >= u.getTrainCost();
    }
    
}
