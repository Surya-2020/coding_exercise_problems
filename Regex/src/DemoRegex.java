import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DemoRegex {

	public static void main(String[] args) throws IOException {
	
		String filename="C:\\Users\\surrajas\\OneDrive - Capgemini\\Pictures\\regexDemo.txt";
		String filename2="C:\\Users\\surrajas\\OneDrive - Capgemini\\Pictures\\regexDemo2.txt";
		File file= new File(filename);
		FileReader reader=new FileReader(file);
		File file1= new File(filename2);
		FileReader reader1=new FileReader(file1);
		 BufferedReader br1 = new BufferedReader(reader1);
		 BufferedReader br = new BufferedReader(reader);
		 String line1=null;
	     List<String> str1=new ArrayList<>();
	        String line=null;
	        List<String> str=new ArrayList<>();
	        while ((line1 = br1.readLine()) != null) {
	            // process the line
	        	str1.add(line1);
	         //   System.out.println(line);
	        }
	        System.out.println(
	            "Read text file using BufferedReader");
	        while ((line = br.readLine()) != null) {
	            // process the line
	        	str.add(line);
	         //   System.out.println(line);
	        }
		System.out.println(str);
		System.out.println(str1);
		List<String> temp=new ArrayList<>(str1);
		temp.removeAll(str);
		System.out.println(temp);
		
	}

}
