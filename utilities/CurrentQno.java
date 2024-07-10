package utilities;

public class CurrentQno {
    public int currentQno;

    public CurrentQno() {
        this.currentQno = 1;
    }

    public int getCurrentQno() {
        return currentQno;
    }

    public void increment() {
        currentQno++;
    }

    public void decrement() {
        currentQno--;
    }

    @Override
    public String toString() {
        return ""+currentQno;
    }


       
    
}