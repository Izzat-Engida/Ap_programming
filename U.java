import java.util.*;
@FunctionalInterface
interface c{
    Set<Integer> answer();
}
public class U {
    private static Set<Integer>set1;
    private static Set<Integer>set2;
    U(List<Integer> a,List<Integer> b){
set1=new HashSet<>();
set2=new HashSet<>();
set1.addAll(a);
set2.addAll(b);

    }
    
  @SuppressWarnings("unused")
public static void main(String args[]){
 List<Integer>a=new ArrayList<>();
 List<Integer>b=new ArrayList<>();
Scanner scan=new Scanner(System.in);
int count;
System.out.println("how many numbers are in set1: ");
count=scan.nextInt();
while(count>0){
    System.out.println("number: ");
    int temp=scan.nextInt();
    a.add(temp);
    count--;
}
System.out.println("how many numbers are in set2: ");
count=scan.nextInt();
while(count>0){
    System.out.println("number: ");
    int temp=scan.nextInt();
    b.add(temp);
    count--;
}
@SuppressWarnings("unused")
U op=new U(a, b);
boolean cont=true;
scan.nextLine();
while(cont){
    System.out.println("choose from the follwoing operations ");
    System.out.println("1. intersection between set1 and set2");
    System.out.println("2. union between set1 and set2");
    System.out.println("3. set difference between set1 and se2");
    System.out.println("4. set difference bewteen set2 and set1");
    System.out.println("5. check for subsets");
    System.out.println("6. exit");
    count=scan.nextInt();
    switch(count) {
        case 1:
            c intersection = () -> {
                Set<Integer> answer = new HashSet<>(set1);
                answer.retainAll(set2);
                return answer;
            };
            System.out.println("The intersection is: " + intersection.answer());
            break;
        case 2:
            c union = () -> {
                Set<Integer> answer = new HashSet<>(set1);
                answer.addAll(set2);
                return answer;
            };
            System.out.println("The union is: " + union.answer());
            break;
            case 3:
            c difference = () -> {
                Set<Integer> answer = new HashSet<>(set1);
                answer.removeAll(set2);
                return answer;
            };
            System.out.println("The set difference is: " + difference.answer());
            break;
        case 4:
        c difference2=()->{
            Set<Integer>answer=new HashSet<>(set2);
            answer.removeAll(set1);
            return answer;
        };
        break;
        case 5:
        if(set1.containsAll(set2) && set2.containsAll(set1)){
            System.out.println("the two sets are equal");

        }
        else if(set2.containsAll(set1)){
            System.out.println("set1 is the subset of set2");
        }
        else if(set1.containsAll(set2)){
            System.out.println("set2 is the subset of set1");
        }
        else{
            System.out.println("no set is the subset of one another");
        }
             break;
                
        case 6:
            cont = false;
            System.out.println("Good day to you");
            break;
        default:
            System.out.println("Invalid option. Please choose a number between 1 and 4.");
            break;
        }
}
scan.close();
  }  
}
