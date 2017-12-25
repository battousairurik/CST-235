package beans;


import java.io.Serializable;

public class countBean implements Serializable {
    
    //Variable
    int count = 0;

    //Getter and setter
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    //Default constructor
    public countBean(){
    }
}
