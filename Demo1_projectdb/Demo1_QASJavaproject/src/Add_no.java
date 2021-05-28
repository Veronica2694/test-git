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


public class Add_no extends General {
	
public int Add_no(Object int1,Object int2) {
	
	int output = 1;	
	try {
	        //Your code here...

            DataLogger.writeToDebugAndInfoLogs("");
      
        } catch(Exception ex) {

            ex.printStackTrace();
        }

	return output;
}   
}