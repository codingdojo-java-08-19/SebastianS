import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    public ArrayList<Integer> firstPuzzle(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum=0;
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
            if (arr[i]>10){
                list.add(arr[i]);
            }
        }
        System.out.println(sum);
        return list;
    }
    public ArrayList<String> secondPuzzle(){
        ArrayList<String> names= new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        for (int i=0; i<names.size();i++){
            System.out.println(names.get(i));
            String toCheck = names.get(i);
            if (toCheck.length()<=5){
                names.remove(i);
                i--;
            }
        }
        return names;
    }
    public void thirdPuzzle(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        Collections.shuffle(list);
        System.out.println(list.get(25));
        System.out.println(list.get(0));
        if (list.get(0)=="a"|list.get(0)=="e"|list.get(0)=="i"|list.get(0)=="o"|list.get(0)=="u"){
            System.out.println("Your first element was a vowel!");
        }
    }
    public int[] fourthPuzzle(){
        int[] arr = new int[10];
        Random r = new Random();

        for(int i=0;i<10;i++){
            arr[i]= r.nextInt(45)+55;
            System.out.println(arr[i]);
        }

        return arr;
    }
    public ArrayList<Integer> fifthPuzzle(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();

        for(int i=0;i<10;i++){
            arr.add(r.nextInt(45)+55);
        }
        Integer min = arr.get(0);
        Integer max = arr.get(0);
        Collections.sort(arr);
        for(int i=0;i<10;i++){
            System.out.println(arr.get(i));
            if (arr.get(i)>max){
                max = arr.get(i);
            }
            else if (arr.get(i)<min){
                min = arr.get(i);
            }
        }
        System.out.println("max: "+ max + " min: "+ min);

        return arr;
    }
    public void sixthPuzzle(){
        String str = "";
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        int count=0;
        while (count<5){
            char rc= alphabet.charAt(r.nextInt(26));
            str+=rc;
            count++;
        }
        System.out.println(str);
    }
    public void seventhPuzzle(){
        ArrayList<String> toReturn= new ArrayList<String>();
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        for (int i=0;i<10;i++){
            int count=0;
            String str = "";
            while (count<5){
                char rc= alphabet.charAt(r.nextInt(26));
                str+=rc;
                count++;
            }
            System.out.println(str);
            toReturn.add(str);
        }
        System.out.println(toReturn);
    }
}
