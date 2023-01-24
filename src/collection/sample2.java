package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample2 
{
	
	public	static void main(String[] args)
	 {
		 Vector V1=new Vector();
		 
		//Add information
		 V1.add("Virat");
		 V1.add(100);
		 V1.add('A');
		 V1.add(60.25f);
		 V1.add(100);
		 V1.add(null);
		 V1.add(null);
		 V1.add('B');
		 
		 System.out.println(V1);
		 
		 
		//Verify arraylist is empty or not 
		 
		 System.out.println(V1.isEmpty());
		 
			//Size/Capacity
		 
		 System.out.println(V1.size());
		 
		//verify information is present or not
		 
		 System.out.println(V1.contains("Rahul"));
		 

		//Add information inbetween Arraylist-->Right shift operation
		 
		 V1.add(4,200);
		 
		 System.out.println(V1);
		 

		 //remove information---->left shift operation
		 
		 V1.remove(4);
		 System.out.print(V1);
		 
		//update info  
		 
		 V1.set(3,80.25f);
		 System.out.println(V1);
		 
		//to find index of data   
		 
		System.out.println(V1.indexOf('A'));
		
		//to get data by providing index
		
		System.out.println(V1.get(0));
		 
		System.out.println("-------------For each Loop--------------------");
		
		for(Object S1:V1)
		{
			System.out.println(S1);
		}
		
		System.out.println("-------------Iterator Curser--------------------");
		
		Iterator Itr=V1.iterator();
		
		
		while(Itr.hasNext())
		{
		     System.out.println(Itr.next());
			
		}
		
		System.out.println("-------------List Iterator Curser--------------------");
		 
       ListIterator   ltr=V1.listIterator();

      while(ltr.hasNext()) //8-->   -->false
      {
      	System.out.println(ltr.next());//Rahul  //100  A  .....B
      }

		
      System.out.println("-------------Enumeration curser--------------------");  
      
      Enumeration  enu=V1.elements();

while(enu.hasMoreElements()) //7-->    -->false
{
   System.out.println(enu.nextElement()); //Rohit  100  A
}
			
		 
		 
		 
	 }
	 


}
