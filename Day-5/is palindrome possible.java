import java.util.*;
import java.io.*;
class UserMainCode(){
  public int isPalindromePossible(int input1){
       int [] a=new int[5];
        int i=0,r ,f=0,k,j,g;
        while(input1>0){
            r=input1%10;
            a[i]=r;
            i++;
            input1/=10;
        }
        for(k=0;k<i;k++){
             for(j=k+1;j<i;j++){
                 if(a[k]==a[j]){
                     f++;
                 }
                 
             }
        }
        if(i%2==0){
            if(f==i/2){
                return 2;
            }
            else{
                return 1;
            }
        }
        else{
            g=i-2*f;
            if(g==1){
                return 2;
            }
            else{
                return 1;
            }
        }
        
         
             
        
        
        

 
	}
}
