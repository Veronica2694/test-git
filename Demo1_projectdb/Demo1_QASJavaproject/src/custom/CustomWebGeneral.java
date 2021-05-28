/**
* Recommendations and Rules for Custom Actions
* 1. The parameter data types supported are String and Array. 
* 2. All custom actions must return following integer values only.
*    a. If action gets passed, return value should be 0.
*    b. If action gets failed, return value should be 1.
*    c. If action has defect, return value should be 2.
*/

package custom;

import com.webdriverfw.Libraries.DataLogger;
import com.webdriverfw.Wrappers.General;


public class CustomWebGeneral extends General {
	
	/**
	 * 
	 * @param int1
	 * @param int2
	 * @return 
	 * 0 = Pass
	 * 1 = fail
	 * 2 = Defect
	 */
	
public int Multiply(String int1,String int2) {
	
	int output = 1;	
	try {
	        //Your code here...
			
		int x = Integer.parseInt(int1);
		int y = Integer.parseInt(int2);
		int res = x*y;
		output = 0;
		 DataLogger.writeToDebugAndInfoLogs("Result = "+res);
		  
      
        } catch(Exception ex) {

            ex.printStackTrace();
            output = 1;
            DataLogger.writeToDebugAndInfoLogs("There is an error");
        }

	return output;
}   
}