import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Arraylist {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character option, clear;

      List<Integer> arraylist = new ArrayList<Integer>();

      while (true) {
         System.out.println("");
         System.out.println("The Option below!:");
         System.out.println("/////////////////////////////");
         System.out.println("A. Add numbers:");
         System.out.println("B. Remove numbers:");
         System.out.println("C. Display numbers:");
         System.out.println("D. Clear numbers:");
         System.out.println("E. Exit");
         System.out.println("/////////////////////////////");
         System.out.println("Choice: ");
         option = input.next().charAt(0);
         System.out.println("");

         switch (option) {
            case 'A':
               System.out.println("Add number: \n");
               int add = input.nextInt();
               System.out.println("");

               if (add > 0) {
                  arraylist.add(add);

                  System.out.println("The Number " +  add + " added to arraylist!");
                  break;

               }

               else {
                  
                  System.out.println("The number you have enter is negative please enter a positive");
                  break;
               }

            case 'B':
               System.out.println("Please Enter the number that you want to remove: ");
               int remove = input.nextInt();
               System.out.println("");

               if (arraylist.contains(remove)) {
                  arraylist.remove(Integer.valueOf(remove));
                  System.out.println(" The number " + remove + " has now removed!");
                  break;
               }
            case 'C':
               System.out.println("Displaying Arraylist:");
               for (Integer num : arraylist) {
                  System.out.println(num);
               }
               break;
               
               
               
            case 'D':
               System.out.println("Are you sure you want to clear this?(Y/N):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'Y':
                     System.out.println("Kindly wait for a moment");
                     arraylist.clear();
                     System.out.println("");
                     
                     System.out.println("It is now empty!");
                    
                     
                     break;

                  case 'N':
                     
                     System.out.println("ArrayList is not cleared!");
                    
                     break;
               }
               break;

            case 'E':
               input.close();
               System.exit(0);

            default:
               System.out.println("Invalid, Try Again.");
         }

      }

   }
}
