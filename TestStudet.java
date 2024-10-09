package aggregation1;

public class TestStudet {

	public static void main(String[] args) {
		Address ad=new Address("akshay","maharashtra","india");
		Address ad1=new Address("ajay","maharashtra","india");
		Address ad2=new Address("kanchan","maharashtra","india");
		
		
		Name na=new Name("ajay","a","prajapati");
		Name na1=new Name("akshay","a","prajapati");
    	Name na2=new Name("kanchan","a","prajapati");
    	
    	 Student st=new  Student(1,"akshay","jamner");
      	 Student st1=new  Student(2,"ajay","jalgoan");
      	 Student st2=new  Student(3,"ram","nashik");
      	 
      	 System.out.println(ad);
      	 System.out.println(ad1);
      	 System.out.println(ad2);
      	 
      	 System.out.println("====================");
      	 System.out.println(st);
      	 System.out.println(st1);
      	 System.out.println(st2);
      	 
      	 System.out.println(na);
      	 System.out.println(na1);
      	 System.out.println(na2);
	}    	 
      	 
}
