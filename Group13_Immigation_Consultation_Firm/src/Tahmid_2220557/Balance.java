
package Tahmid_2220557;

import java.io.Serializable;


public class Balance implements Serializable {
    int asset,liability,OE;
    String month;

    public Balance(int asset, int liability, int OE, String month) {
        this.asset = asset;
        this.liability = liability;
        this.OE = OE;
        this.month = month;
    }

  
    

    public Balance() {
    }

    public int getAsset() {
        return asset;
    }

    public void setAsset(int asset) {
        this.asset = asset;
    }

    public int getLiability() {
        return liability;
    }

    public void setLiability(int liability) {
        this.liability = liability;
    }

    public int getOE() {
        return OE;
    }

    public void setOE(int OE) {
        this.OE = OE;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Balance{" + "asset=" + asset + ", liability=" + liability + ", OE=" + OE + '}';
    }
    
    public float totalAsset(){
    
        int sum=asset+liability;
        
        return sum;
    }
}
