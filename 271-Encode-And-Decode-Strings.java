
public class Solution {

    public static String encode(List<String> strs) {
       return  strs.stream().reduce((str1,str2) -> str1+","+str2).orElse("");
    }

    public static List<String> decode(String str) {
        return Arrays.stream(str.split(",")).collect(Collectors.toList());
    }
}
