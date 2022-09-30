import java.util.HashSet;
import java.util.Scanner;


public class Hashset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(19);
        numberHashSet.add(17);
        numberHashSet.add(15);
        numberHashSet.add(13);
        numberHashSet.add(11);
        char choice;
        int number = 0;

        
        do{
           
            System.out.println("\nGiven numbers in HASHSET Collection:" + numberHashSet);
           
            System.out.println("\nPick your Choice:");
            System.out.print("1. Add");
            System.out.print("\n2. Remove");
            System.out.print("\n3. Display");
            System.out.print("\n4. Clear");
            System.out.print("\n5. Exit");

            System.out.print("\nPick your choice: ");
            choice = input.next().charAt(0);
            
            
            switch (choice) {
            case '1':
            
                System.out.print("\n  ADD a NUMBER");
               
                System.out.print("\nChoose a number: ");
                number = in.nextInt();
            
                if(numberHashSet.contains(number)){
                    System.out.print("\nOhhh--Ohh!!! The number you entered is already in the HashSet Collection.\n");
                    System.out.print("\n Oppss Try inputting another number.\n");
                   
                 } else {
                    numberHashSet.add(number);
                    System.out.println("\nThe added number is: " + number);
                    System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
                    
                 }
                
                break;
                
            case '2':
                System.out.println("\n REMOVE a NUMBER");
                System.out.print("Choose the number you want to remove: ");
                int number2 = in.nextInt();
                numberHashSet.remove(number2);
                System.out.println("\nThe removed number number is:" + number2);
                System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
               
                break;
                
            case '3':
                System.out.println("\nThe added number earlier is:" + number);
                System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
                
                break;
                
            case '4':
               
                numberHashSet.clear();  
                System.out.println("\n\t\tCLEARED HashSet Collection:" + numberHashSet);
               
                break;
                
            case '5':
              
                System.out.println("\n THANK YOU!!! ");  
                
                break;
                
            default:
                System.out.println("\nChoose from the options given above. Oppsss try Again:( ");
                
                break;
        }
        }while (choice != '5');
        
        
    
    }

}