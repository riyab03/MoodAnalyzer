import java.util.Locale;
import java.util.Scanner;

public class MoodAnalyzer {

    private String analyzeMood(String s) {
        String mood="happy";
        if(s.toLowerCase().contains(mood.toLowerCase())){
            return "Happy";
        }else{
            return "Sad";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MoodAnalyzer m1=new MoodAnalyzer();
        System.out.println(m1.analyzeMood("i am very happy"));
        System.out.println(m1.analyzeMood("i am very sad"));
    }


}
