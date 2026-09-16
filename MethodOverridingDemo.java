class Department{

void run(){
System.out.println("Department is running");
}
}

class BCA extends Department{
@Override
void run(){
System.out.println("BCA is running safely");
}
}

public class MethodOverridingDemo{
public static void main(String[]args){
Department v=new Department();
v.run();

BCA c=new BCA();
c.run();

Department obj=new BCA();
obj.run();
}
}	