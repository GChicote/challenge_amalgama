package Challenge;

/**
 *
 * @author Gabriel
 */
public class Chinese extends Army {
    
    public Chinese() {
        this.pikemen = 2;
        this.archers = 25;
        this.knights = 2;
        for (int i=0; i<this.pikemen; i++)
            units.add(new Unit(new Pikeman()));
        for (int i=0; i<this.archers; i++)
            units.add(new Unit(new Archer()));
        for (int i=0; i<this.knights; i++)
            units.add(new Unit(new Knight()));
    }

}
