import java.util.Scanner;
public class oddnumsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number,i,oddsum = 0;
      Scanner in=new Scanner(System.in);
      number = in.nextint();
      for(i=0;i<=number;i++) {
    	  sum+=i;
      }
      System.out.println("Sum of all odd number between 0 to" +number+"=" +sum);
	}

}
