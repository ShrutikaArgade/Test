import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferReader {

	public static void main(String[] args) 
	{
		
		//in will read data from keyboard rather than read it from file
		//to read char ,char array
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			
			System.out.println("Enter id");
			String id=br.readLine();
			//convert id into string
			int pid=Integer.parseInt(id);
			//it is very tedious job for conversion
			//where as in scanner class there are already functions present nextInt()
			//nextDouble no need to convert
			System.out.println("enter name");
			String nm=br.readLine();
			
			System.out.println("enter price");
			String pr=br.readLine();
			Double price=Double.parseDouble(pr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
