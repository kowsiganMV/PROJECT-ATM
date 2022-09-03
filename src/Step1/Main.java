package Step1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("+----------------------+");
        System.out.println("|        -ATM-         |");
        System.out.println("|       -LABEL-        |");
        System.out.println("+----------------------+");
        String[] id=new String[5];
        String[] pwd=new String[5];
        Main m_=new Main();
        id[0]="user";
        pwd[0]="01";
        broker bro=new broker();
        bro.brokr(id,pwd);
    }
}