package Step1;

import java.util.Arrays;
import java.util.Scanner;

public class register {
    public void add(String id[],String pwd[]){
        System.out.println("...REGISTER PAGE....");
        //  STORED LOCALLY
        String idn[]=id;
        String pwdn[]=pwd;

        //  INPUTS
        input in=new input();
        String reid=in.idi();
        String repwd=in.pwdi();
        String renpwd=in.repwdi();

        //  ADDING PROCCES
        if(repwd.equals(renpwd)) {
            for (int i = 0; i < idn.length; i++) {
                if (idn[i] == null) {
                    idn[i] = reid;
                    pwdn[i] = repwd;
                    break;
                }
            }
            System.out.println("-------------------SUCCESFULY REGISTERED----------------------");

            //RETURN TO BROKER
            broker bro=new broker();
            bro.brokr(idn,pwdn);
        }
        else{
            System.out.println("-------------------PLEASE ENTER SAME PASSWORD----------------------");
            register r_=new register();
            r_.add(idn,pwdn);
        }

    }

}
