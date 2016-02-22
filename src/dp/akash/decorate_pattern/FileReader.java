package dp.akash.decorate_pattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader {
	
	private BufferedReader reader=null;
	
	public ArrayList<Person> get_person_List(String path){
		ArrayList<Person> persons=new ArrayList<Person>();
		try {
			reader =new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
			String line;
			while((line=reader.readLine())!=null){
				StringTokenizer st=new StringTokenizer(line,",");
				String name=st.nextToken();
				Double age=Double.parseDouble(st.nextToken());
				String email=st.nextToken();
				persons.add(new Person(name, age, email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persons;
	}

}
