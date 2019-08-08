import java.util.ArrayList;

public class BasicJava{
    public void printNum(){
        for (int i=1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOddNum(){
        for (int i=1; i<=255; i+=2){
            System.out.println(i);
        }
    }
    public void printSum(){
        int sum=0;
        for (int i=1; i<=255; i++){
            sum+=i;
            System.out.println("New number:" + i + "Sum:" + sum);
        }
    }
    public void iterateArr(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void findMax(int[] arr){
        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public void getAverage(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        int avg = sum/(arr.length);
        System.out.println(avg);
    }
    public void oddArr(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        Integer i=1;
        while (i<256){
            y.add(new Integer(i));
            i+=2;
        }
        System.out.println(y);
    }
    public int greaterThanY(int[] arr,int y){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>y){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public int[] squareTheValues(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i]*arr[i];
            System.out.println(arr[i]);
        }
        return arr;
    }
    public int[] eliminateNegatives(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                arr[i]=0;
            }
        System.out.println(arr[i]);
        }
        
        return arr;
    }
    public ArrayList<Object> maxMinAvg(int[] arr){
        ArrayList toReturn = new ArrayList<Object>();
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        toReturn.add(max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        toReturn.add(min);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / (arr.length);
        toReturn.add(avg);
        return toReturn;
    }
    public int[] shiftArr(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            arr[i]=arr[i+1];
            System.out.println(arr[i]);
        }
        arr[arr.length-1]=0;
        System.out.println(arr[arr.length-1]);
        return arr;
    }
}