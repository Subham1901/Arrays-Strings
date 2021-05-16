import java.util.*;
    public class PermuteString {  
        public static String swapString(String a, int i, int j) {  
            int count=0;
            char[] b =a.toCharArray();  
            char ch;  
            ch = b[i];  
            b[i] = b[j];  
            b[j] = ch;  
            return String.valueOf(b);  
            
        }  
          
        public static void main(String[] args)  
        {  
            Scanner sc=new Scanner(System.in);
            String str = sc.nextLine();;  
            int len = str.length();  
            System.out.println("All the permutations of the string are: ");  
            generatePermutation(str, 0, len);  
        }  
          

        public static int generatePermutation(String str, int start, int end)  
        {  
            int count=0;
            if (start == end-1)  
                System.out.println(str);  
            else  
            {  
                for (int i = start; i < end; i++)  
                {   
                    str = swapString(str,start,i);  
                    generatePermutation(str,start+1,end);   
                    str = swapString(str,start,i);  
                    count++;
                }  
            } 
            return count; 
        }  
    }  