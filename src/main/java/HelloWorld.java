import java.io.IOException;
import java.util.Scanner;

  
public class HelloWorld {
	

	public static int Math(int a) {
		return(a+a);
	};


	public static void main(String[] args) {
		int b=0;
		int erg;
		
		System.out.println("HelloWorld ");
		System.out.println("lets try ");
	Scanner scanner=new Scanner(System.in);
	b=scanner.nextInt();
		
		erg=Math(b);

		System.out.println(erg);
	}


}
