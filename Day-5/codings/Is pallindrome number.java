import java.util.*;
import java.io.*;
class UserMainCode(){
public in IsPalim(int input1){


int temp=input1,r,sum=0;
    while(input1>0){
        r=input1%10;
        sum=(sum*10)+r;
        input1/=10;
    }
    if(sum==temp){
        return 2;
    }
    else{
        return 1;
    }
}
}
