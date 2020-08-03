
public class Container {
    private int contain;
    public Container(){
        this.contain =0;
    }
    
    public int contains(){
        return this.contain;
    }
    
    public void add(int amount){
        if (amount > 0) {
            this.contain  = this.contain  + amount;
        } else {
            amount = 0;
        }
        if (this.contain  > 100) {
            this.contain  = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount >= 0) {
            if (this.contain < amount) {
                this.contain = 0;
            } else {
                this.contain = this.contain - amount;
            }
        } else {
            this.contain = contain;
        }
    }
    
    public String toString(){
        return (this.contain + "/100");
    }
}
