class Department{

   void display(){
      System.out.println("this is a general department");
	}
}

class BCA extends Department{
    void display(){
       System.out.println("this is the department of BCA");
    }
}

public class MethodOverridingDemo2{
 
   public static void main(String[] args){
        Department d = new Department();
        d.display();
        
        BCA b = new BCA();
        b.display();
  
        Department obj = new BCA();
        obj.display();
	}
}	