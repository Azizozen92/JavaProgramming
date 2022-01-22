package day_11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'A';
        String result="";
        switch (ch){
            case 'A':
                case 'B':
                    case 'C':
                        case 'D':
                            result="Passed";
                            break;
            case'F':
                result="failed";
                break;
            default:
                result="invalid";
                break;
        }
        System.out.println(result);
    }
}
