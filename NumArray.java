public class NumArray<T extends Number> {

    private T[] numbers;

    public NumArray(T[] numbers) {
        this.numbers = numbers;
    }

    public T getHighest() {
        T highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].doubleValue() > highest.doubleValue()) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    public T getLowest() {
        T lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].doubleValue() < lowest.doubleValue()) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public double getSum() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }

    public double getAverage() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }
}