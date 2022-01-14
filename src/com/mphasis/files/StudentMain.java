package com.mphasis.files;

import java.util.ArrayList;
import java.util.LinkedList;

class Student{
    int id;
    String name;
    double fee;
    public Student(int id,String name,double fee) {
   	 this.id = id;
   	 this.name=name;
   	 this.fee=fee;
    }
    
}

public class StudentMain{
    public static void main(String[] args) {
   	 Student s1=new Student(1,"kk",20000);
   	 Student s2=new Student(2,"pp",30000);
   	 LinkedList<Student> al= new LinkedList();
   	 al.add(s1);
   	 al.add(s2);
   	 for(int i=0;i<al.size();i++)
   	 System.out.println(al.get(i).id+"   "+al.get(i).name+"  "+al.get(i).fee);
    }
}

   	  
   	  
   	  
   	  



   	
   	 
    

