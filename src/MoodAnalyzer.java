import java.util.Locale;
import java.util.Scanner;

public class MoodAnalyzer {
    String s;

    public MoodAnalyzer() {
    }
    public MoodAnalyzer(String mssg) {
        this.s=mssg;
    }

    public void analyzeMood() throws MoodException {
        String mood="sad";
        String mood2="null";
        if(s==null || s.isEmpty()||s.toLowerCase().contains(mood2.toLowerCase())){
            throw new MoodException("NULL MOOD");
        }else{
            if(s.toLowerCase().contains(mood.toLowerCase())){
                System.out.println("Sad mood");
            }else{
                System.out.println("Happy mood");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        MoodAnalyzer m1=new MoodAnalyzer(s);
        try {
            m1.analyzeMood();
        }catch(MoodException e){
            System.out.println(e.getMessage());
        }
    }


}
