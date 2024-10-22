import java.util.Scanner;

public class Main {                                      //ders1. test5
    public static void main(String[] args) {
        System.out.print("ededi daxil edin: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s=switch (a){
            case 1,2,12 -> "qış";
            case 3,4,5 -> "yaz";
            case 6,7,8-> "yay";
            case 9,10,11-> "payız";
            default -> "melumatı yalnış";

        };
        System.out.println(a+ "- bu fəsil "+s+"dır!");
    }
}