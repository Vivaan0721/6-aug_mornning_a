package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample1 
{
	 public	static void main(String[] args)
	 {
		 ArrayList al=new ArrayList();
		 
		//Add information
		 al.add("Rahul");
		 al.add(100);
		 al.add('A');
		 al.add(60.25f);
		 al.add(100);
		 al.add(null);
		 al.add(null);
		 al.add('B');
		 
		 System.out.println(al);
		 
		 
		//Verify arraylist is empty or not 
		 
		 System.out.println(al.isEmpty());
		 
			//Size/Capacity
		 
		 System.out.println(al.size());
		 
		//verify information is present or not
		 
		 System.out.println(al.contains("Rahul"));
		 

		//Add information inbetween Arraylist-->Right shift operation
		 
		 al.add(4,200);
		 
		 System.out.println(al);
		 

		 //remove information---->left shift operation
		 
		 al.remove(4);
		 System.out.print(al);
		 
		//update info  
		 
		 al.set(3,80.25f);
		 System.out.println(al);
		 
		//to find index of data   
		 
		System.out.println(al.indexOf('A'));
		
		//to get data by providing index
		
		System.out.println(al.get(0));
		 
		System.out.println("-------------For each Loop--------------------");
		
		for(Object S1:al)
		{
			System.out.println(S1);
		}
		
		System.out.println("-------------Iterator Curser--------------------");
		
		Iterator Itr=al.iterator();
		
		
		while(Itr.hasNext())
		{
		     System.out.println(Itr.next());
			
		}
		
		System.out.println("-------------List Iterator Curser--------------------");
		 
        ListIterator   ltr=al.listIterator();

       while(ltr.hasNext()) //8-->   -->false
       {
       	System.out.println(ltr.next());//Rahul  //100  A  .....B
       }

			
			
		 
		 
		 
	 }
	 

}
