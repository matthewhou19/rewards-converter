public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion rate
    private static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    // Method to get cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}
