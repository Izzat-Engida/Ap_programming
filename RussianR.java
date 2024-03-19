import java.util.*;
public class RussianR {
    private List<Boolean>chambers;
      private int curr;
public RussianR(int count){
    this.chambers=new ArrayList<>(Collections.nCopies(count,false));
    int temp=new Random().nextInt(count);
    this.chambers.set(temp, true);
    Collections.shuffle(this.chambers);
    this.curr=0;
}

 public boolean shoot(){
    boolean fate=this.chambers.get(this.curr);
    this.curr=(this.curr+1)% this.chambers.size();
    return fate;
 }
 public static void main(String[]args){
    RussianR gun=new RussianR(6);
    Scanner scan=new Scanner(System.in);
    System.out.println("Welcome to russian roulette\nA game which can be your last game");
    System.out.println("Do you have what it takes to gamble your life to win money (Yes/NO)");
     String answer=scan.nextLine();
     boolean turn=true;
     int money=1000;
     if(answer.equalsIgnoreCase("yes")){
        System.out.println("lets us begin then");
            while(true){
                System.out.println();
                System.out.println();
                if(turn){
                    System.out.println("players turn");
                }
                else{
                    System.out.println("computers turn");
                }
                System.out.println();
                System.out.println();
                System.out.println("Pulling the trigger....");
                try {
                    Thread.sleep(2000); // Sleep for 2 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                System.out.println();
                if(gun.shoot()){
                    System.out.println("Bang.....\n you are dead");
                    if(turn){
                        System.out.println("sorry player you have lost your life and money for the system");
                    }
                    else{
                        System.out.println("player you have won and the won the money from the system");
                        System.out.println("amount: "+ money);
                    }
                    break;
                }
                else{
                    System.out.println("Click.....\nyou survived this one lets see your luck next time");
                    if(turn){
                        System.out.println("so player you have survived your money has incrsed by 10%");
                        money=(int)(money*0.1+ money);
                        System.out.println("your money is: " + money);
                    }
                    else{
                        System.out.println("the system has survived, player you might get closser to death");
                    }
                }
                if(turn){
                    turn=false;
                }
                else{
                    turn=true;
                }
                try {
                    Thread.sleep(3000); // Sleep for 3 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        

     }
     else{
        System.out.println("comarde, i see you are afraid.");
        System.out.println("good day to you");
     }
     scan.close();
 }
}
