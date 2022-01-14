package com.mphasis.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
   	 FileInputStream fis=new FileInputStream("a.txt");
   	 ObjectInputStream oi=new ObjectInputStream(fis);    
   	 Student s=(Student) oi.readObject();
//Student object   object type
   	 System.out.println(s.id+"  "+s.name);
   	 
    }

}






