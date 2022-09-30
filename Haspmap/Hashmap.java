import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;




public class Hashmap {
     public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character option, clear;

      Map<Integer , Integer> hashmap = new HashMap<Integer , Integer>();

      while (true) {
         System.out.println("");
         System.out.println("The Option below!:");
         System.out.println("A. Add numbers:");
         System.out.println("B. Remove numbers:");
         System.out.println("C. Display numbers:");
         System.out.println("D. Clear numbers:");
         System.out.println("E. Exit");
         System.out.println("Choice: ");
         option = input.next().charAt(0);
         System.out.println("");


         switch (option) {
            case 'A':
               System.out.println("Only the composite numbers:");
               System.out.println("Enter a number:");
               int add = input.nextInt();
               System.out.println("");

               int j = add/2;
               int isPrime = 0;

               if (add == 0 || add == 1){
                System.out.println("Please Enter key number you want to add:");
                int key = input.nextInt();
                System.out.println("");

                hashmap.put(key, add);
                System.out.println("The number "+ add + " has been added");
                           
            }
               

               else {
                for (int i = 2; i <= j; i++)
                {
                    if(add%i == 0){
                        System.out.println("Please Enter key number you want to add:");
                        int key = input.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + " is the key number and the number " + add + " is a composite number has been added to the HashMap");
                        isPrime = 1;
                        break;
                    }
                }
                  if (isPrime == 0)
                  {
                    System.out.println("Oppps!!! Integer is a prime number. It is not added in the HashMap.");
                  }
               }

               break;
            case 'B':
               System.out.println("Please Enter number you want to remove:");
               int remove = input.nextInt();
               System.out.println("");

               if (hashmap.containsKey(remove)) {
                  System.out.println(remove+ "" + hashmap.get(remove) + " has been removed!");
                  hashmap.remove(remove);
                
               }
               break;
               
               
            case 'C':
               
               System.out.println("Displaying Hashmap:");
               
               
               hashmap.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + "" + entry.getValue());
               });

               break;

            case 'D':
               System.out.println("Do you want to clear this?(Y/N):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'Y':
                     System.out.println("Please wait for a moment...");
                     hashmap.clear();
                     System.out.println("");
                     
                     System.out.println("Hashset is Empty");
                     System.out.println("");
                     break;

                  case 'N':
                     System.out.println("HashMap is not yet cleared!");
                     break;
               }
               break;

            case 'E':
               input.close();
               System.exit(0);

            default:
               System.out.println("Oppss Something Went Wrong, Please Try Again!");
         }

      }

   }
}
