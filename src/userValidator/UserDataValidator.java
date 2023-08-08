package userValidator;

import java.io.*;
import java.util.Arrays;

public class UserDataValidator {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader dataReader = null;
		BufferedWriter validWriter = null;
		BufferedWriter errorWriter = null;
		
		try {
			dataReader = new BufferedReader(new FileReader("src/data/user_data.txt"));
			validWriter = new BufferedWriter(new FileWriter("src/data/good_data.txt"));
			errorWriter = new BufferedWriter(new FileWriter("src/data/bad_data.txt"));
			
			
			String line;
			while ((line = dataReader.readLine()) != null) {
				
				try {
					String[] user = line.split(", ");
					String name = user[0].trim();
					String email = user[1].trim();
					int age = Integer.parseInt(user[2].trim());
					
					if (user.length != 3) {
						throw new ArrayIndexOutOfBoundsException("Data is missing");
					}
					
					if (age <= 0) {
						throw new NumberFormatException("Age is invalid");
					}
					
					validWriter.write(line + "\n");
				} catch(ArrayIndexOutOfBoundsException e) {
					errorWriter.write("Missing Data: " + line + "\n");
				} catch(NumberFormatException e) {
					errorWriter.write("Invalid Age: " + line + "\n");
				}
				
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} finally {
			if (dataReader != null) {
				dataReader.close();
			}
			if (validWriter != null) {
				validWriter.close();
			} 
			if (errorWriter != null) {
				errorWriter.close();
			}
		}
		
	}
}
