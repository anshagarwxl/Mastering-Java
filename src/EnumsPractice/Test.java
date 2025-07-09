package EnumsPractice;
import java.util.Scanner;

enum Gender{
    MALE,FEMALE,OTHER;
}

class Genders {

    private static final Genders MALE = new Genders();
    private static final Genders FEMALE = new Genders();
    private static final Genders OTHER = new Genders();
}

public class Test{
    public static void main(String[] args) {

//        Gender input = Gender.FEMALE;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(Gender.MALE.equals(input)) {
            System.out.println("You are Mr.");
        }
        else if(Gender.FEMALE.equals(input)){
            System.out.println("You are Mrs.");
        }
        else{
            System.out.println("You shouldn't use any salutation.");
        }
        for(Gender g1: Gender.values()){
            System.out.println(g1);
        }
    }
}
