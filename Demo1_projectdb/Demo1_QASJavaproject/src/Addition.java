/**
* Recommendations and Rules for Custom Actions
* 1. The parameter data types supported are String and Array. 
* 2. All custom actions must return following integer values only.
*    a. If action gets passed, return value should be 0.
*    b. If action gets failed, return value should be 1.
*    c. If action has defect, return value should be 2.
*/



import com.webdriverfw.Libraries.DataLogger;
import com.webdriverfw.Wrappers.General;
import java.lang.reflect.Array;


public class Addition extends General {
	
public int add(Object int1,Object int2) {
	
	//int output = 1;	
	try {
		int x,y,s;
		 
        x=Integer.parseInt(ar[0]);
        y=Integer.parseInt(ar[1]);

        s=x+y;
        System.out.println("sum of " + x + " and " + y +" is " +s);

            DataLogger.writeToDebugAndInfoLogs("");
      
        } catch(Exception ex) {

            ex.printStackTrace();
        }

	//return output;
}   
}