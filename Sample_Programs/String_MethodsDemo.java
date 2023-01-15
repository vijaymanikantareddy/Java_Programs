  import java.util.*;
public class String_MethodsDemo
{
	public static void main(String args[])
	{
	    // To understand Mutability of a String
		
		 String s=new String("Aditya");
		 StringBuffer s1=new StringBuffer("Aditya");

		 s.concat("College");
		 s1.append("College");

		 System.out.println(s);
		 System.out.println(s1);
		
	  
	   //length() - used to return the number of characters in the string.
	    /*  
	      String s1=new String("Aditya Group of Educations");
	      int len=s1.length();
		  System.out.println(s1+" "+len);
	    */
  
       // == -> reference comparision and equals() -> Content Comparision
	   /* 
		  String s1=new String("aditya");
		  String s2=new String("aditya");
          String s3="aditya";
		  String s4="aditya";
		  System.out.println(s1==s2);
		  System.out.println(s1.equals(s2));

		  System.out.println(s3==s4);
		  System.out.println(s3.equals(s4));
		
*/
	   //equalsIgnoreCase() - Compares two strings, ignoring case considerations
        /*
		  String s1=new String("aditya");
		  String s2=new String("AdityA");

		  System.out.println(s1.equals(s2));
		  System.out.println(s1.equalsIgnoreCase(s2));
		*/

	   //charAt(int) - return the character at the given index.
	   /* 
		 String s11=new String("Aditya Group of Educations");
		 System.out.println(s11.charAt(20));
		*/

	   //indexOf()- from start , lastIndexOf() - from last
	    /*
		 String s3=new String("Aditya Engineering College");
	     System.out.println(s3.lastIndexOf('e'));
	     System.out.println(s3.indexOf('a'));		//5
	     System.out.println(s3.lastIndexOf('a'));	//5
      */
		

	   //replace(old char,new char), replaceFirst(String,String), replaceAll()
        /*
		  String s1=new String("Aditya Group of Colleges");
		  System.out.println(s1.replace('o','e'));   //Aditya Greup ef Celleges

		  String s2=new String("Aditya College is best Engineering College");
		  System.out.println(s2.replaceFirst("College","Group"));
	      System.out.println(s2.replaceAll("College","Group"));
          */
	   //Program to find the how many times a word available in a given string.
		/*    
	        String s1=new String("arehowruaresyeare");
		    int l=(s1.length()-s1.replaceAll("are","").length())/3;
		    System.out.println(l);
		*/
	  
	   //split(String reg,int limit) - return the string array

	     /* 
		  String s1=new String("06-10-2020");
		  String s2[]=s1.split("-",0);
		  for(int i=0;i<s2.length;i++)
		  System.out.println(s2[i]); 
		 */

		// Program to read line of integers by using either BR or Scanner class
		/*  
		  Scanner sc=new Scanner(System.in);
		  String value=sc.nextLine();
		  String ele[]=value.split(" ",0);
		  
		  int number[]=new int[ele.length];
		  for(int i=0;i<ele.length;i++)
			    number[i]=Integer.parseInt(ele[i]);

		  for(int i=0;i<number.length;i++)
			  System.out.println(number[i]); 
		*/
			
		/*  
		  String s=new String("Aditya engineering college is best engineering college");
		  String s1[]=s.split(" ",0);
          System.out.println(s1.length);
		*/
	                                    
	   //startWith(), endsWith()
	    /*
	     String s=new String("Aditya Degree Colleges");
	     System.out.println(s.startsWith("Adi"));  // true
	     System.out.println(s.endsWith("ges"));   // true
	    */
                                              

	   //contains(String) - search for the given string in it or not.
		/*      
		  String myStr = "Aditya";
          System.out.println(myStr.contains("Adi"));   // true
          System.out.println(myStr.contains("y"));     // true
          System.out.println(myStr.contains("dtya"));    // false
		*/
	   
	   //toCharArray() and copyValueOf()
	    /*
		 String s1=new String("12-34-56");
		 //System.out.println(s1[0]);
		 char x[]=s1.toCharArray();
		 for(int i=0;i<x.length;i++)
		    System.out.println(x[i]);   

		  x[2]='%';
		  x[5]='$';
		  String s2=new String(x);
		  System.out.println(s2);  // "12%34$56
		*/
          
		/* 
		  String s3="";
		  s3=s3.copyValueOf(x,0,5);
		  System.out.println(s3); 
		  
		  String s4=String.valueOf(x);
		  System.out.println(s4);
		*/

	   //substring(start,end) - to return the specified substring from a string.
       //start to end-1 substring is returned
	    
		  String s1=new String("Aditya Group of Educations");

		  String s2=s1.substring(7);
		  System.out.println(s2);
          	
		  String s3=s1.substring(7,11);
		  System.out.println(s3);
		
      
	}
}