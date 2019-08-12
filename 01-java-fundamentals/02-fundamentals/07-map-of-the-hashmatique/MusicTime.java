import java.util.HashMap;
import java.util.Set;

public class MusicTime {
    public void test() {
        String a;
        String b;
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Rap song", "Rap Snack Yip Yap");
        trackList.put("Classical song", "**Orechestral noises**");
        trackList.put("Loud song", "LOUD NOISES");
        trackList.put("ASMR", "**texture noises**");

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            a = key;
            b = trackList.get(key);
            System.out.println(a + ": " + b);
        }
    }
}