import java.io.*;
import java.util.*;
class Main(){
  public int codeThroughString(String input1){
String[] wd=input1.split(" ");
        int i,a=0,n=0;
        for(i=0;i<wd.length;i++){
            a=wd[i].length();
            
            while(a>0||n>9){
                if(a==0){
                    a=n;
                    n=0;
                }
                n+=(a%10);
                a/=10;
            }

        }
        return n;
	}
}
