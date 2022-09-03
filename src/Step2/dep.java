package Step2;

public class dep {
    public void addcash(int i,String[] mini,String id,int cash){
        input in=new input();

        //GET DEPOSIT AMMOUNT
        System.out.print("PLEASE ENETR YOUR DEPOSIT AMMOUNT:");
        int depcash=in.selection();

        //ADDED TO MINISTATEMENT
        String[] min=mini;
        min[i]="+"+String.valueOf(depcash);
        i+=1;

        //ADDED IN CURNT BALANCE
        int deptcash=cash+depcash;
        System.out.println("--YOUR AMOUNT RS:"+depcash+" HASBEEN DEPOSITED--");

        //HIS WISH
        System.out.println("1.DO YOU LIKE TO CHECKBALANCE CLICK 1 ");
        System.out.println("2.RETURN TO MAIN MENU");
        System.out.println("3.Exit");
        int num=in.selection();
        if(num==1){
            checkbalance ch=new checkbalance();
            ch.balance(i,min,id, deptcash);
        }
        else if(num==2){
            mainS2 ma_=new mainS2();
            ma_.main(i,min,id,deptcash);
        }
        else if(num==3){
            System.out.println("--------------------THANK YOU FOR USING--------------------");
        }
        else {
            System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
            dep de=new dep();
            de.addcash(i,mini,id,cash);
        }

    }
}
