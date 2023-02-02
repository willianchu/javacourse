import java.math.BigDecimal;
import java.util.*;
class WorkBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[j]);
                System.out.println(a.compareTo(b), a, b);
                if(a.compareTo(b) < 0)
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}