package BusResv;

public class Bus {
    private int BusNo;
    private boolean AC;
    private int capacity;

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean ac) {
        AC = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Bus(int no, boolean AC, int cap){
        this.BusNo = no;
        this.AC = AC;
        this.capacity = cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No. = " + BusNo + "; AC = " + AC + "; Capacity = " + capacity);
    }

    public int getBusNo() {
        return BusNo;
    }


}
