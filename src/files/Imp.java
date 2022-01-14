package files;

import java.io.FileInputStream;
import java.io.IOException;

public class Imp{
    public static void main(String[] args) throws IOException {
    	FileInputStream fi = new FileInputStream("a.txt");
   	// fi.read -integer values to be search untill we reach to the -1 values.
   	 int i =0;
   	 while ((i=fi.read())!=-1) {
   		 System.out.print((char)i);
   	 }
   	 fi.close();
    }
}
