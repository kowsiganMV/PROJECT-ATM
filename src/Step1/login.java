package Step1;

import Step2.mainS2;
import java.sql.SQLOutput;
import java.util.Arrays;

public class login {
    public void check(String[] id,String pwd[]){
        //HERE LOGINPAGE
        System.out.println("...LOGIN PAGE...");
        String idn[]=id;
        String pwdn[]=pwd;

        //  INPUTS
        input in=new input();
        String loginid=in.idi();
        String loginpwd=in.pwdi();

        //  CHECK ID AND PASSWORD
        int check=0;
        for(int i=0;i< idn.length;i++){
            if(loginid.equals(idn[i]) && loginpwd.equals(pwdn[i]) ){
                System.out.println("---Succesfully logined---");
                check=1;
                break;
            }
        }
        if(check==0){
            System.out.println("Id or PassWord is Wrong");
            System.out.println("-------------------*----------------------");
            broker bro=new broker();
            bro.brokr(idn,pwdn);
        }
        else if(check==1){
            mainS2 ma_=new mainS2();
            String mini[]=new String[100];
            int i=0;
            ma_.main(i,mini,loginid,1000);
        }
    }


}
