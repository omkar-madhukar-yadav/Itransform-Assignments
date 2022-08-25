import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

class ElevenFeature3{
	
	public static void main(String args[]) throws IOException {
		
		
		Path filepath = Path.of("C:/Users/91956/Documents/Assignments_Itransorm/Java11Assignments_StudentList.txt");
		
		String con = Files.readString(filepath);
		
		String con1 = con.replace("\n", " ").replace("\r","");
	
		
		System.out.println(con1);
		
		
//		for(String splits : con.split("\\s",0)) 
//			System.out.println(splits);
//		}
	}
	
}

