package µÚÈıÕÂ;
import java.util.*;
public class count {
		       public static void Main(String[] args){
		    	System.out.println("ÇëÊäÈë×Ö·û´®£º");
		        Scanner sc=new Scanner(System.in);
		        String n=sc.nextLine();
		        int a=0;
		        int b=0;
		        int c=0;
		        int d=0;
		        char x[]=n.toCharArray();
		        for(int i=0;i<x.length;i++){
		            if(x[i]>='a'&&x[i]<='z'||x[i]>='A'&&x[i]<='Z')
		            {a++;}
		            else if(x[i]==' ')
		            {b++;}
		            else if(x[i]>='0'&&x[i]<='9')
		            {c++;}
		            else 
		            {d++;}
		            System.out.println(a+""+b+""+c+""+d);
		        }
		    }
		}

