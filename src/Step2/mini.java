package Step2;

public class mini {
    public void min(int in1,String[] mini,String id,int cash){
        System.out.println("Loading........");
        System.out.println("-------MINISATEMENT FOR MR."+id+"-------");
        int n=1;
        for(int i=0;i< mini.length;i++){
            if(mini[i]!=null){
                System.out.println("TRANSACTION NUMBER"+n+":  "+mini[i]);
            }
            else{
                break;
            }
            n+=1;
        }
        mainS2 mai=new mainS2();
        mai.main(in1,mini,id,cash);

    }
}
