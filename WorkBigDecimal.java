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
            // Javonical way to instantiate a comparator
          Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return new BigDecimal(s2).compareTo(new BigDecimal(s1));
            }
          });

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
// Solution description
// Comparator myComparator = new Comparator(){

//     @Override
//     public int compare(Object o1, Object o2) {
//         BigDecimal a = new BigDecimal(String.valueOf(o1));
//         BigDecimal b = new BigDecimal(String.valueOf(o2));
//         return b.compareTo(a);
//     }
// };
// Arrays.sort(s,0,n,myComparator);



// older solution
// Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() { 
//     @Override 
//     public int compare(String a1, String a2) {
//         BigDecimal a = new BigDecimal(a1);
//         BigDecimal b = new BigDecimal(a2);
//         return a.compareTo(b);
//     }
// }));