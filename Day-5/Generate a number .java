import java.util.*;
import java.io.*;
class UserMainCode(){
  public int pinGenerate(int input1,int input2,int input3){

         
         
         int r,i=0,a,b,c,pin=0,d,e,f,temp;

         


        a=input1%10;
        b=input2%10;
        c=input3%10;
        if(a<b && a<c){
            pin+=a;
        }
        else if(b<c && b<a){
            pin+=b;
        }
        else{
            pin+=c;
        }
        temp=a>b?a:b;  
        d=c>temp?c:temp;  

        input1/=10;
        input2/=10;
        input3/=10;

        a=input1%10;
        b=input2%10;
        c=input3%10;
        if(a<b && a<c){
            pin+=a*10;
           
        }
        else if(b<c && b<a){
            pin+=b*10;
            
        }
        else{
            pin+=c*10;
            
        }
        temp=a>b?a:b;  
        e=c>temp?c:temp;  
        input1/=10;
        input2/=10;
        input3/=10;

        a=input1%10;
        b=input2%10;
        c=input3%10;
        if(a<b && a<c){
            pin+=a*100;
             
        }
        else if(b<c && b<a){
            pin+=b*100;
             
        }
        else{
            pin+=c*100;
            
        }
        temp=a>b?a:b;  
        f=c>temp?c:temp;  

         
         // last digit
         if(d>e && d>f){
             pin+=d*1000;
         }
         else if(e>d && e>f){
             pin+=e*1000;
         }
         else{
             pin+=f*1000;
         }

         return pin;	 
	}
}
