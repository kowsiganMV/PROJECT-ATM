package Step1;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class broker {
    public void brokr(String id[],String pwd[]){
        //STORE LOCALLY
        String idn[]=id;
        String pwdn[]=pwd;

        //FOR CLEARITY OUTPUT
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Exit");


        //INPUT FOR WHERE  YOU GO
        Scanner sc=new Scanner(System.in);
        int wh=sc.nextInt();

        if (wh == 1) {
            //LOGIN
            login l_ = new login();
            l_.check(idn, pwdn);
        } else if (wh == 2) {
            //REGISTER
            register r_ = new register();
            r_.add(idn, pwdn);
        } else if (wh == 3) {
            System.out.println("--------------------THANK YOU FOR USING--------------------");
        } else {
            System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
            broker bro=new broker();
            bro.brokr(idn,pwdn);
        }
    }
}
