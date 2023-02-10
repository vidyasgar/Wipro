import java.util.*;
import java.io.*;
class UserMainCode(){
public int weightOfHillPattern(int input1,int input2,int input3){
          int i,f=0;
        for(i=1;i<=input1;i++){
            f+=input2*i;
            input2+=input3;
        }
        return f;
		 
	}
}
