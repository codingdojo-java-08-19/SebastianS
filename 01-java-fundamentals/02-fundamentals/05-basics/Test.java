import java.util.ArrayList;
public class Test{
    public static void main(String[] args) {
        int[] arr = {1,-3,5,7,9,-13};
        BasicJava iD = new BasicJava();
        iD.printNum();
        iD.printOddNum();
        iD.printSum();
        iD.iterateArr(arr);
        iD.findMax(arr);
        iD.getAverage(arr);
        iD.oddArr();
        System.out.println(iD.greaterThanY(arr, 3));
        iD.squareTheValues(arr);
        iD.eliminateNegatives(arr);
        System.out.println(iD.maxMinAvg(arr));
        iD.shiftArr(arr);
    }
}