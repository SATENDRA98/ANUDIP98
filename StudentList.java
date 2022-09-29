package com.collection.demo.bll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudendArrayList002 {

	public static void main(String[] args) {
						
								
								ArrayList<Student002> students = new ArrayList<>();
								
								Student002 std1 = new Student002("AF0216223","Aryan Raj",21,"Andra Pradhesh");
								Student002 std2 = new Student002("AF0216224","Bivor Kumar",22,"Andra Pradhesh");
								Student002 std3 = new Student002("AF0216227","SUSHMITA KUMARI",23,"Madhya Pradesh");
								Student002 std4 = new Student002("AF0216231","Ragiv Zafar",24,"Maharashtra");
								Student002 std5 = new Student002("AF0216232","RAHUL MAHTO",25,"Orissa");
								Student002 std6 = new Student002("AF0216234","Nainsi Kumari",19,"Gujarath");
								Student002 std7 = new Student002("AF0216236","MD ALI",26,"Madhya Pradesh");
								Student002 std8 = new Student002("AF0216238","ABHISHEK KUMAR",22,"Andra Pradhesh");
								Student002 std9 = new Student002("AF0216240","AFROZ ANSARI",21,"Maharashtra");
								Student002 std10 = new Student002("AF0216259","RITIK RAJ",20,"Orissa");
								Student002 std11 = new Student002("AF0216263","Anant Kumar",25,"Andra Pradhesh");
								Student002 std12 = new Student002("AF0216305","BABU KUMAR",24,"Gujarath");
								Student002 std13 = new Student002("AF0216307","NIKITA KUMARI",23,"Madhya Pradesh");
								Student002 std14 = new Student002("AF0216353","PRANAV PANDEY",22,"Orissa");
								Student002 std15 = new Student002("AF0216964","Radheshyam Kumar",21,"Maharashtra");
								Student002 std16 = new Student002("AF0216973","Ankur Utpal",19,"Gujarath");
								Student002 std17 = new Student002("AF0217607","Banty Mishra",18,"Madhya Pradesh");
								Student002 std18 = new Student002("AF0217615","RIYA KUMARI",20,"Madhya Pradesh");
								Student002 std19 = new Student002("AF0217791","Priyadarshani Kumari",21,"Maharashtra");
								Student002 std20 = new Student002("AF0223373","Chanchal Thakur",22,"Orissa");
								Student002 std21 = new Student002("AF0221549","Satendra Kumar",23,"Maharastra");
								Student002 std22 = new Student002("AF0216212","Pappi Verma",24,"Khategaon");
								Student002 std23 = new Student002("AF0216244","RamKrishn Kushwaha",25,"Andra Pradesh");
								Student002 std24 = new Student002("AF0223373","Yogita Tamolia",26,"Orissa");
										
								

								
								Collections.addAll(students, std1,std2,std3,std4,std5,std6,std7,std8,std9,std10,
													std11,std12,std13,std14,std15,std16,std17,std18,std19,std20,std21,std22,std23,std24);
								
								System.out.println("Total Students : "+students.size());
								for(Object s: students){
									System.out.println(s);
								}
								System.out.println("**************************************************************"
										+"\n**************************************************************");
								
								System.out.println("List of Students above 20 years : ");
								//Display students aged over 20
								for(Student002 s: students) {
									if(s.getAge()>20)
									System.out.println(s);
								}
								System.out.println("**************************************************************"
										+"\n**************************************************************");
							
								System.out.println("List of Students of Andhra Pradhesh : ");
								//Search students from the state Andhra Pradhesh
								for(Student002 s: students)
								{
									if(s.getState()=="Andra Pradhesh")
										System.out.println(s);
								}

								//Sort students by their age.
								Collections.sort(students);  
								
								System.out.println("**************************************************************"
												+"\n**************************************************************");
								System.out.println("Sorted students by their age ascending order : ");
								
								
								
								//Traversing list through Iterator
								Iterator<Student002> itr=students.iterator();
								int i=0;
								while(itr.hasNext()){  
									System.out.println(++i +". "+itr.next()); 
								}
						    }
						}