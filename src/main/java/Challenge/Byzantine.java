package Challenge;

/**
 *
 * @author Gabriel
 */
public class Byzantine extends Army {
    
    public Byzantine() {
        this.pikemen = 5;
        this.archers = 8;
        this.knights = 15;
        for (int i=0; i<this.pikemen; i++)
            units.add(new Unit(new Pikeman()));
        for (int i=0; i<this.archers; i++)
            units.add(new Unit(new Archer()));
        for (int i=0; i<this.knights; i++)
            units.add(new Unit(new Knight()));
    }

}
