public class NumArrayDemo {

    public static void main(String[] args) {
        Integer[] intArray = {4, -1, 5, 9, 21};
        Double[] dubArray = {4.2, 6.9, 15.7, 31.1, 22.2};

        NumArray<Integer> intNumArray = new NumArray<>(intArray);
        NumArray<Double> dubNumArray = new NumArray<>(dubArray);

        //Integer array demo
        System.out.println("--------------");
        System.out.println("Integer Array Testing");
        System.out.println("Highest value of Integer array: " + intNumArray.getHighest());
        System.out.println("Lowest value of Integer array: " + intNumArray.getLowest());
        System.out.println("Average value of Integer array: " + intNumArray.getAverage());
        System.out.println("Sum of Integer array: " + intNumArray.getSum());
        System.out.println("--------------");

        //Double array demo
        System.out.println("--------------");
        System.out.println("Double Array Testing");
        System.out.println("Highest value of Double array: " + dubNumArray.getHighest());
        System.out.println("Lowest value of Double array: " + dubNumArray.getLowest());
        System.out.println("Average value of Double array: " + Math.round(dubNumArray.getAverage() * 100.0) / 100.0);
        System.out.println("Sum of Double array: " + Math.round(dubNumArray.getSum() * 10.0) / 10.0);
        System.out.println("--------------");
    }
    
}
