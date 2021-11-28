package week1.day1factorial;

public class Fibinocci {

	public static void main(String[] args) {
		int count=8;
		int firstnum=0;
		int secnum=1;
		int sum;
		System.out.println(firstnum);
		for (int i = 1; i < count; i++) {
			
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			
			System.out.println(sum);
			
		}
		 
	}

}
