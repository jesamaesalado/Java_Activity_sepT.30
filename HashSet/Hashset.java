
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Hashset
{
	public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
          
            Set<String> set = new HashSet<String>();
          
            System.out.println("Enter your 5 Favorite Actress/Actors:");
            set.add(input.nextLine());
            set.add(input.nextLine());
            set.add(input.nextLine());
            set.add(input.nextLine());
            set.add(input.nextLine());
            
          
   System.out.println(set);
   
            Iterator<String> it = set.iterator();
            while(it.hasNext()){
               
                System.out.println("Bonjour! What an honor to meet you:) " + it.next());
            }
        }
    }
}


