import org.junit.platform.commons.util.StringUtils;
import org.testng.annotations.Test;

public class CodeWar {

    @Test
    void coverForLetters(){
        System.out.println(maskify("45877755"));
    }

    public static String maskify(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int total = str.length();
        int fr = total - 4;
        if(total>4){
            int totalAster = str.length()-4;
            for(int i=0; i< totalAster; i++){
                stringBuilder.append("#");
            }
            stringBuilder.append(str.substring(fr, total));
            return stringBuilder.toString();
        } else {
            return str;
        }
    }
}
