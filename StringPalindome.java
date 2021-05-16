import java.util.*;
class StringPalindome {
     public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i) == s.charAt(s.length()-i-1)){
            System.out.println("palindome");
            break;
        }
        else System.out.println("not");
        break;
       
      
    }
    sc.close();
}
    
}
