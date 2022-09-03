package Step2;

public class with {
    public void wit(int i,String[] mini,String id,int cas) {
        //GET WITHDRAWEL CASH
        int cash = cas;
        System.out.print("Enter Your Withdrawel Ammount: ");
        input in = new input();
        int withcash = in.selection();
        if (withcash <= cash) {
            System.out.println("----------TAKE YOUR CASH AND ENJOY YOUR DAY----------");

            //MINUS TO THE AVALABLE CASH
            cash -= withcash;

            //ADDED TO MINISTATEMENT
            mini[i] = "-" + String.valueOf(withcash);
            i += 1;

        } else {
            System.out.println("---YOUR AMOUNT BELOW TO YOUR COURENT BALANCE---");
        }

        //HIS WISH
        rework(i,mini,id,cash);
    }
        public  void rework(int i,String[] mini,String id,int cash){//HIS WISH
            System.out.println("1.RETURN TO MAIN MENU");
            System.out.println("2.Exit");
            input in = new input();
            int num = in.selection();
            if (num == 1) {
                mainS2 ma_ = new mainS2();
                ma_.main(i, mini, id, cash);
            } else if (num == 2) {
                System.out.println("--------------------THANK YOU FOR USING--------------------");
            } else {
                System.out.println("--------------------PLEASE CHOOSE CORRECT OPTION--------------------");
                rework(i,mini,id,cash);
            }
        }

}
