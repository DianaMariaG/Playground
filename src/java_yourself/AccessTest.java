package java_yourself;

public class AccessTest {
    int numberOfMinutesInContract;
    private int numberOfMessagesInContract;

    protected void calculateCurrentCost() {
        // calculate cost
    }

    public int getOwnNumber() {
        return 2;
    }
}




class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest ref = new AccessTest();
    }
}
