package arrays;


public class AddTwoMatrix {
 public static void main(String args[])
   {
      int m, n, c, d;
      
      int first[][] = { {1,2}, {5,10}, {2,6} };
      int second[][] = { {2,6}, {1,2}, {5,3} };
      
      m=first.length;
      n=first[0].length;
      
      int sum[][] = new int[m][n];
      
      System.out.println("Calculating Sum of 2 matrices....");
      
      for ( c = 0 ; c < m ; c++ )
          for ( d = 0 ; d < n ; d++ )
              sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
         


 
      System.out.println("Sum of 2 matrices....");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
 
}
--------------------------------------------------------------------------------
package collections;


import java.util.ArrayList;


public class ArrayListExample1 {


public static void main(String[] args) {


 //Declaration
 ArrayList list=new ArrayList();


 //Add values to arraylist
 list.add("John");
 list.add("David");
 list.add("Scott");
 list.add("Smith");


 System.out.println(list.size()); // returns size of arraylist


 //reading values from arraylist
 for(String s:list)
 {
  System.out.println(s);
 }


}


}


--------------------------------------------------------------------------------
package conditions;


public class EvenOrOddNumber {


public static void main(String[] args) {


 int num=10;


 if(num%2 == 0)
 {
  System.out.println("Number is even number");
 }


 else
 {
  System.out.println("Number is odd number");
 }
}


}


--------------------------------------------------------------------------------
package arrays;


class BinarySearch 
{
  public static void main(String args[])
  {
  int c, first, last, middle, n, search_element;
  
  int array[] = {100,200,300,400,500};
  
  search_element=200;
  
  n=array.length;
  
  first  = 0;
  last   = n - 1;
  middle = (first + last)/2;


    while( first <= last )
    {
      if ( array[middle] < search_element )
        first = middle + 1;    
      else if ( array[middle] == search_element ) 
      {
        System.out.println(search_element + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;


      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search_element + " isn't present in the list.\n");
  }
}
--------------------------------------------------------------------------------


package arraysandstrings;


public class EvenAndOddNumbersinArray {


public static void main(String[] args) {


 int a[]={10,20,15,3,6,7,8,2,5,7};


 int n=a.length;


 System.out.print("Odd numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }


}


}


--------------------------------------------------------------------------------
package collections;


import java.util.ArrayList;


public class ArrayListExample2 {


public static void main(String[] args) {


 //Declaration
 ArrayList list=new ArrayList(); 


 //Adding values to array list
 list.add("welcome");
 list.add(100);
 list.add(10.5);
 list.add('C');
 list.add(true);


 System.out.println(list.size()); //size of arraylist


 System.out.println(list.get(2)); //returns specific value from array list, index starts from 0


 System.out.println("Before inserting:" +list); // print all the values from arraylist




 //Insert values into araylist
 list.add(1,"selenium");
 System.out.println("After insertion:" +list);


 // remove values from arraylist
 list.remove(3);
 System.out.println("After remove:" +list);




 //reading values from array list usign for loop


 for(Object i:list)
 {
  System.out.println(i);
 }


}


}


--------------------------------------------------------------------------------
package collections;


import java.util.Random;


//Generating Random Numbers In The Given Range


public class GenerateRandomeNumbersInGivenRange {


 public static void main(String[] args)
    {
        //Generating random integers between 0 and 50 using Random class
 
        System.out.println("Random integers between 0 and 50 using Random class :");
 
        Random random = new Random();
 
        for (int i = 0; i < 5; i++)
        {
            System.out.println(random.nextInt(50));
        }
 
        //Generating random integers between 0 and 50 range using Math.random()
 
        System.out.println("Random integers between 0 and 50 using Math.random() :");
 
        for (int i = 0; i < 5; i++)
        {
            System.out.println((int)(Math.random() * 50));
        }
   
    }
}


--------------------------------------------------------------------------------
package arrays;


import java.util.Arrays;


public class BinarySearchUsingMethod {
 
public static void main(String args[])
  {
 int array[] = {10, 20, 30, 40, 50 }; //Should be in order
 
    System.out.println(Arrays.binarySearch(array, 30));
  }
}


--------------------------------------------------------------------------------
package strings;


public class ConvertSentenceCase {


public static void main(String[] args) {


 String s = "my name is pavan";
 String rev = "";


 String s1 [] = s.split(" ");
 for(int i =0; i
 String f = s1[i].substring(0, 1).toUpperCase();
 String l = s1[i].substring(1, s1[i].length());


 rev = rev +" "+  (f+l);




 }
 System.out.println(rev.trim());


}
}
--------------------------------------------------------------------------------
package arrays;


public class BubbleSort {


 public static void main(String []args) {
     int n, c, d, temp;
    
     int array[] = {500,300,200,400,100};
     n = array.length;
     
     System.out.println("Array Before Bubble Sort");
       
       for(int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
       } 
     
    //Sorting     
     temp = 0;
       
       for(int i = 0; i < n; i++) {
          for(int j=1; j < (n-i); j++) 
          {
             if(array[j-1] > array[j]) 
             { 
                temp = array[j-1]; 
                array[j-1] = array[j];
                array[j] = temp;
             } 
          } 
       } 
       
       System.out.println();
       
       System.out.println("Array After Bubble Sort");
       
       for(int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
       } 
}
}
--------------------------------------------------------------------------------
package strings;


import java.util.Scanner;


public class CountTheWords {


public static void main(String[] args) {
  {
         System.out.println("Enter the string:");
  
         Scanner sc = new Scanner(System.in);
  
         String s=sc.nextLine();
  
         int count = 1;
  
         for (int i = 0; i < s.length()-1; i++)
         {
             if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
             {
                 count++;
             }
         }
  
         System.out.println("Number of words in a string = "+count);
     }


}


}
--------------------------------------------------------------------------------
package collections;


import java.util.Random;


public class GeneratingRandomNumbers {


 public static void main(String[] args)
    {
  
  //Appraoch1: Generating Random Numbers Using java.util.Random Class
       
   Random random = new Random();
 
        //Generating random integers using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Integers : "+random.nextInt());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random doubles using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random booleans using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random booleans : "+random.nextBoolean());
        }
        
        
      // Generating Random Numbers Using Math.random()
             //Generating random doubles using Math.random()
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+Math.random());
        }
        
    }
 
}


package strings;
--------------------------------------------------------------------------------


/*Write a java program to count the total number of occurrences of a given character 
in a string without using any loop?
  */


public class CountCharacterOccurence {
public static void main(String[] args)
    {
        String s = "Java is java again java again";


        char c = 'a';


        int count = s.length() - s.replace("a", "").length();


        System.out.println("Number of occurances of 'a' is: "+count);
    }
}


package collections;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElements {


public static void main(String[] args) {


 String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};


 //1. compare each element: O(nxn) --- worst solution
 for(int i = 0; i
  for(int j = i+1; j


   if(names[i].equals(names[j])){
    System.out.println("duplicate element is::" + names[i]);
   }
  }
 }


 System.out.println("*********");


 //2. using HashSet: Java Collection: it stores unique values: O(n)
 Set store = new HashSet();
 for(String name : names){
  if(store.add(name) == false){
   System.out.println("duplicate element is::" + name);
  }
 }


 System.out.println("*********");


 //3. using HashMap: O(2n)
 Map storeMap = new HashMap();


 for(String name : names){
  Integer count = storeMap.get(name);
  if(count == null){
   storeMap.put(name, 1);
  }
  else{
   storeMap.put(name, ++count);
  }
 }


 //get the values from this HashMap:
  
     Set> entrySet = storeMap.entrySet();
     for(Entry entry : entrySet){
      if(entry.getValue()>1){
       System.out.println("duplicate element is::"+ entry.getKey());
      }
     }






}


}
--------------------------------------------------------------------------------
package conditions;


