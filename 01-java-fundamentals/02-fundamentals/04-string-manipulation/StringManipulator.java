public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }
    public Integer getIndexOrNull(String str, char x){
        if (str.indexOf(x)<0){
            return null;
        }
        else{
            Integer index = str.indexOf(x);
            return index;
        }
    }
    public Integer getIndexOrNull(String str1, String str2){
        if (str1.indexOf(str2)<0){
            return null;
        }
        else{
            Integer index = str1.indexOf(str2);
            return index;
        }
    }
    public String concatSubstring(String str1, int x, int y, String str2){
        String newstr = str1.substring(x,y);
        return newstr + str2;
    }
}