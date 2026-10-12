package tasks;

class hi extends Thread{
	public void run() {
		System.out.println("Thread is running.....");
	}
}
public class t {
	public static void main(String[] args) throws InterruptedException {
		hi h = new hi();
		System.out.println(h.isAlive());
		System.out.println(h.getState());
		h.start();
		System.out.println(h.getState());
		h.run();
		System.out.println(h.isAlive());
		System.out.println(h.getState());
		h.join(1);
		System.out.println(h.getState());
		System.out.println(h.isAlive());
	}

}


package tasks;
import java.io.*;
import java.util.Scanner;

public class BufferReader {
	public static void writeData(Scanner sc) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Livewire\\Desktop\\student.txt",true));
		System.out.println("Enter The Data : ");
		String data = sc.nextLine();
		br.write(data);
		br.newLine();
		br.close();
	}
	public static void readData() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Livewire\\Desktop\\student.txt"));
		
     String line;
     while ((line = br.readLine()) != null) {
            System.out.println(line);
      }
        br.close();
}
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Choice for Read(0) / for Write(1) :");
    	int ch = sc.nextInt();
    	sc.nextLine();
    	if(ch==0) {
    		readData();
    	}
    	else if(ch==1) {
    		writeData(sc);
    	}
    	else {
    		System.out.println("Invalid Option");
    	}
    	
    }
}

