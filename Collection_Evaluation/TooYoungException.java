package Collection_Evaluation;

public class TooYoungException extends Throwable{

    public TooYoungException(){

    }
	
    public TooYoungException(String s){
        //new RuntimeException().getMessage();
         this.getMessage();
         //System.exit(0);
    }
    
    @Override
    public String getMessage(){
        String s = "Not Eligible";
        return s;
    }
}