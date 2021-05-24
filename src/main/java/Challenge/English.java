package Challenge;

/**
 *
 * @author Gabriel
 */
public class English extends Army {
    
    public English() {
        this.pikemen = 10;
        this.archers = 10;
        this.knights = 10;
        for (int i=0; i<this.pikemen; i++) {
            units.add(new Pikeman());
            units.add(new Archer());
            units.add(new Knight());
        }
    }
    
}
