package Step2;

import java.sql.SQLOutput;

public class checkbalance {
    public void balance(int i,String[] mini,String id,int cash){
        int cas=cash;
        if(cas<1000){
            System.out.println("--YOUR BALANCE IS BELOW MINIMUM BALANCE:"+1000+"--");
            System.out.println("--PLEASE ADD MORE CASH--");
            System.out.println("--YOUR BALANCE IS RS:"+cash+"--");
            System.out.println("1.CLICK 1 TO DEPOSIT");
            System.out.println("2.RETURN TO MAIN MENU");
            System.out.println("3.Exit");
            input in=new input();
            int num=in.selection();
            if(num==1){
                dep de=new dep();
                de.addcash(i,mini,id,cas);
            }
            else if(num==2){
                mainS2 ma_=new mainS2();
                ma_.main(i,mini,id,cas);
            }
            else if(num==3){
                System.out.println("--------------------THANK YOU FOR USING--------------------");
            }
            else {
                System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
                checkbalance ch=new checkbalance();
                ch.balance(i,mini,id,cas);
            }
        }
        else if (cas==1000) {
            System.out.println("--YOUR BALANCE IS RS:"+cas+"--");
            System.out.println("1.DO YOU LIKE TO DEPOSIT CLICK 1 ");
            System.out.println("2.RETURN TO MAIN MENU");
            System.out.println("3.Exit");
            input in=new input();
            int num=in.selection();
            if(num==1){
                dep de=new dep();
                de.addcash(i,mini,id,cas);
            }
            else if(num==2){
                mainS2 ma_=new mainS2();
                ma_.main(i,mini,id,cas);
            }
            else if(num==3){
                System.out.println("--------------------THANK YOU FOR USING--------------------");
            }else {
                System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
                checkbalance ch=new checkbalance();
                ch.balance(i,mini,id,cas);
            }
        }
        else if (cas>1000){
            System.out.println("--YOUR BALANCE IS RS:"+cas+"--");
            System.out.println("1.RETURN TO MAIN MENU");
            System.out.println("2.Exit");
            input in=new input();
            int num=in.selection();
            if(num==1){
                mainS2 ma_=new mainS2();
                ma_.main(i,mini,id,cas);
            }
            else if(num==2){
                System.out.println("--------------------THANK YOU FOR USING--------------------");
            }
            else {
                System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
                checkbalance ch=new checkbalance();
                ch.balance(i,mini,id,cas);
            }
        }
    }
}
