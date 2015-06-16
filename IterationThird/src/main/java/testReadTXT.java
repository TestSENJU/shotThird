

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testReadTXT {
public static void main(String args[]) throws IOException{
//	BufferedReader br=new BufferedReader(
//			new InputStreamReader(new FileInputStream("teams"),"UTF-8"));
//	br.readLine();
//	System.out.println(br.readLine());
//	BufferedReader br=new BufferedReader(
//	new InputStreamReader(new FileInputStream("active/Aaron Brooks.txt"),"UTF-8"));
//	String str;
//	while((str=br.readLine())!=null){
//		String strs[]=str.split(":");
//		System.out.println(strs[1].trim());
//	}
//String filenames[]=new File("active/").list();
//for(String sr:filenames){
//	System.out.println(sr);
//}
	BufferedReader br=new BufferedReader(
			new InputStreamReader(new FileInputStream("matchrecord.txt"),"UTF-8"));
	String reg = "[\u4e00-\u9fa5]";

    Pattern pat = Pattern.compile(reg);  
	while(br.readLine()!=null){
		String str=br.readLine();
		String strs[]=str.split(":");
		for(int i=0;i<strs.length;i++){

		     Matcher mat=pat.matcher(strs[i]); 

		     String repickStr = mat.replaceAll("");

				System.out.println(repickStr.trim());
//				}
		}
	}
}

}
