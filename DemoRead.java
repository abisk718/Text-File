package ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import ReadFile.ReadDemoFile;

public class DemoRead {
	
	
		private static void saveFile(ArrayList<ReadDemoFile>readfile){
		    File fileName = new File("textread.txt"); 


		    try {
		        FileWriter write = new FileWriter(fileName);
		        BufferedWriter output = new BufferedWriter(write);

		        for (int i = 0; i < readfile.size(); i++){
		            output.write(readfile.get(i).toString());
		            output.newLine();
		        }
      		        output.close();

		    } catch (Exception e) {
		    	 e.printStackTrace();
		    }
		}

	}
	
	

