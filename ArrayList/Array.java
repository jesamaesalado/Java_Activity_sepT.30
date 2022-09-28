
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Stream;
public class Array
{
  /**
 * @param args
 */
public static void main(String[] args){
    try (Scanner input = new Scanner(System.in)) {
        ArrayList<String> myFavoriteCologne = new ArrayList<>();
        System.out.println("Enter your 6 Favorite Brand:");
        myFavoriteCologne.add(input.nextLine());
        myFavoriteCologne.add(input.nextLine());
        myFavoriteCologne.add(input.nextLine());
        myFavoriteCologne.add(input.nextLine());
        myFavoriteCologne.add(input.nextLine());
        myFavoriteCologne.add(input.nextLine());
        
    
        System.out.println(myFavoriteCologne);
        
  
            for (String Brand : myFavoriteCologne){
                System.out.println(" Hello! I Highly Recommend This Brand " + Brand);
            }
          
     
            Iterator<String> it = myFavoriteCologne.iterator();
            while(it.hasNext()){
               
                System.out.println( it.next());
            }
       
          Stream<String> str = myFavoriteCologne.stream();
            str.forEach(name -> {
                System.out.println(" Hello! Let Me Share My Top 6 Favorite Brand:) " + name);
            });
    }
        
    
    }
    
    
}


