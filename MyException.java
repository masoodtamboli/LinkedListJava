public class MyException {
    public static void main(String[] args) throws Exception{
        int balance = 5000;
        int wA = 6000;

            if(wA > balance){
                throw new Exception("Insufficient Balance");
            }

        
        
    }
}
