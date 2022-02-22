package helper_Adactin;

public class File_Reader_Manager {
 
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Configuration_Reader_Adactin getInstanceCR() throws Throwable {
		
		Configuration_Reader_Adactin cr = new Configuration_Reader_Adactin();
		
		return cr;
		
	}
}
