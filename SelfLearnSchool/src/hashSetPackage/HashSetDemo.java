package hashSetPackage;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
	
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C"); //cannot add same elements in hashSet 
		
		
			System.out.println(hashSet);
			
			System.out.println(hashSet.contains("D"));
			
		hashSet.remove("A");
		
		System.out.println(hashSet);
		
		hashSet.add("D");
		System.out.println(hashSet);
		System.out.println(hashSet.contains("D"));
		
	}

}