public class GreatestOfThreeNumbers {


public static void main(String[] args) {


 int a=50;
 int b=100;
 int c=20;


 if(a>b && a>c)
 {
  System.out.println(" a is greatest");
 }
 else if(b>a && b>c)
 {
  System.out.println("b is largest");
 }
 else
 {
  System.out.println("c is greatest");
 }


}


}


--------------------------------------------------------------------------------
package collections;


import java.util.HashMap;
import java.util.Map;


public class HashMapExample {


public static void main(String[] args) {


 HashMap hm=new HashMap ();


 //adding values to HashMap
 hm.put(101,"John");
 hm.put(102,"Scott");
 hm.put(103,"David");
 hm.put(104,"Smith");
 hm.put(105,"Kim");


 System.out.println(hm);


 //Remove a pair from hashmap
 hm.remove(103);
 System.out.println("After remove pair from hashmap:"+hm);


 hm.put(106,"XYZ");
 System.out.println(hm);


 //Get values
 System.out.println("The Value is: " + hm.get(104)); //Smith


 //How to read pairs from HashMap


 for(Map.Entry m:hm.entrySet())
 {
  System.out.println(m.getKey()+"   "+m.getValue());
   
 }
 


}


}


--------------------------------------------------------------------------------
package conditions;


public class IfElseCondition {


public static void main(String[] args) {


 int age=20;


 if(age>=18)
 {
  System.out.println("Eligible for vote");
 }
 else
 {
  System.out.println("NOT Eligible for vote");
 }
}


}


