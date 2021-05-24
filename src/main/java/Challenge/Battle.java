package Challenge;

/**
 *
 * @author Gabriel
 */
public class Battle {
    
    protected Army winner;
    protected Army loser;
    protected Army attacker;
    protected Army defender;
    protected boolean tie;
    
    public Battle(Army attacker, Army defender) {
        this.attacker = attacker;
        this.defender = defender;
        battleResult();
    }


    public Army getWinner() {
        return winner;
    }

    public Army getLoser() {
        return loser;
    }

    public Army getAttacker() {
        return attacker;
    }

    public Army getDefender() {
        return defender;
    }    
    
    ////////////////////////////////////////////////////////////////////////////
    public void applyConsequences() {
        if (tie) {
            this.attacker.dischargeUnit(this.attacker.mostPowerfulUnit());
            this.defender.dischargeUnit(this.defender.lessPowerfulUnit());
        }
        else {
            this.winner.setGoldCoins(this.winner.getGoldCoins() + 100);
            this.loser.dischargeUnit(this.loser.mostPowerfulUnit());
            this.loser.dischargeUnit(this.loser.mostPowerfulUnit());            
        }
    }

    private void battleResult() {
        if (this.attacker.armyStrength() == this.defender.armyStrength()) tie = true;
        this.winner = this.attacker.armyStrength() > this.defender.armyStrength() ? this.attacker : this.defender;
        this.loser = this.winner == this.attacker ? this.defender : this.attacker;
    }
    
    
}
