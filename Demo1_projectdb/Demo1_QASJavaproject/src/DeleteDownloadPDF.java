/**
* Recommendations and Rules for Custom Actions
* 1. The parameter data types supported are String and Array. 
* 2. All custom actions must return following integer values only.
*    a. If action gets passed, return value should be 0.
*    b. If action gets failed, return value should be 1.
*    c. If action has defect, return value should be 2.
*/



import java.io.File;

import com.webdriverfw.Libraries.DataLogger;
import com.webdriverfw.Wrappers.General;


public class DeleteDownloadPDF extends General {
	
public int DeletePDFFile(String filepath) {
	
	//int output = 1;	
	try {
		File file = new File(filepath); 
        
        if(file.delete()) 
        { 
        	DataLogger.writeToDebugAndInfoLogs(file +" : File Deleted"); 
        } 
        else
        { 
        	DataLogger.writeToDebugAndInfoLogs(file +" : File Not Present");

           
        }
        
	}catch(Exception ex) {
		ex.printStackTrace();
		DataLogger.writeToDebugAndInfoLogs(ex.getMessage());
		return 1;
	}

	return 0;
}
}   
