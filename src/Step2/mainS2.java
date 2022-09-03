package Step2;

import Step1.broker;

public class mainS2 {
    public void main(int i,String mini[],String id,int cash){
        System.out.println("----------MAIN MENU----------");
        System.out.println("--- Hello Mr."+id+" ---");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdrawel");
        System.out.println("4.Mini Statement");
        System.out.println("5.Exit");
        input n=new input();
        int num=n.selection();
        if(num==1){
            checkbalance ch=new checkbalance();
            ch.balance(i,mini,id,cash);
        }
        else if(num==2){
            dep de=new dep();
            de.addcash(i,mini,id,cash);

        }
        else if(num==3){
            with wi=new with();
            wi.wit(i,mini,id,cash);

        }
        else if(num==4){
            mini min=new mini();
            min.min(i,mini,id,cash);
        }
        else if (num ==5) {
            System.out.println("--------------------THANK YOU FOR USING--------------------");
        }
        else {
            System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
            mainS2 ma_=new mainS2();
            ma_.main(i,mini,id,cash);
        }

    }
}
