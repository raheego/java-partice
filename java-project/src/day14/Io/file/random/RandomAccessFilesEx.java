package day14.Io.file.random;

import java.io.RandomAccessFile;

public class RandomAccessFilesEx {
	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		
		for (int i = 0; i <= 10; i++) {
			String str = "helllo";
			raf.seek(i*100);
//			raf.writeInt(i);
			raf.writeUTF(str);
		}
		
		for (int i = 0; i <=10; i++) {
			raf.seek(i*100);
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string pritn success");
		raf.close();
		
	}
}
