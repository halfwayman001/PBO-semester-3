package dependency;

/**
 *
 * @author Lenovo
 */
public class Bonus extends tabungan {
    
    private int bunga;
    tabungan tbgn = new tabungan();
    
    Bonus(int bunga){
        this.bunga = bunga + tbgn.banyakTabungan;
    }
    
    public int getBonus(){
        return this.bunga;
    }
    
}
