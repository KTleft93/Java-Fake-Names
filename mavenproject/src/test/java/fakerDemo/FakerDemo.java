package fakerDemo;

import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) {
		
		
		Faker faker = new Faker();
		
		String [] names = new String [1000];
		
		for(int i=0;i<names.length;i++) {
			
			names[i]= faker.name().fullName();
			System.out.println(names[i] + " ");
			
		}
		
		
  //    System.out.println(name);
    //  System.out.println(name1);
	}

}
