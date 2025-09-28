package Week3.Day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dupes[]= {2, 5, 7, 7, 5, 9, 2, 3};
System.out.println("Duplicates are " );
Arrays.sort(dupes);
		for (int i=0; i<dupes.length; i++){
		for(int j= i + 1; j<dupes.length; j++)
		{
			if(dupes[i]==dupes[j]) {
				
				System.out.println(dupes[i]);
			}
		}
		}
		
	}

}
