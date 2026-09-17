import  java.util.Scanner;

public class Main {
  public static void main(String[] args)
{
  Scanner sc =new
Scanner(System.in);
        System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int maxLength = 0;
		for (int i = 0; i < str.length(); i++){
		    boolean[] visited = new boolean[256];
		    int length = 0;
		    
			for (int j = i; j < str.length(); j++){
			     if (visited[str.charAt(j)]){
				   break;
				}
				
				visited[str.charAt(j)] = true;
				length++;
			}
			
			if (length > maxLength) {
		         maxLength = length;
		    }
		}
		System.out.println("length of longest substring =" + maxLength);
		}
	}