--------------------------------------------------------------------------------
package strings;


public class IntegerToStringConvesion {


public static void main(String[] args) {
 // Convert Integer To String Using Integer.toString() Method
  int i = 2015;
         
        String s = Integer.toString(i);
         
        System.out.println(s); 
  
        //Convert Integer To String Using String.valueOf() method
        s = String.valueOf(i);
         
        System.out.println(s);  
        
}


}


--------------------------------------------------------------------------------
package arrays;


class LinearSearch 
{
  public static void main(String args[])
  {


    int array[] = {100,200,300,400,500};


    int search_element=400;
    
int c;
    
    for (c = 0; c < array.length; c++)
    {
      if (array[c] == search_element)     /* Searching element is present */
      {
         System.out.println(search_element + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == array.length)  /* Element to search isn't present */
      System.out.println(search_element + " isn't present in array.");
  }
}
package conditions;


public class LargestofTwoNumbers {


public static void main(String[] args) {


 int a=50;


 int b=20;


 if(a>b)
 {
  System.out.println("a is largest");
 }


 else
 {
  System.out.println("b is largest");
 }
}


}


--------------------------------------------------------------------------------
package arrays;


public class MaxAndMinElementInArray {


public static void main(String[] args) {


 int array[]={10,100,20,50,5,60};


 //Max value in array
 int max = array[0];


 for (int i = 1; i < array.length; i++) {
     if (array[i] > max) 
     {
       max = array[i];
     }
 }


 System.out.println("Max Element in array:" +max);


 // Min value in array
 int min = array[0];


 for (int i = 1; i < array.length; i++) {
     if (array[i] < min) 
     {
       min = array[i];
     }
 }


 System.out.println("Min Element in array:" +min);




}


}


--------------------------------------------------------------------------------
package arrays;


public class MissingNumber {


public static void main(String[] args) {


 //int a[] = {1,2,3,4,5,7,8,9,10,........100};
 //1+2+4+5 = 12
 //1+2+3+4+5 = 15
 //15-12 = 3
    
 int a[] = {-1,0,1,2,4,5,6,7,8,9,10};
 int sum = 0;
 for(int i = 0; i
  sum = sum + a[i]; //49
 }
 System.out.println(sum);


 int sum1 = 0;
 for(int j=-1; j<=10; j++){
  sum1 = sum1 + j;//55
 }


 System.out.println(sum1);


 System.out.println("missing number is:"+ (sum1-sum));
 
}


}
--------------------------------------------------------------------------------
package loops;


public class MultiplicationTable {


public static void main(String[] args) {


 int n=5;


 for(int i=1;i<=10;i++)
 {
  System.out.println(n +"X"+i+"="+ (n*i));
 }


}


}


--------------------------------------------------------------------------------
package conditions;


public class NestedIfElse {


public static void main(String[] args) {


 int day=10;


 if(day==1)
 {
  System.out.println("Sunday");
 }
 else if(day==2)
 {
  System.out.println("Monday");
 }
 else if(day==3)
 {
  System.out.println("Tuesday");
 }
 else if(day==4)
 {
  System.out.println("Wednesday");
 }
 else if(day==5)
 {
  System.out.println("Thursday");
 }
 else if(day==6)
 {
  System.out.println("Friday");
 }
 else if(day==7)
 {
  System.out.println("Saturday");
 }
 else
 {
  System.out.println("Invalid week number");
 }


}


}


--------------------------------------------------------------------------------
package loops;
public class NumberOfDigits {


public static void main(String[] args) {


 int count = 0;
 int num = 3452;


        while(num != 0)
        {
            num /= 10;  // 345  34  3
            ++count;
        }


        System.out.println("Number of digits: " + count);




}


}


--------------------------------------------------------------------------------
package loops;


import java.util.Scanner;


public class Palindrome {


public static void main(String[] args) {
  
 int lastDigit,sum=0,a;    
 int inputNumber=171; //It is the number  to be checked for palindrome 


 a=inputNumber; 
        
        // Code to reverse a number
 while(a>0)
 {   System.out.println("Input Number "+a);  
  lastDigit=a%10; //getting remainder  
  System.out.println("Last Digit "+lastDigit); 
  System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
  sum=(sum*10)+lastDigit;  
  a=a/10;
 
 }    


 // if given number equal to sum than number is palindrome otherwise not palindrome
 if(sum==inputNumber)    
  System.out.println("Number is palindrome ");    
 else    
  System.out.println("Number is not palindrome");     
}


}


--------------------------------------------------------------------------------
package arraysandstrings;


public class PalindromeString {


public static void main(String[] args) {
 
   String s = "DAD";
  
   //1. using for loop 
   int len = s.length(); //7
   String rev = "";
  
   for(int i =len-1; i>=0; i--){
    rev = rev + s.charAt(i); //muineleS
   }
  
   System.out.println(rev);
  
   if(s.equals(rev))
   {
    System.out.println("Palindrome string");
   }
   else
   {
    System.out.println("Not Palindrome string");
   }
  
  
  
  
  
   //2. using StringBuffer class:
   //StringBuffer sf = new StringBuffer(s);
   //System.out.println(sf.reverse());
}




}
--------------------------------------------------------------------------------
//Write a Java program print a number is positive or negative. 
package conditions;


public class PositiveOrNagitiveNumber {


public static void main(String[] args) {


 int num = 10; // positive
 // int num=-10; //Negitive


 if (num > 0) 
 {
  System.out.println(" Number is Positive");
 } else 
 {
  System.out.println("Number is Negitive");
 }


}


}


--------------------------------------------------------------------------------
package collections;


import java.util.ArrayList;
import java.util.HashSet;


//Removing Duplicate Elements From ArrayList Using HashSet


public class RemoveDuplicatesFromArrayList {
  public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList listWithDuplicateElements = new ArrayList();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
 
        HashSet set = new HashSet(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList listWithoutDuplicateElements = new ArrayList(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
  
}
--------------------------------------------------------------------------------


package arrays;


public class RemoveJunk {


public static void main(String[] args) {


 String s = "å°?ç±³ä½“éªŒç‰ˆ latin string 01234567890";
 String s1 = "@#$@#$@ testing #@$@#$@#$ Selenium !@#$@#$@# &&&& Java";


 //Regular Expression: [^a-zA-Z0-9]


 s = s.replaceAll("[^a-zA-Z0-9]", "");
 System.out.println(s);


 s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
 System.out.println(s1);




}


}
--------------------------------------------------------------------------------
package strings;
/*
 * Write a java program to remove all white spaces from a string?
 * 
 */


public class RemoveWhiteSpacesInaString {


public static void main(String[] args) {
  {
         String str = "  Core Java selenium automation       oops programming  ";
          
         String strWithoutSpace = str.replaceAll("\\s", "");
  
         System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
  
  }


}


}
--------------------------------------------------------------------------------


package strings;


import java.util.Scanner;


// Please change the extension to .java before using the file
// I changed the extension to .txt because udemy does not allow to upload .java files
public class ReverseChars {


public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 System.out.println("Please enter a string: ");
 String original = scan.nextLine();


 while (original.isEmpty() || original == null) {
  System.out.println("Please enter a valid string, empty and null strings are not accepted:");
  original = scan.nextLine();
 }
 scan.close();


 ReverseChars output = new ReverseChars();
 String reverseCharacters = output.reverseCharacters(original);
 System.out.println(reverseCharacters);
}


private String reverseCharacters(String originalString) {
 String reverse = "";


 for (int i = originalString.length() - 1; i >= 0; i--) {
  reverse = reverse + originalString.charAt(i);
 }
 return reverse;
}
}


--------------------------------------------------------------------------------
package strings;


/*
 * Java Program To Reverse Each Word Of A String 
 */
public class ReverseEachWord {
  public static void main(String[] args) 
    {
        reverseEachWordOfString("Java Concept Of The Day");
        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
        reverseEachWordOfString("I am string not reversed");
        reverseEachWordOfString("Reverse Me");
    }
  
  static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
        System.out.println(reverseString);
        System.out.println("-------------------------");
    }
}
--------------------------------------------------------------------------------


package loops;


public class ReverseNumber {
public static void main(String args[]) 
{
 // 1. using algorithm
 long num = 12345; // 54321
 long rev = 0;


 while (num != 0) 
 {
  rev = rev * 10 + num % 10; // 5432
  num = num / 10; // 12
 }


 System.out.println("Reverse num is:" + rev);


 // 2. using StringBuffer method
 long num1 = 12345;
 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
}
}


--------------------------------------------------------------------------------
package strings;


import java.util.Scanner;


public class ReverseString {


public static void main(String[] args) {
  //Reverse a String: 
   //diff bw String and StringBuffer
   //do we have reverse function in String?
  
  System.out.println("Enter the string:");
  
  Scanner sc = new Scanner(System.in);


  String s=sc.nextLine();


  
   //1. using for loop 
   int len = s.length(); //8
   String rev = "";
  
   for(int i =len-1; i>=0; i--){
    rev = rev + s.charAt(i); //muineleS
   }
  
   System.out.println(rev);
  
   //2. using StringBuffer class:
   StringBuffer sf = new StringBuffer(s);
   System.out.println(sf.reverse());
}




}
--------------------------------------------------------------------------------
package arraysandstrings;


public class SearchNumberinArray {


public static void main(String[] args) {
 
  int a[]={10,20,30,40,50};
 
  int num=30;
  boolean flag=false;
 
  for(int i:a)
  {
   if(num==i)
   {
    System.out.println("Element found");
    flag=true;
    break;
   }
  }
 
  if(flag==false)
  {
   System.out.println("Element NOT found");
  }
 


}


}
--------------------------------------------------------------------------------
package arrays;


public class SearchNumericValueInArray {


public static void main(String[] args) {


 int a[]={10,20,30,40,50};


 int num=30;
 boolean flag=false;


 for(int i:a)
 {
  if(num==i)
  {
   System.out.println("Element found");
   flag=true;
   break;
  }
 }


 if(flag==false)
 {
  System.out.println("Element NOT found");
 }






}


}


--------------------------------------------------------------------------------
package arraysandstrings;


public class SearchStringinArray {


public static void main(String[] args) {


 String a[]={"abc", "xyz", "pqr"," mno"};


 String search_String="xyz";


 boolean flag=false;


 for(String s:a)
 {
  if(search_String==s)
  {
   System.out.println("Element found");
   flag=true;
   break;
  }
 }


 if(flag==false)
 {
  System.out.println("Element NOT found");
 }






}


}
--------------------------------------------------------------------------------
package arrays;


public class SearchStringValueInArray {


public static void main(String[] args) {


 String a[]={"abc", "xyz", "pqr"," mno"};


 String search_String="xyz";


 boolean flag=false;


 for(String s:a)
 {
  if(search_String==s)
  {
   System.out.println("Element found");
   flag=true;
   break;
  }
 }


 if(flag==false)
 {
  System.out.println("Element NOT found");
 }






}


}
--------------------------------------------------------------------------------
package arraysandstrings;


import java.util.Arrays;


public class SearchUsingMethod {
 
 public static void main(String args[])
   {
  int array[] = {10, 20, 30, 40, 50 }; //Should be in order
  
     System.out.println(Arrays.binarySearch(array, 10));
   }
}
--------------------------------------------------------------------------------
package arrays;


public class SingleDimArray {


public static void main(String[] args) {




 /*int a[]=new int[5]; // Declared an array with size 5, starting 0, end index 4


 //storing/inserting values into array
 a[0]=100;
 a[1]=200;
 a[2]=300;
 a[3]=400;
 a[4]=500;*/


 int a[]={100,200,300,400,500}; // Declare an array without size and store values


 System.out.println(a.length); // Prints length of an array


 //System.out.println(a[2]); //300




/* for(int i=0;i<=a.length-1;i++)   
 {
  System.out.println(a[i]); //100 200 300 400 500
 }*/




 //Enhanced for loop/for..each loop
 for(int i:a)
 {
   
  System.out.println(i);
 }


 //How to break for loop in the middle
 for(int i:a)
 {
  if(i==400)
  {
   break;
  }
 
  System.out.println(i);
 }




}


}
--------------------------------------------------------------------------------


package arraysandstrings;


import java.util.Arrays;


public class SortArray {


public static void main(String[] args) {


 //Number Array sorting
 int data[] = { 4, 10, 2, 6, 1 };
  
    Arrays.sort(data); 
   
   for (int c: data) 
    {
      System.out.println(c);
    }
    
      
    //String array sorting
          
   String data2[] = { "z","a","x"};
    Arrays.sort(data2);
 
    for (String c: data2) 
    {
      System.out.println(c);
    }
    
    


}


}
--------------------------------------------------------------------------------
package arrays;


import java.util.Arrays;


public class SortingUsingSortMethod {


public static void main(String args[])
  {
    int data[] = { 4, 10, 2, 6, 1 };
 
    Arrays.sort(data);
 
    for (int c: data) 
    {
      System.out.println(c);
    }
  }
}


--------------------------------------------------------------------------------
package strings;


public class StringMethods {


public static void main(String[] args) {


 String s="welcome";


 //length()
 System.out.println(s.length());


 //concat()
 String s1="welcome";
 String s2=" to java";


 System.out.println(s1.concat(s2));
 System.out.println("welcome".concat(" to java"));
 
 //trim()
 s="    welcome    ";
 System.out.println(s);
 System.out.println(s.trim());




 //charAt()
 s="Welcome";


 System.out.println(s.charAt(4)); //o


 //contains() --> return true/false
 s="Welcome to java";
 System.out.println(s.contains("java")); //true
 System.out.println(s.contains("Java")); //false


 //equals()  & equalsIgnoreCase()
 s="Selenium";
 System.out.println(s.equals("SELENIUM"));
 System.out.println(s.equalsIgnoreCase("SELENIUM"));


 //Replace()
 s="welcome to java";
 System.out.println(s.replace('e', 'a')); // replacing single character
 System.out.println(s.replace("java", "selenium")); // replacing multiple chars


 //substring()
 s="Welcome";
 System.out.println(s.substring(2,4)); //lc
 System.out.println(s.substring(4,7));  //ome


 //toLowerCase() && toUpperCase()


 s="WelCome";


 System.out.println(s.toLowerCase()); //welcome
 System.out.println(s.toUpperCase()); //WELCOME
}


}
--------------------------------------------------------------------------------


package strings;


public class StringSwapping {
public static void main(String[] args) {


 //WAP to swap strings without using temp/third variable:


 String a = "Hello";
 String b = "World";


 System.out.println("before swapping: ");
 System.out.println("the value of a is:"+ a);
 System.out.println("the value of b is:"+ b);


 //1. append a and b:
 a = a+b; //HelloWorld


 //2. Store initial string a in String b:
 b = a.substring(0, a.length()-b.length()); 


 //3. Store initial string b in String a:
 a = a.substring(b.length());


 System.out.println("the value of a and b after swapping");


 System.out.println("the value of a is:"+ a);
 System.out.println("the value of b is:"+ b); 


}
}
--------------------------------------------------------------------------------
package strings;


public class StringToIntegerConversion {


public static void main(String[] args) {




 // Convert String To Integer Using Integer.parseInt() method
    String s = "2015";
         
        int i = Integer.parseInt(s);
         
        System.out.println(i); 
        
    //Convert String To Integer Using Integer.valueOf() method
            
        i = Integer.valueOf(s);
         
        System.out.println(i); 
}


}
--------------------------------------------------------------------------------
package arrays;


public class SumOfArray {


public static void main(String args[]){
      int[] array = {10, 20, 30, 40, 50, 10};
      int sum = 0;
    
      //Advanced for loop
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }


}


package javaBasics;


public class SwappingWithoutThirdVariable {


public static void main(String[] args) {


 int x = 5; 
 int y = 10; 


 //x = 10, y = 5


 //1. with using third var : t
//  int t;
//  t = x; //5
//  x = y; //10
//  y = t; //5


 //2. without using third var: using + operator
//  x = x + y; //15
//  y = x - y; //5
//  x = x - y; // 10


 //3. without using third var: using * operator
//   x = x * y; //50
//   y = x / y;  //5
//   x = x / y; //10
   


 System.out.println(x);
 System.out.println(y);
}


}


package conditions;
public class SwitchCaseStatement {


public static void main(String[] args) {


 int day=10;


 switch(day)
 {
 case 1: System.out.println("Sunday"); break;
 case 2: System.out.println("Monday"); break;
 case 3: System.out.println("Tuesday"); break;
 case 4: System.out.println("Wednesday"); break;
 case 5: System.out.println("Thursday"); break;
 case 6: System.out.println("Friday"); break;
 case 7: System.out.println("Saturday"); break;
 default: System.out.println("Invalid week number");
 }


 
}


}
--------------------------------------------------------------------------------
package arrays;


public class TwoDimArray {


public static void main(String[] args) {


 int a[][]=new int[3][2];


 a[0][0]=100;
 a[0][1]=200;


 a[1][0]=300;
 a[1][1]=400;


 a[2][0]=500;
 a[2][1]=600;


 //int a[][]={ {100,200},{300,400},{500,600}};


 System.out.println(a.length); //return number of rows


 System.out.println(a[0].length); //returns number of columns


 /*for(int r=0; r<=a.length-1;r++) // increment rows  r=0 1 2 3
 {
  for(int c=0;c<=a[0].length-1;c++) //c=0 1 2
  {
   System.out.print(a[r][c]+"  "); //00 =100  01=200 10=300  11=400 20=500 21=600
  }
  System.out.println();
 }*/




 for(int r[]:a)
 {
  for(int c:r)
  {
   System.out.println(c);
  }
 }


 


}


}
--------------------------------------------------------------------------------
package strings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Program To Find Number Of Characters, Words And Lines In A File


public class WordCountInFile 
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("C:\\SeleniumPractice\\Test.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                //Updating the lineCount
                 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //Updating the charCount
                     
                    charCount = charCount + word.length();
                }
                 
                //Reading next line into currentLine
                 
                currentLine = reader.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}

