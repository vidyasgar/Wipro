import java.io.*;
import java.util.*;
class UserMainCode(){
public String StringPallindrome(String input1){
          String str = input1, reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
       return 2;
    }
    else {
       return 1;
    
		 
	}
}
}
