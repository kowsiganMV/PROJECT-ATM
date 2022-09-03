package Step1;

import java.util.Scanner;

public class input {
    public String idi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID:");
        String id1=sc.nextLine().strip();
        return id1;
    }
    public String pwdi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PassWord:");
        String pwd1=sc.nextLine().strip();
        return pwd1;
    }
    public String repwdi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("REEnter PassWord:");
        String pwd1=sc.nextLine().strip();
        return pwd1;
    }
}
