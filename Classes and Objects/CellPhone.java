class CellPhoneDetails{
    
    public void ringing(){
        System.out.println("Ringing....");
    }

    public void vibrating(){
        System.out.println("Vibrating....");
    }
}

public class CellPhone {
    public static void main(String[] args){
        CellPhoneDetails c1 = new CellPhoneDetails();
        c1.ringing();
        c1.vibrating();
    }
}
