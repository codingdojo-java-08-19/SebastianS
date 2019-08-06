public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator iD = new StringManipulator();
        String result = iD.concatSubstring("yoyoyoyo", 1, 3, "hihihihihhi");
        System.out.println(result);
        String result2 = iD.trimAndConcat("   HEY    ", "   BUDDY     ");
        System.out.println(result2);
        Integer result3 = iD.getIndexOrNull("Funny", "z");
        System.out.println(result3);
        Integer result4 = iD.getIndexOrNull("HEYYYYYYYYY", "HEY");
        System.out.println(result4);
    }
}