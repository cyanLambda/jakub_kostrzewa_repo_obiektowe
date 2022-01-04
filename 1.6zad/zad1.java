import java.util.*;
public class Zad1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String H = "haslo";

        String password = sc.nextLine();
        if(password.equals(H)){
            System.out.println("haslo ["+H+"] jest poprawne");
        }
        else{
            System.out.println("NIEPOPRAWNE HASLO");
        }
    }
}