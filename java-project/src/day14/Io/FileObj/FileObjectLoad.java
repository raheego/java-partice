package day14.Io.FileObj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) throws IOException{
		// 순서가 동일해야 한다. fileObjectSave.java 
		String name, id, pwd, phone;
		int age = 0;
		boolean gender = true;
		name = id = pwd = phone = null;

		File f  = new File("members.txt");
		FileInputStream fis = null; 
		ObjectInputStream bis = null;
				
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name = (String) bis.readObject();
            id = (String) bis.readObject();
            pwd = (String) bis.readObject();
            gender = (boolean) bis.readObject();
            age = (int) bis.readObject();
            phone = (String) bis.readObject();
			
            System.out.println("\t\t\t >> 회원정보 << \n");
            System.out.println("Name \t\t ID \t\t PWD \t\t Gender \t Age \t PhoneNumber");
            System.out.println();
            System.out.print(name + "\t"+id+ "\t"+ pwd+ "\t");
            if(gender == true) System.out.print("남자");
            else System.out.print("여자");
            System.out.print("\t"+age+ "\t"+phone);

        }catch (Exception e){
            e.printStackTrace();
         }finally {
            bis.close();
        }
    }
}