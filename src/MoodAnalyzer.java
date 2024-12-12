import java.util.Locale;
import java.util.Scanner;

public class MoodAnalyzer {
    String s;

    public MoodAnalyzer() {
    }
    public MoodAnalyzer(String mssg) {
        this.s=mssg;
    }

    private void analyzeMood() {
        String mood="sad";
        if(s.toLowerCase().contains(mood.toLowerCase())){
            System.out.println("Sad");
        }else{
            System.out.println("Happy");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MoodAnalyzer m1=new MoodAnalyzer("i am in any mood");
        m1.analyzeMood();
    }


}
