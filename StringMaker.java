// import java.nio.charset.Charset;
// import java.text.DecimalFormat;
// import java.util.Random;
// import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.Arrays;
// import java.util.Iterator;

// import java.text.DecimalFormat;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.ListIterator;
// import java.util.Objects;
// import java.util.Scanner;

// import java.text.DecimalFormat;
// import java.util.Scanner;
// import java.util.StringTokenizer;

// // ...............................string in java.............................
// import java.lang.String;
// import java.util.Scanner;

// public class StringMaker{
//     public static void main(String[] args){
//         // String str = new String("Hello ");  // this is simple string...

//         // System.out.println("String is:- "+str); // print Hello..

//         // //use stringConcationation in java...

//         // String str2 = str.concat("Programmer..."); 

//         // System.out.println("String Concationation is:-"+str2); // print Hello Programmer...

//         // String str3 = str2.concat("Shahid ");

//         // System.out.println("New String is :- "+str3); // print Hello programmer Shahid..

//         // String str4 = str3+20+20;

//         // System.out.println("Full String is:- "+str4); // print Hello Programmer Shahid 2020

//         /**
//          * Comapre to string using Comparto() 
//          */

//          Scanner scan = new Scanner(System.in);

//          String temp=null;
//          int number;

//          String[] array = new String[5];

//          System.out.println("Enter The Five String Name:- ");
//          for(int i=0; i<array.length; i++){
//              System.out.println("Enter The"+(i+1)+"String Name:- ");

//              array[i]= scan.next();

//          }

//          System.out.println("String Has Been Completed..."); // store in the string array....
//          //compare the string who use pass in array of string...

//          for(number=0; number<array.length; number++){
//              for(int j=number+1; j<array.length; j++){
//                  if(array[number].compareTo(array[j])>0){
//                         temp=array[number];
//                         array[number]= array[j];
//                         array[j]=temp;
//                  }
//              }
//          }

//          //print the string....
//          for(number=0; number<array.length; number++){
//             System.out.println((number+1)+"String is:- "+array[number]);
//             System.out.println((number+1)+"String Length is:- "+array[number].length());

//          }

//          scan.close();

//     }
// }

// .......................................StringBuffer in java......................

// import java.lang.String;
// import java.lang.StringBuffer;

// public class StringMaker{
//     public static void main(String[] args) throws IndexOutOfBoundsException{
//         String str = new String("Hello Program");

//         System.out.println("String is:- "+str);
//         System.out.println("Length is:- "+str.length());

//         //cant add or insert or delete eleement in string
//         //so use stringBuffer class in java............

//         StringBuffer sf = new StringBuffer();
//         System.out.println("defualt Capacity is:- "+sf.capacity());
//         StringBuffer sb = new StringBuffer(str);
//         // System.out.println("Deafult capacity is:- "+sb.ca);

//         sb.append("mer"); // append the last of the string....
//         sb.append(" 2020");//append the last of the string...
//         sb.insert(16,"S");

//         System.out.println("StringBuffer is:- "+sb); // print hello programmer 2020
//         System.out.println("StringBuffer Length is:- "+sb.length());
//         System.out.println("Capacity of The StringBuffer is:- "+sb.capacity()); // now stringbuffer capacity is:- default+stringlength.....(16+21)=37

//     }
// }

// ...................................................StringBuilder in java......................
// StringBulider is represent in java when java is created immutable character then stringbulider alternative create mutable characete ...
// import java.lang.StringBuilder;

// public class StringMaker{
//     public static void main(String[] args) throws IndexOutOfBoundsException{
//         String str = new String("Hello Programmer...."); // create a simple string....

//         System.out.println("Simple String is:- "+str);

//         StringBuilder strb = new StringBuilder(str);
//         System.out.println("StringBuilder String is:- "+strb);
//         System.out.println("StringBulider is:- "+strb.toString());

//         strb.append("Shahid"); //  append becuase StringBuilder create a mutable string ..

//         System.out.println("New StringBuilder is:- "+strb);
//         System.out.println("Capacity of StringBuilder is:- "+strb.capacity());

//         strb.appendCodePoint(20);

//         System.out.println("StringAppendCodePoint is:- "+strb.toString());

//         System.out.println("Index of the stringBuilde is:- "+strb.indexOf(str));

//         System.out.println("Last index of The StringBuilder is:- "+strb.lastIndexOf(str));

//         StringBuilder reverseStr = strb.reverse();
//         System.out.println("Reverse String is:- "+reverseStr.toString());

//         System.out.println("First Character is:- "+strb.charAt(1)); // print the first character is:- d becuase StringBuilder ...

//         System.out.println("CodePoint is:- "+strb.codePointAt(1));
//         for(int i=0; i<strb.length(); i++){
//             System.out.println(strb.charAt(i)+" Code Point is:- "+strb.codePointAt(i)+" And Index of:- "+strb.charAt(i)+ "is:- "+i);
//         }
//         System.out.println("CodePoint Before is:- "+strb.codePointBefore(1));
//         System.out.println("CodePointCount is:- "+strb.codePointCount(1, 26));

//     }
// }

// .....................................StringTokenizer(Set-1) in java.....................
// StringTokenizer is interlly work in string and token to particulae .....

// public class StringMaker{
//     public static void main(String[] args){
//         System.out.println("Using Constructer--1");
//         StringTokenizer str1 = new StringTokenizer("Hello Programmer How Are You"," ");

//         while(str1.hasMoreTokens()){
//             System.out.println(str1.nextToken());

//         }

//         System.out.println("Using Constructer --2");
//         StringTokenizer str2 = new StringTokenizer("Java :Code :String", ":",false);
//         while(str2.hasMoreTokens()){
//             System.out.println(str2.nextToken());
//         }

//         System.out.println("Using Constructer --3");
//         StringTokenizer str3 = new StringTokenizer("Java :Code :String", ":", true);
//         while(str3.hasMoreTokens()){
//             System.out.println(str3.nextToken());
//         }

//     }
// }

// .....................................StringTokenizer (Set-2) in java..............................

// there is four method use in StringTokenizer ....

// 1. hasMoreTokens():- this method java.lang.StringTokinzer.hasMoreTokens() work it check the string token are avialble in StringTokinzer..
// 2. nextToken():- this method java.util.StringTokenizer.nextToken() return The Next Element in StringTokinzer.
// 3. countTokens():- it work count to the token of the StringTokinzer .
// 4. hasMoreElement():- this method implements Enumaration interafec and check the Element in the StringTokinzer.a
// 5.nextElemnt():- this method return the element in the StringTokinzer

// import java.util.StringTokenizer.*;

// public class StringMaker{
//     public static void main(String[] args){
//         String mydelim = ":";
//         String mystr= ": Java : Code : String : Tokenizer : Class: Shahid";

//         StringTokenizer geek3 = new StringTokenizer(mystr, mydelim);

//         int count = geek3.countTokens(); // return the count how many count token in the stringTokenizer....
//         System.out.println("Token Count is:- "+count);
//         //first print the simple using the element...

//         // for(int i=0; i<count; i++){
//         //     System.out.println("Token at ["+i+"]"+geek3.nextToken());
//         // }  // return the tokenb the using without the hasMoreTokens....

//         //using the print hasMoreElement...
//         // while(geek3.hasMoreTokens()){
//         //     System.out.println(geek3.nextToken());
//         // } // return the token using hasMoreElement...

//         //using the hasMoreEle,ent....

//         while(geek3.hasMoreElements()){
//             System.out.println(geek3.nextElement());

//         }

//     }
// }

// ..............................StringJoiner in String........
// import java.util.ArrayList;
// import java.util.StringJoiner;
// import java.lang.Integer;

// public class StringMaker{
//     public static void main(String[] args){
//         // ArrayList<String> al = new ArrayList<String>();

//         // if(al.isEmpty()){
//         //     System.out.println("ArrayList is Empty....");
//         // }

//         // al.add("Ram");
//         // al.add("Shyam");
//         // al.add("Aliance");
//         // al.add("Bob");

//         ArrayList<Integer> al = new ArrayList<Integer>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);

//         System.out.println("ArrayList is:- "+al);
//         System.out.println("ArrayList Lenght is:- "+al.size());

//         String str3 = al.toString();

//         System.out.println("ArrayList String is:- "+str3);

//     //use first Stringjoiner using delimiter is ","
//     // StringJoiner str1 = new StringJoiner(",");
//     // // set the Empty stringJoiner...\
//     // str1.setEmptyValue("Str1 is Empty....");

//     // System.out.println("StringJoiner is:- "+str1);

//     // str1.add(al.get(0)).add(al.get(1)); // add the String Joiner  using delimiter ...\

//     // System.out.println("StringJoiner Str1 is:- "+str1);
//     // System.out.println("Length of StringJoiner is:- "+str1.length());

//     // //use the Second StringJoiner is using delimeter of ":"..

//     // StringJoiner str2 = new StringJoiner(":");

//     // str2.add(al.get(2)).add(al.get(3));

//     // System.out.println("StringJoiner str2 is:- "+str2);  //print the strinjoiner str2 is...

//     // str1.merge(str2); // here the merger str1 with str2 and return the object in the singla line and in str1..

//     // System.out.println("Str1 is:- "+str1);
//     // System.out.println("str2 is:- "+str2);

//     // System.out.println("length of the New StringJoiner str1 is:- "+str1.length());
//     // System.out.println("Length of the StringJoiner is str2 is :- "+str2.length());
//     // System.out.println(str1.toString());
//     }
// }

// ......................................Difference Way to Integer to String Conversio  in java.....................

// 1. Convert to Integer.toString(int)..
// public class StringMaker{
//     public static void main(String[] args){
//         int a =1234;
//         int b=-1234;

//         String str1 = Integer.toString(a);// convert the intetger into string ....
//         String str2 = Integer.toString(b); 

//         System.out.println("String str1 is:- "+str1);
//         System.out.println("String str2 is:- "+str2);
//         System.out.println("Value of The first Integer Value is:- "+a);
//         System.out.println("Value of The Second Integer Value is :- "+b);

//     }
// }

// 2..Convert use String.valueOf().
// public class StringMaker{
//     public static void main(String[] args){
//         int a=100;
//         int b=1200;

//         String str= String.valueOf(a);
//         String str2 = String.valueOf(b);

//         System.out.println("String str1 is:- "+str);
//         System.out.println("String Str2 is:-" +str2);

//         System.out.println("Length of The First String is:- "+str.length());
//         System.out.println("Lenght of The Second String is:- "+str2.length());

//         String str3 = str+str2; // add two Strring here...

//         System.out.println("Thrird String is:- "+str3);
//         System.out.println("New String Lenght is:- "+str3.length());
//     }
// }

// 3..convert by DecimalFormat ..

// public class StringMaker{
//     public static void main(String[] args){
//         int a =12345;

//         DecimalFormat df = new DecimalFormat("#,####");

//         String str = df.format(a);

//         System.out.println("Decimal Format is:- "+str);

//     }
// }

// 4. Convert using StringBuffer and StringBuilder.
// import java.lang.StringBuilder;

// public class StringMaker{
//     public static void main(String[] args){
//         int a=255;

// StringBuffer str = new StringBuffer().append(a);
// System.out.println("StringBuffer is:- "+str);

// StringBuilder strb = new StringBuilder().append(a);
// String str = strb.toString();

// System.out.println("StringBuilder is:- "+str);

//use Binary in java..........
//         String binaryString = Integer.toBinaryString(a);
//         System.out.println("Binary String is:- "+binaryString);

//         String octalString = Integer.toOctalString(a);
//         System.out.println("Octal String is:- "+octalString);

//         String hexString = Integer.toHexString(a);
//         System.out.println("HexaDecimal String is:- "+hexString);

//     }

// }

// .................................Convert String To Integer in java..........
// first string to integer convert by using parseInt()....

// parseInt() have two Mathod..
// 1. public static int parseInt(String s) throw NumberFormatException........
// 2. public static int parseInt(String s, int radix) throw NumberFormatExcaption
// when NumberFormatExcaption is work..
// . String is Null or Empty...
// . Parameters String  is same as integer data type.

// Example..
// public class StringMaker{
//     public static void main(String[] args){
//        int DecimalFormat = Integer.parseInt("20");
//        int signedPositiveExample = Integer.parseInt("+20");
//        int signedNegativeExample = Integer.parseInt("-20");
//        int radixExample = Integer.parseInt("20", 16); // return 16 (2)*16^1 + (0)+16^1 = 2*16+0 = 32...
//        int stringExample = Integer.parseInt("s",35); // return the NumberFormatException...

//        System.out.println(DecimalFormat);
//        System.out.println(signedPositiveExample);
//        System.out.println(signedNegativeExample);
//        System.out.println(radixExample);
//        System.out.println(stringExample);

//     }
// }

// ..................2nd Using Integer.valueOf()..............

// va;ueOf() uses paseInt() interally convert to Integer..

// public class StringMaker{
//     public static void main(String[] args){
//         int DecimalFormat = Integer.valueOf("20");
//         int signedPositiveExample = Integer.valueOf("+20");
//         int signedNegativeExample = Integer.valueOf("-20");
//         int radixExample = Integer.valueOf("20",16); // return 32
//         int stringExample = Integer.valueOf("shahid",30);

//         System.out.println(DecimalFormat);
//         System.out.println(signedPositiveExample);
//         System.out.println(signedNegativeExample);
//         System.out.println(radixExample);
//         System.out.println(stringExample);

//     }
// }

// ....................................Swap two string without using user defined third variable in java............

// public class StringMaker{
//     public static void main(String[] args){
//         String  a="shahidsh";
//         String b="muskans";

//         System.out.println("After Swaping value of  A is:- "+a + " And B is:- "+b);

//         a=a+b; // a= 10+20 , a=30;
//         System.out.println("Lenght of A is:- "+a.length());
//         System.out.println("Length of B is:- "+b.length());

//         b=a.substring(0, a.length()-b.length()); // b= 30-20 = b= 10; means 10 is store in b;

//         a=a.substring(b.length()); //a= 30-10 , a= 20; means 20 is store in a ;

//         System.out.println("Before Swaping value of A is:- "+a+ "and B is:- "+b);

//         char  s = a.charAt(5);

//         System.out.println("a String 5 index charcters is:- "+s);

//     }
// }

// .............................Searching Character And Substring in String in java.............................................

// ...................................using character in string.....

// public class StringMaker{
//     public static void main(String[] args){
//         String str = "GeekforGeeks is a computer portal is";

//         int first_in = str.indexOf("G");
//         System.out.println("First Occurance of G is:- "+first_in);

//         int last_in = str.lastIndexOf("c");
//         System.out.println("Last Occuarnce of C is:- "+last_in);

//         int first_after = str.indexOf("s", 10);
//         System.out.println("First Occuarnce of s after is:- "+first_after);

//         int last_after = str.lastIndexOf("c", 20);
//         System.out.println("Last Occuarnce of c after is:- "+last_after);

//         char character = str.charAt(10); // return k ..
//         System.out.println("Character is :- "+character); 

//         //Ascii Value of k is:- 

//         int ascii = str.charAt(10);
//         System.out.println("Ascii Value of K is:- "+ascii);

//         // .........................using substring in string...................

//         int sub_first= str.indexOf("Geek"); //return 0 becuase indexof using character but here CharSequence so return 0
//         System.out.println("First Occurance substring is:- "+sub_first);

//         int sub_last = str.lastIndexOf("computer");  // return if is stay in last position... return 18
//         System.out.println("Last Occurance substring of Computer is:- "+sub_last);

//         int sub_after = str.indexOf("is", 20);
//         System.out.println("After The substring is:- "+sub_after);

//         int sub_after_sub = str.lastIndexOf("is", 34);
//         System.out.println("After The Substring is of por :- "+sub_after_sub);

//         // ..............................using contains() in string........................
//         CharSequence string  = "Geek";
//         boolean first_string = str.contains(string); // return true ...
//         System.out.println("String Geek is:- "+first_string);

//         boolean last_string = str.contains("portal");
//         System.out.println("String Portal Contains: -"+last_string);  // return true ..

//         boolean is_true = str.contains("por");  // return true...
//         System.out.println("String Por Contain:- "+is_true);

//         // ...........................check true or false with using With................
//         // boolean startWith(String ch);

//         // boolean startWith(String ch, int indexfrom);

//         // boolean endsWith(String str ch);

//         System.out.println(str.startsWith("Geek"));  // return true
//         System.out.println(str.startsWith("is", 13)); // return true...  // beacuase  is startwith 13and ends with 34 so its return true...
//         System.out.println(str.endsWith("portal")); // return false..

//     }
// }

// ....................................compare two String in java.................................

// Input:- GeekforGeeks
// Input:- Geek

// output:- 8

// Input 1:- Geek

// Input 2:- Geek

// output:- 0

// Input 1:- GeekforGeeks

// Input 2:- practice

// output:- -
// public class StringMaker{

//     public static int stringCompare(String str1, String str2){
//         int len = str1.length();
//         int len2 = str2.length();
//         int lenmin = Math.min(len, len2); // return the minimum number of lenght ..
//         for(int i=0; i<lenmin; i++){
//             int sub_len = (int)str1.charAt(i); // return
//             int sub_len2 = (int)str2.charAt(i); // return the charcter index ...

//             System.out.println("Ascii Value of "+(char)sub_len+" is:- "+sub_len);
//             System.out.println("Ascii Value of "+(char)sub_len2+" is:- "+sub_len2); // p=112 P=?

//             if(sub_len !=sub_len2){
//                 return sub_len- sub_len2;
//             }

//         }

//         if(len !=len2){
//             return len-len2;
//         }
//         else{
//             return 0;
//         }
//     }
//     public static void main(String[] args){
//         String string1 = new String("Geeksforgeeks");
//         String string2 = new String("Practice");
//         String string3 = new String("Geeks");
//         String string4 = new String("Geeks");
//         // return -9 beacuase string2 characters is not equal to string1 character then return negative value and i use loop for
//         //minimum character String.,.

//         System.out.println("Compare"+string1+" And "+string2+" :- "+ stringCompare(string1, string2));

//         // this return string  is 0 becuase string1 is equal to the second string and len is same so retunr 0..

//         System.out.println("Compare"+string3+" And "+string4+": "+stringCompare(string3, string4));

//         // this return the 8 becuase first loop code start and match the character when character are same then 
//         //excute the loop and chekc the string length and string string is less then first string then return len-len2 and return 8.

//         System.out.println("Compare"+string1+" And "+string4+": "+stringCompare(string1, string4));

//     }
// }

// ......................................Second Methology is:- String.equals()  use to compare two String.................

// import java.lang.String;

// public class StringMaker{
//     public static void  main(String[] args){
//         String string1 = new String("Geeksforgeeks");
//         String string2 = new String("Practice");
//         String string3 = new String("Geeks");
//         String string4 = new String("Geeks");
//         String string5 = new String("geeks");

//         System.out.println("Comparing "+string1+"And "+string2+": "+string1.equals(string2)); // return false...

//         System.out.println("Comparing "+string3+"And "+string4+":"+string3.equals(string4)); // return true...
//         System.out.println("Comparing "+string4+"And "+string5+": "+string4.equals(string5)); // return false...
//         System.out.println("Comparing "+string1+"And "+string5+": "+string1.equals(string5)); // return false...
//     }
// }

// ..............................USing String.equalsIgnoreCase() in String in java.....

// import java.lang.String;

// public class StringMaker{
//     public static void main(String[] args){
//         String string1 = new String("Geeksforgeeks");
//         String string2 = new String("Practice");
//         String string3 = new String("Geeks");
//         String string4 = new String("Geeks");
//         String string5 = new String("geeks");

//          System.out.println("Comparing "+string1+"And "+string2+": "+string1.equalsIgnoreCase(string2)); // return faLSE...
//          System.out.println("Comparing "+string2+"And "+string3+": "+string2.equalsIgnoreCase(string3)); // return false....
//          System.out.println("Comparing "+string3+"And "+string4+": "+string3.equalsIgnoreCase(string4)); // return true..
//          System.out.println("Comparing "+string4+"And "+string5+": "+string4.equalsIgnoreCase(string5)); // return true...
//          System.out.println("Comparing "+string1+"And "+string5+": "+string1.equalsIgnoreCase(string5)); // return false..
//     }
// }

// ...................................................USing Object.equals() in String in java...........

// import java.lang.String;
// import java.lang.Object;

// public class StringMaker{
//     public static void main(String[] args){
//         String string1 = new String("Geeksforgeeks");
//         String string2 = new String("Practice");
//         String string3 = new String("Geeks");
//         String string4 = new String("Geeks");
//         String string5 = new String("geeks");

//         // System.out.println("Comparing "+string1+"And "+string2+": "+Objects.equals(string1,string2));  // return false...
//         // System.out.println("Comparing "+string2+"And "+string3+": "+Objects.equals(string2,string3));  // return false...
//         // System.out.println("Comparing "+string3+"And "+string4+": "+Objects.equals(string3, string4)); // return true..
//         // System.out.println("Comparing "+string4+"And "+string5+": "+Objects.equals(string4, string5)); // return false..
//         // System.out.println("Comparing "+string1+"And "+string5+": "+Objects.equals(string1, string5)); // return false..

//         /** 
//          * check using String.compareTo(String str) in string.....
//          */
//         System.out.println("Comparing "+string1+"And "+string2+": "+string1.compareTo(string2));  // return -9
//         System.out.println("Comparing "+string2+"And "+string3+": "+string2.compareTo(string3)); // return 9
//         System.out.println("Comparing "+string3+"And "+string4+": "+string3.compareTo(string4)); // return 0
//         System.out.println("Comparing "+string4+"And "+string5+": "+string4.compareTo(string5)); // return -??
//         System.out.println("Comparing "+string1+"And "+string5+": "+string1.compareTo(string5)); // return -??

//         /**
//          * Check using String.compareToIgnoreCase(String str) in string in java...
//          */
//         System.out.println("Comparing "+string1+"And "+string2+": "+string1.compareToIgnoreCase(string2));  // return -9
//         System.out.println("Comparing "+string2+"And "+string3+": "+string2.compareToIgnoreCase(string3)); // return 9
//         System.out.println("Comparing "+string3+"And "+string4+": "+string3.compareToIgnoreCase(string4)); // return 0
//         System.out.println("Comparing "+string4+"And "+string5+": "+string4.compareToIgnoreCase(string5)); // return 0
//         System.out.println("Comparing "+string1+"And "+string5+": "+string1.compareToIgnoreCase(string5)); // return 8

//     }
// }

// ..................................Reverse A String in Java........................................
// import java.lang.String;
// import java.lang.StringBuilder;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// .........................................1st Using byte stream in java ......................
// public class StringMaker{
//     public static void main(String[] args){
/**
 * first Using byte[] conveted using string ,.....
 */
// String str = "Geekforgeeks"; // this is a string and reference variable is str..

// byte[] bytearray = str.getBytes(); // for store the string into byte ....

// byte[] temp1 = new byte[bytearray.length]; // for Store the reverese the string into temprary string....

// for(int i=0; i<bytearray.length; i++){
//     temp1[i] = bytearray[bytearray.length-i-1] ; // store the byte character in the temp array....

// }
// System.out.println(new String(temp1)); // convert thge string into string ...          

/**
 * 2. using StringBuilder Class reverse() method....
 */

//  String str= "Geek For geeks";

//  StringBuilder stringBuilder = new StringBuilder(str); // convert the string into StringBuilder Class..

//  System.out.println("Before Using String Class String is:- "+str);

//  stringBuilder.reverse();

//  System.out.println("After StringBuilder String is :- "+stringBuilder);

/**
 * 3. Using String Convert The Character Array ....
 */
// String str = "GeekforGeeks";

// char[] chararray = str.toCharArray();  // convert String Into Character ...

// for(int i=chararray.length-1; i>=0; i--){
//     System.out.print(chararray[i]);

// }

/**
 * 4. Using String Convert into Character By Swap ...
 */

//  String str = "GeekForGeeks";

//  char[] array = str.toCharArray();

//  int left,right=0;
//  right = array.length-1;

//  for(left=0; left<right; left++, right--){
//      char temp = array[left];
//      array[left] = array[right];
//      array[right] = temp; 
//  }

//  System.out.println(new String(array));  //or using loop ...

/**
 * and last using ArrayList class...
 */

//  String str = "Geekforgeeks";  // this is not a object class reference so arraylist class objetc doesnot direct string refernece 
//  //support so first convert to char array then add per char in the arraylist object....
//  char[] array = str.toCharArray();

//  List<Character> al = new ArrayList<Character>(); 

//  for(char c:array){
//      al.add(c); // add the character in the ArrayList Object...
//      System.out.println("Position of "+c+" is :- "+al.indexOf(c));
//  }

//  //reverse the Object Of The ArrayList Using Collections Class. This class Use reverse of only object reverse ...
//  Collections.reverse(al); // reverse the arrayList...

//  // then Print the all element using ListIterator Class .This Class print or get the reverse the araryList Object...
//  ListIterator it = al.listIterator();
//  while(it.hasNext()){

//     System.out.print(it.next());
//  }

//     }
// }

// ..................................removing Leading zeros in String.....

// import java.lang.String;
// import java.lang.StringBuffer;

// public class StringMaker{
//     public static String removeZero(String str){
//first Way use...

// int i=0; 
// while(i<str.length() && str.charAt(i)=='0'){
//     i++;
// }

// StringBuffer strb = new StringBuffer(str); // convert the String in stringBuffer class.

// strb.replace(0, i, "");

// return strb.toString();

//secondway to use....

//         StringBuffer strb = new StringBuffer(str);

//         int i=0; 
//         while(i<strb.length()){
//             if(strb.charAt(i) == '0') {
//                 strb.deleteCharAt(i);
//             }
//             else{
//                 return strb.toString();
//             }
//         }

//         return strb.toString();

//     }
//     public static void main(String[] args){
//         //main method...
//         String str = "000012345690";
//         str= removeZero(str);
//         System.out.println(str);
//     }
// }

// ....................................trim Using Leadinh and triming space.....

// import java.lang.*;

// public class StringMaker{
//     public static String trim(String str){
//         StringBuffer string = new StringBuffer(str);
//         int i=0;
//         while(i<string.length() && string.charAt(i)==' '){
//             string.deleteCharAt(i);

//         }
//         return string.toString();
//     }

//     public static void main(String[] args){
//         String str = "  Hello World  ";
//         System.out.println("Original String is :- "+str);  //Original String..
//         System.out.println(trim(str));  // user-defined method....
//         System.out.println("USing Built Method is:- "+str.trim()); // Built in method...

//         String string = "  Hey There  Joey!!!   ";

//         System.out.println("Original String is:- "+string); // Original String..
//         System.out.println(trim(string)); //User-defined Method..\
//         System.out.println("Using Built Method is:- "+string.trim());
//         System.out.println("Original String is:- "+string); // Original String..Can't changed becuase String are Immutable....

//     }
// }

// ..........................Counting the Word,Sentence,WhiteSpace,Paragraph in File using in java.................
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;

// public class StringMaker{
//     public static void main(String[] args) throws FileNotFoundException,IOException{
//         FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\Software_Engineer\\Desktop\\Shahid.txt");
//         OutputStreamWriter files = new OutputStreamWriter(fileOutput);

//         BufferedWriter bufferedWriter = new BufferedWriter(files);

//         bufferedWriter.write("My Name is Md Shahid Ali and i am a Software Developer\n"+ 
//                               "I have a Completed Diploma Course From Computer Science Engineer.\n"+
//                               "I Want to Job In Google and be a New Ceo of Google.");

//         bufferedWriter.close();

//         FileInputStream fileinput = new FileInputStream("C:\\Users\\Software_Engineer\\Desktop\\Shahid.txt");
//         InputStreamReader input = new InputStreamReader(fileinput); // or you Write :- InputStreamReader input = new InputSteamRead(new FileInputStream(C:\Users\Software_Engineer\Desktop\shahid.txt));
//         BufferedReader bufferedReader = new BufferedReader(input);

//         String line;
//         int countWord=0;
//         int sentenceWord=0;
//         int whiteSpace= 0;
//         int paragraphCount=1;
//         int characterCount=0;

//         while((line=bufferedReader.readLine())!=null){

//             if(line.equals("")){
//                 paragraphCount++;
//             }
//             if(!(line.equals(""))){
//                 characterCount+= line.length();

//                 String[] wordList = line.split("\\s+"); // using space to split...

//                 countWord+= wordList.length;
//                 whiteSpace +=countWord-1; // beause whiteSpace start with 0;

//                 String[] sentenceList = line.split("[.]+"); // for using sentence...

//                 sentenceWord += sentenceList.length;
//             }
//         }

//         System.out.println("Number of Character is:- "+characterCount);
//         System.out.println("Number of Word is:- "+countWord);
//         System.out.println("Number of WhiteSpace is:- "+whiteSpace);
//         System.out.println("Number of Paragraph is:- "+paragraphCount);
//         System.out.println("Number of The Sentence is:- "+sentenceWord);

//         bufferedReader.close();
//         fileinput.close();
//         input.close();

//     }
// }

// .......................................check String if using alphabat in Java Using Lambda Exceptions............

// import java.lang.String;

// public class StringMaker{
//     public static boolean isStringOnlyAlphabat(String str ){
//         return (str!=null && (!str.equals("")) && str.chars().allMatch(Character::isLetter)); // this is lambda Exception...
//     }

//     public static void main(String[] args){
//         System.out.println("Test Case 1");

//         String str1 = "GeekForGeeks";
//         System.out.println("Input:- "+str1);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str1)); // return true ..

//         System.out.println("Test Case 2");
//         String str2 = "Geek4geeks";
//         System.out.println("Input:- "+str2);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str2)); // return false...

//         System.out.println("Test Case 3");
//         String str3 = null;
//         System.out.println("Input:- "+str3);
//         System.out.println("Ouput:- "+isStringOnlyAlphabat(str3)); // return false...

//         System.out.println("Test Case 5");
//         String str4 = "";
//         System.out.println("Input:- "+str4);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str4)); // return false... 
//     }
// }

// ...................remove Element from the List by Given Predicate(in predicate who element is given in Predicate) in java...................

// import java.lang.String;
// import java.util.List;
// import java.util.Objects;
// import java.util.Vector;
// import java.util.function.Predicate;
// import java.util.ArrayList;
// // import java.util.Arrays;
// import java.util.Iterator;

// public class StringMaker {
//     /**
//      * remove null Value using Predicate Interface...
//      * @param <T>
//      * @param l
//      * @param p
//      * @author Md Shahid Ali...
//      * @return
//      */
//     // using Genric Methid in Java.....
//     public static <T> List<T> removeNUllValue(List<T> l, Predicate<T> p) {
//         // Using Perdiacte Iterator Interface...
//         Iterator<T> itr = l.iterator();
//         while (itr.hasNext()) {
//             T t = itr.next(); // copy iterator aelement in Generic Data typer refernce...

//             if (p.test(t)) {
//                 itr.remove(); // chekc if list using null element then remove null values...
//             }
//         }
//         return l;

//     }

//     // main method...

//     public static void main(String[] args) {
//         List<String> l = new ArrayList<String>();
//         l.add("Geeks");
//         l.add(null);
//         l.add("Geeks");
//         l.add("For Geeks");
//         l.add(null);
//         l.add("A Computer Science Portal");

//         List<String> vector = new Vector<String>();
//         vector.add("Geeks");
//         vector.add(null);
//         vector.add("Geeks");
//         vector.add("For Geeks");
//         vector.add(null);
//         vector.add("A Computer Science Portal");

//         System.out.println("Original ArrayList is:- "+l);
//         System.out.println("Vector Original is:- "+vector);

//         Predicate<String> isNum = item -> Objects.nonNull(item);

//         List<String> siml=removeNUllValue(l, isNum);

//         List<String> vectorList = removeNUllValue(vector, isNum);
//         System.out.println("Remove Null Value ArrayList is:- "+siml);
//         System.out.println("Remove Null Value Vector is:- "+vectorList);

//         System.out.println("New Original of ArrayList is:- "+l);
//         System.out.println("New Original of Vector:- "+vector);

//     }
// }

// ..............................Using List.removeAll() method in Perdiacte given ..........

// import java.lang.String;
// import java.util.function.Predicate;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class StringMaker{
//     public static <T> List<T> removeElement(List<T> l, Predicate<T> p){ // using generic method....{
//         //using collection in Predicate in java...

//         Collection<T> collection = new ArrayList<>();
//         //beacuse List.removeAll() method declare in Collection Interface and List is Extend of Collection Interface so,

//         for(T s: l){
//             if(p.test(s)){
//                 //check if string is match for the same string so those string adding in collection refernce variable means arrayList ...
//                 collection.add(s);
//             }
//         }

//         //when all string adding collection ....
//         System.out.println("Whose Element Remove In ArrayList is:- "+collection);

//         //remove add element who insert in ArrayList Object...

//         l.removeAll(collection); // remove all element of collection ...

//         return l;

//     }

//     //main Method...
//     public static void main(String[] args){

//         List<String> list = new ArrayList<>(Arrays.asList("10","20","10","10","30","40","10","50"));

//         System.out.println("Original ArrayList is :- "+list);

//         //create Predicate who element is Delete..

//         Predicate<String> is10 = i->(i=="10");

//         list= removeElement(list, is10);

//         System.out.println("New ArrayList is:- "+list);

//     }
// }

// ..................................Using Lambdas for Predicate ...
// public class StringMaker{
//     public static <T> List<T> removeElement(List<T> l, Predicate<T> p){
//         l=l.stream().filter(p).collect(Collectors.toList());

//         return l;
//     }

//     public static void main(String[] args){
//         List<String> list = new ArrayList<>(Arrays.asList("Geek",null,"ForGeeks",null,"Is A Computer Science Portal"));

//         System.out.println("Original ArrayList is:- "+list);

//         Predicate<String> isNull = i -> (i==null); //or item ->Objects.nonNull(item);

//         list = removeElement(list, isNull);

//         System.out.println("New Update ArrayList is:- "+list);
//     }
// }

// ........................................USing removeif() methof for predicate.
// public class StringMaker{
//     public static <PlaceHolder> List<PlaceHolder> removeElement(List<PlaceHolder> l , Predicate<PlaceHolder> p){
//         l.removeIf(x ->p.test(x));

//         return l;
//     }

//     public static void main(String[] args){
//         List<String> list = new ArrayList<>(Arrays.asList("10","20","30","10","40"));

//         System.out.println("New ArrayList is:- "+list);

//         Predicate<String> is10 = item ->(item=="10");

//         list = removeElement(list, is10);

//         System.out.println("New ArrayList is:- "+list);
//     }
// }

// .............................Check if String contain using Ascii Value in Java................
// import java.lang.String;

// public class StringMaker{
//     public static boolean isStringOnlyAlphabat(String str){
//         if(str==null || str.equals("")){
//             return false;
//         }
//         else{
//             for(int i=0; i<str.length(); i++){
//                 char ch = str.charAt(i); 
//                 if((!(ch >='A' && ch<='Z')) && (!(ch>='a' && ch<='z')) ){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args){
//         System.out.println("Test Case 1");
//         String str1 = "GeekforGeeks";
//         System.out.println("Input:- "+str1);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str1)); // return true..

//         System.out.println("Test Case 2..");
//         String str2 = "Geeks4Geeks";
//         System.out.println("Input:- "+str2);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str2)); // return false...

//         System.out.println("Test Case 3..");
//         String str3 = null;

//         System.out.println("Input:- "+str3);
//         System.out.println("Output:- "+isStringOnlyAlphabat(str3)); // return False..

//         System.out.println("Test Case 4..");
//         String str4 = "";
//         System.out.println("Input:- "+str4);
//         System.out.println("Ouput:- "+isStringOnlyAlphabat(str4)); // return false....
//     }
// }

// .....................................Check if String Contains alphabat using Regex......

// import java.lang.String;
// import java.util.regex.*;
// import java.lang.Character;

// public class StringMaker{
//     public static boolean isStringOnlyAplhabat(String str){
//         return ((str!=null)&& (!str.equals("")) && str.matches("^[a-zA-Z]*$"));  // using mathod of regx...

//         // return ((str!=null) && (!str.equals("")) && str.chars().allMatch(Character::isLetter)) ; // for lambad exception chekc string ..
//     }

//     public static void main(String[] args){
//         System.out.println("Test Case 1");
//         String str1 = "GeeksForGeesks";
//         System.out.println("Input:- "+str1);
//         System.out.println("Output:- "+isStringOnlyAplhabat(str1));

//         System.out.println("Test Case 2..");
//         String str2 = null;
//         System.out.println("Input:- "+str2);
//         System.out.println("Output:-"+isStringOnlyAplhabat(str2) );
//     }

// }

// ..........................Check if String Contain Only WhiteSpace in String in java.................
// public class StringMaker{
//     /**
//      * 
//      * @param str
//      * @return
//      */
//     public static boolean checkWhiteSpace(String str){
//         if( str !=null &&str.trim().isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }

//     }

//     public static void main(String[] args){
//         String str = "          ";
//         System.out.println("Input:- "+str);
//         System.out.println("Output:- "+checkWhiteSpace(str));

//         String str2 = "Geek";
//         System.out.println("Input:- "+str2);
//         System.out.println("Output:- "+checkWhiteSpace(str2));
//     }
// }

// ................................Check if String is A Empty or NOt in jAva......................
// public class StringMaker{
//     public static boolean checkEmpty(String str){
//         if(str.isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args){
//         String str = "Shahid";
//         String str2 = "";
//         System.out.println(str+" is Empty :- "+checkEmpty(str));
//         System.out.println(str2+" is Empty :- "+checkEmpty(str2));
//     }
// }

// ...................................How To Convert Array to String in java..............
// import java.lang.String;
// import java.util.Arrays;

// public class StringMaker{
//     public static void main(String[] args){
//         boolean[] boolArr = new boolean[] {true, true, false, false};
//         char[] charArr = new char[] {'g','e','e','k','s'};
//         double[] doubleArr = new double[] {1,2,3,4};
//         int[] intArr = new int[] {1,2,3,4,5};
//         Object[] objectsArr = new Object[] {1,2,3,4,5};

//         System.out.println("Boolean Array is:- "+Arrays.toString(boolArr));
//         System.out.println("Character Array is:- "+Arrays.toString(charArr));
//         System.out.println("Double Arrays is:- "+Arrays.toString(doubleArr));
//         System.out.println("Integer Arrays is:- "+Arrays.toString(intArr));
//         System.out.println("Object Array is:- "+Arrays.toString(objectsArr));

//        /**
//         * USing StringBuilder of The String in java.... here StringBuffer are Use for Convert Array To String becuase 
//         *StringBuffer and StringBuilder is a String Class Who is Implement in java.lang Packages...
//         */
//         StringBuilder strb = new StringBuilder("We are Geeks for");
//         System.out.println(strb);

//         strb.append(charArr);
//         System.out.println("Result After Appending the character is:- "+strb);

//         strb = new StringBuilder("We Are Learn Form ");

//         charArr = new char[] {'g','e','e','k','s'};

//         System.out.println(strb);
//         strb.append(charArr);
//         System.out.println("Result After Appending the Character is:- "+strb);

//     }
// }

// ......................................How to determine of string length in java......
// import java.lang.String;

// public class StringMaker{
//     public static void main(String[] args){
//         String str = "ShahidAli";
//         String string = new String("is a Competative Programmer..");
//         String[] stringArray = new String[] {"And He a Googler","And He Become a Software Engineer"};

//         System.out.println("Length of String is:- "+str.length());
//         System.out.println("Length of The String Object isa:- "+string.length());
//         System.out.println("Length of The String Array is:- "+stringArray.length);
//     }
// }

// ...........................Convert A String into Character in java......

// public class StringMaker{
//     /**
//      * @param args
//      */
//     public static void main(String[] args){
//         /**
//          * first Methofd using Navione Method...
//          */
//         String str = "SoftwareEngineer";

//         char[] ch = new char[str.length()];

//         for(int i=0; i<str.length(); i++){
//             ch[i] = str.charAt(i);
//         }

//         for(char c: ch){
//             System.out.println(c);
//         }

//         /**
//          * second Method using String.toCharArray() Method...
//          */
//         System.out.println("\n\n\t Using String.toCharArray() Method of String..");
//          char[] charArray = str.toCharArray();

//          for(char s : charArray){
//             System.out.println(s);
//             System.out.println((int)s);
//          }
//     }
// }

// ..............................Count Occurence of a given Character using regex in String in java.............
// import java.util.regex.*;

// public class StringMaker{
// public static int checkCharacter(String str, char ch){
//     /**
//      * for using the simple method to find the character in string.....
//      */
//     int count=0;
//     for(int i=0; i<str.length(); i++){
//         if(str.charAt(i)==ch){
//             count++;
//         }
//     }
//     return count;
// }

// public static long count(String str, char ch){
//     Matcher matcher = Pattern.compile(String.valueOf(ch)) .matcher(str);
//     int res=0;
//     while(matcher.find()){
//         res++;
//     }
//     return res;
// }
// public static void main(String[] args){
// String str ="Softwareengineer"; // i wan to count e how many use e character in string ...
// char ch ='e'; //for target count the  how many e charcater are present in string...
// System.out.println(ch+" are Present in String for :- "+checkCharacter(str, ch)+" Times...");

/**
* for using to cinvert the character inot string....
*/

// int copuntstring=0;
//  System.out.println("For Convert The String into Charcater Array and check the Target Character in java...");
//     char[] charArray = str.toCharArray(); // convert The string into String...

//     // for(char c: charArray){
//     //     if(c==ch){
//     //         copuntstring++;
//     //     }
//     // }
//             //OR

//     for(int i=0; i<charArray.length; i++){
//         if(charArray[i]==ch){
//             copuntstring++;
//         }
//     }
//     System.out.println(ch+" are Present in string for "+copuntstring+" Times..");

/**
 * Using regex in string ....
 */
//         String str ="geeksforgeeks";
//         char c ='e';
//         System.out.println(count(str, c));

//     }

// }

// ..............................Check if contain same two string then ingore them in string in java......
// import java.lang.String;
// import java.util.*;

// public class StringMaker{
// public static boolean checkSameString(String str1, String str2){
//     int len1 = str1.length();
//     int len2 = str2.length();
//     int i=0;

//     int min = Math.min(len1, len2); // generate a Low Length ofString....
//     if(len1!=len2){
//         return false;
//     }
//     while(i<min){
//         if(str1.charAt(i)==str2.charAt(i)){
//             //increment of i for next Character...
//             i++;
//         }
//         else if(!((str1.charAt(i)>='a' && str1.charAt(i)<='z') || (str1.charAt(i)>='A' && str1.charAt(i)<'Z'))){
//             return false;
//         }
//         else if(!((str2.charAt(i)>='a' && str2.charAt(i)<='z') || (str2.charAt(i)>='A' && str2.charAt(i)<='Z'))){
//             return false;
//         }
//         else{
//             if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
//                 if(str1.charAt(i)-32 !=str2.charAt(i)){
//                     return false;
//                 }
//             }
//             else if(str2.charAt(i)>='A' && str2.charAt(i)<='Z'){
//                 if(str2.charAt(i) +32 !=str1.charAt(i)){
//                     return false;
//                 }
//             }
//             i++;
//         }

//     }
//     return true;

// }

// public static void checkSameStringUtil(String str1, String str2){
//     boolean res = checkSameString(str1, str2);
//     if(res==true){
//          System.out.println("Same");
//     }
//     else{
//         System.out.println("Not Same..");
//     }
// }

// public static void main(String[] args){
//     String str = "Geeks";
//     String str2 = "geeks";
//     checkSameStringUtil(str, str2);

//     str = "Geeks";
//     str2 = "geeksforgeeks";
//     checkSameStringUtil(str, str2);

// }

/**
 * Using String.toUpperCase()Method ...
 */
//     public static void equalIgnoreCase(String str1, String str2){
//         str1 = str1.toUpperCase(); // convert string to Upper Case ...
//         str2 = str2.toUpperCase(); // conver The String to Upper Case....

//         //Here Use Three Method to use ...
//         //First Methid...
//         boolean res = str1.equals(str2); 
//         if(res==true){
//             System.out.println("Same");
//         }
//         else{
//             System.out.println("Not Same");
//         }

//         //second Method...

//         int x = str1.compareTo(str2);
//         if(x!=0){
//             System.out.println(" Not Same");
//         }
//         else{
//             System.out.println("Same");
//         }

//     }
//     public static void main(String[] args){
//         String str1 = "Geeks";
//         String str2 = "geeks";

//         equalIgnoreCase(str1, str2);

//         str1 = "geeks";
//         str2 = "geeksforgeeks";

//         equalIgnoreCase(str1, str2);
//     }

// }

// ............................. Move All Character to end of the String in java............
// public class StringMaker{
// /**
//  * USing Without Regular Expression...
//  * @param str
//  * @return
//  */
// public static String move(String str){
//     String low="";
//     String upp ="";
//     char ch;
//     for(int i=0; i<str.length(); i++){
//         ch=str.charAt(i);
//         if(ch>='A' && ch<='Z'){
//             upp+= ch;

//         }
//         else{
//             low+=ch;
//         }
//     }
//     return low+upp;
// }

// public static void main(String[] args){
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter The Element :-");
//     String str = scan.nextLine();
//     System.out.println("Length of String is:- "+str.length());
//     System.out.println("BEfore Operation:- "+str);
//     System.out.println("After Operation:- "+move(str));
//     scan.close();
// }

/**
 * Using Regular Expression (regex...)
 */
//     public static String move(String str){
//         return str.replaceAll("[A-Z]+", "")+ str.replaceAll("[^A-Z]+", "");
//     }
//     public static void main(String[] args){
//         System.out.println("\n\t\tUSing Regular Expression to M0ve all Upper Case to End of the String.....\n");
//         String str = "GeeksForGeeks Is A Computer Science Portal";
//         System.out.println("Before Opearation:- "+str);
//         System.out.println("After Opeartion:- "+move(str));
//     }

// }

// ...................................S.Move All Special Character to End of the String USing Regex Expression.........

// public class StringMaker{
//     public static String useRegex(String str){
/**
 * first Create Own Metod...
 */
// String first=" ", second=" ";
// char ch ;
// for(int i=0; i<str.length(); i++){
//     ch = str.charAt(i);
//     if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
//         first+= ch ; // store the character of the string...
//     }
//     else{
//         second+=ch ; //store whose element doesn't match of the AStering character...
//     }
// }
// return first+second;

/**
 * use of regerx Expression...
 */
//         String reg = "[a-zA-Z0-9\\s+]";
//         String first=" ", last=" ";
//         char sh;
//         for(int i=0; i<str.length(); i++){
//             sh = str.charAt(i);
//             if(String.valueOf(sh).matches(reg)){
//                 first =first+sh;
//             }
//             else{
//                 last =last+sh;
//             }
//         }
//         return first+last;
//     }

//     public static void main(String[] args){
//         String str = "My% N%a@me i$$s M@@@@##d Shah%%%%id Al******i"; 
//         System.out.println("Before String is :- "+str);
//         System.out.println("After String is :- "+useRegex(str));
//     }
// }

// ........................................String Insert Into Another String in Java...............
// public class StringMaker{
//     public static String inserString(String originalString, String stringToBeInserString, int index){
/**
 * first ceate a Own without Pref-defined function..
 */

//  String str =new String(); // create a new String for insert the new String ...

//  for(int i=0; i<originalString.length(); i++){

//      if(i==index){
//          str+=stringToBeInserString; // which index want to insert other string...
//      }
//      else{
//         str+= originalString.charAt(i); // insert the character of the orginal String into new String...
//      }
//  }
//  return str;

/**
 * Using String.subString() Method..
 */

//  String newString = originalString.substring(0,index)+stringToBeInserString+originalString.substring(index);
//  return newString;

/**
 * using StringBuffer.insert() Method...
 */

//          StringBuffer newString = new StringBuffer(originalString);

//          newString.insert(4, stringToBeInserString);

//          return newString.toString();
//     }

//     //main Method..
//     public static void main(String[] args){
//         String string = "SoftEngineer";
//         String stringInsert = "ware";
//         int index = 4;
//         System.out.println("Original String is:- "+string);
//         System.out.println("String to Be insert is :- "+stringInsert);
//         System.out.println("String to Be insert at Index:- "+index);
//         System.out.println("Modified String is:- "+inserString(string,stringInsert, index));
//     }
// }

// ...............................generate A Random String using to Give Size in java..
// import java.lang.Math;
// import java.lang.String;
// import java.lang.StringBuilder;
// import java.nio.charset.*;

// public class StringMaker{
//     public static String randomStringGenerate(int n ){
/**
 * USing Math.random() Method.....
 */
// String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
// StringBuilder strb = new StringBuilder(n); 
// for(int i=0; i<n; i++){
//     int index = (int)(str.length()*Math.random());
//     strb.append(str.charAt(index));
// }
// return strb.toString();

/**
 * Using Charset (java.nio.Charset)...
 */
// byte[] array = new byte[256]; // create a 256 Character ...
// new Random().nextBytes(array);

// String randomString = new String(array,Charset.forName("UTF-8"));

// StringBuffer stringbuffer = new StringBuffer();
// for(int i=0; i<randomString.length(); i++){
//     char ch = randomString.charAt(i);
//     if(((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ||(ch>='0' && ch<='9')) && (n>0)){
//         stringbuffer.append(ch);
//         n--;
//     }
// }
// System.out.println("Length of Random String is:- "+stringbuffer.length());

// return stringbuffer.toString();

/**
 * Using Regular Expression....
 */

//               byte[] array = new byte[256];
//               new Random().nextBytes(array);
//               String randomString = new String(array, Charset.forName("UTF-8"));
//               StringBuffer stringbuffer = new StringBuffer();
//               String alphabatString = randomString.replaceAll("[^A-Za-z0-9]", " ");
//               for(int i=0; i<alphabatString.length(); i++){
//                   if(Character.isLetterOrDigit(alphabatString.charAt(i)) && (n>0)){
//                       stringbuffer.append(alphabatString.charAt(i));
//                       n--;
//                   }
//               }
//               return stringbuffer.toString();
//     }
//     public static void main(String[] args){
//         int number = 20;
//         System.out.println(StringMaker.randomStringGenerate(number));
//     }
// }

// ..............................generate A Random Integer in Java...........

// import java.util.concurrent.ThreadLocalRandom;
// public class StringMaker{
//     public static long getAlphabatString(long Min, Long Max) {
//         return ThreadLocalRandom.current().nextLong(Min, Max+1);
//     }
//     public static void main(String[] args){
//         long min= 1000, max=100000;
//         System.out.println("ThreadLocalRandom "+min+" And "+max+" is :- "+getAlphabatString(min, max));
//     }
// }

// ............................ convert a List of String to comma Seperated string in java......
// import java.lang.String;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class StringMaker{
//     public static void main(String[] args){
//         List<String> list = new ArrayList<>(Arrays.asList("Geek","ForGeeks","GeeksForGeeks"));
//         System.out.println("List of String is:- "+list);
//         System.out.println("Length of String is:- "+list.size());
//         String string = String.join(",", list);
//         System.out.println("String of String is:- "+string);
//         System.out.println("Length of String is :- "+string.length()); 

//     }
// }

// ...............................Convert An ArrayList of String into String Array in java........
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class StringMaker{
//     public static String[] getStringArray(ArrayList<String> arr){
//         String[] str = new String[arr.size()];

//         for(int i=0; i<arr.size(); i++){
//             str[i] = arr.get(i);
//         }

//         return str;
//     }

//     public static String[] getString(ArrayList<String> list){
//         String[] str = new String[list.size()];
//         int i=0;
//         Object[] objects = list.toArray();
//         for(Object c: objects){
//             str[i] = (String)c;
//             i++;
//         }
//         return str;
//     }
//     public static String[] getStringArrayStrings(ArrayList<String> str){
//         Object[] oiObjects = str.toArray();
//         String[] string = Arrays.copyOf(oiObjects, oiObjects.length, String[].class);

//         return string;
//     }

//     public static String randomString(int n){
//         String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//         StringBuilder strb = new StringBuilder(n);
//         for(int i=0; i<n; i++){
//             int index =(int)(str.length()*Math.random());

//             strb.append(str.charAt(index));
//         }
//         return strb.toString();
//     }

//     public static String getrandomString(int n){
//         //USing Charset (java.nio.Charset)..
//         byte[] bytes = new byte[256];
//         new Random().nextBytes(bytes);

//         String str = new String(bytes, Charset.forName("UTF-8"));
//         StringBuffer stringBuffer = new StringBuffer(n);

//         for(int i=0; i <str.length(); i++){
//             if(((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')) && (n>0) ){
//                 stringBuffer.append(str.charAt(i));
//                 n--;
//             }
//         }
//         return stringBuffer.toString();
//     }

//     public static String findGetRandomString(int n){
//         byte[] arary = new byte[256];
//         new Random().nextBytes(arary);
//         String str = new String(arary, Charset.forName("UTF-8"));
//         StringBuffer stringBuffer = new StringBuffer(n);

//         String string = str.replaceAll("[^a-zA-Z0-9]", " ");

//         for(int i=0; i<string.length(); i++){
//             if(Character.isLetter(string.charAt(i)) && (n>0)){
//                 stringBuffer.append(string.charAt(i));
//                 n--;
//             }
//         }
//         return stringBuffer.toString();
//     }

//     public static void main(String[] args){
//         ArrayList<String> list = new ArrayList<>(Arrays.asList("Geeks","For","Geeks"));
//         System.out.println("ArrayList is:- "+list);
//         System.out.println("Arrays.ToString is:- "+list.toString());
//         String[] stringArrays = getStringArray(list);
//         System.out.println("String Array is:- "+Arrays.toString(stringArrays));

//         /**
//          * Using Object Arrays Immediates...
//          */
//         ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Geeks","For","Geeks"));
//         System.out.println("ArrayList is:- "+list2);

//         String[] arrayString = getString(list2);
//         System.out.println("String Array is:- "+Arrays.toString(arrayString));

//         /**
//          * Using Arrays.copyOf(String str, String.length(), String.class)
//          */
//         System.out.println("\n\t\tUsing Arrays.copyOf() Method in String....\n");
//         ArrayList<String> ai = new ArrayList<String>();
//         ai.add("Shahid");
//         ai.add("Ali");
//         ai.add("With ????");

//         System.out.println("Original Array Length is:- "+ai);
//         System.out.println("Length of Original ArrayList is:- "+ai.size());

//         String[] string = getStringArrayStrings(ai);
//         System.out.println("String Arrays is:- "+Arrays.toString(string));
//         System.out.println("String Arrays Length is:- "+Arrays.toString(string).length());
//         System.out.println("\n\tUsing Random String generate for CharSet in String...\n");
//         int number =10;
//         System.out.println(findGetRandomString(number));

//     }

// }

// ........................Replace a Chracater of String USing index of Java.......................

// public class StringMaker{
//     public static void main(String[] args){
//         /**
//          * Using String.substring in method...
//          */

//          String str = "ShahidAliGoole"; // Here i Forget g for index 14 ...
//          int index = 12;
//          char ch= 'g';

//          System.out.println("Original String is:- "+str);
//          str= str.substring(0, index)+ch+str.substring(index);
//          System.out.println("Modified String is:- "+str);

//         /**
//          * Using StringBuilder.setCharAt(int index); ..../// return a String...
//         */
//         String str2 = "Welsome to My  Engineer World";
//         StringBuilder string = new StringBuilder(str2);
//         int index1 = 4;
//         char ch1 ='c';
//         System.out.println("New String is :- "+string);
//         string.setCharAt(index1, ch1);

//         System.out.println("Modified StringBuilder is :- "+string);

//     }
// }

// .........................Convert String into Comma Seperated in List in java................
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class StringMaker{
//     public static void main(String[] args){
//         String str = "Geeks For Geeks";

//         /**
//          * First Create a UnModified List...
//          */
//         System.out.println("String is :- "+str);
//         String[] element = str.split(" ");

//         List<String> list = Arrays.asList(element);
//         System.out.println("Comma Seperated List is :- "+list);

//         /**
//          * Create a Modified List..
//          */
//         List<String> listArray = new ArrayList<String>(Arrays.asList(element));

//         System.out.println("Using Comma Seperated List is:- "+listArray);

//     }
// }

// ..........................Convert a Set of String into Comma Seperated in String in Java............
// import java.util.Set;
// import java.util.Arrays;
// import java.util.HashSet;

// public class StringMaker{

//     public static String[] convertStrungArray(Set<String> set){
//         /**
//          * first USing simple method...
//          */
//         String[] string = new String[set.size()];
//         int i=0;

//         for(Object c: set){
//             string[i++] = (String)c; // convert set of element in string array...
//         }

//         return string;

//     }

//     public static String[] convertStringArray(Set<String> sets){
//         String[] stringArrays = new String[sets.size()];

//         Object[] objetcs = sets.toArray();
//         int i=0;
//         for(Object c: objetcs){
//             stringArrays[i] = (String)c;
//             i++;
//         }
//         return stringArrays;
//     }

//     public static String[] convertStrings(Set<String> s){
//         Object[] objects = s.toArray();

//         String[] string = Arrays.copyOf(objects, objects.length, String[].class);

//         return string;
//     }
//     public static void main(String[] args){
//         Set<String> set = new HashSet<String>(Arrays.asList("Geeks","ForGeeks","A Computer Science Portal"));

//         System.out.println("Set Of String is :- "+set);
//         System.out.println("Set Of String Length  is :- "+set.size());

//         String string = String.join(",", set);
//         System.out.println("Original String is :- "+string);
//         System.out.println("Length of the String is:- "+string.length());
//         System.out.println(string.toString());

//         System.out.println("\n\n\tUSing Convert Set of string into String Array in java..................\n\n");

//         String[] stringArrays= convertStrungArray(set);
//         System.out.println("Convert set Of String into String arrays:- "+Arrays.toString(stringArrays));
//         System.out.println("Convert set Of String into String arrays:- "+Arrays.toString(stringArrays).length());

//         System.out.println("\n\n\t Using Convert String into Array String For Second Method Object[] ...\n");
//         String[] strinObjetcs = convertStringArray(set);
//         System.out.println("Convert Set of String into String Arrays :- "+Arrays.toString(strinObjetcs));
//         System.out.println("Convert Set of String into String Arrays :- "+Arrays.toString(strinObjetcs).length());

//         System.out.println("\n\n\t Using Convert Set of String into String Arrays for Third String ...\n");
//         String[] simpleString = convertStrings(set);
//         System.out.println("Convert Set of String into String Arrays :- "+Arrays.toString(simpleString));
//         System.out.println("Convert Set of String into String Arrays :- "+Arrays.toString(simpleString).length());

//         Iterator it = set.iterator();
//         while(it.hasNext()){
//             String string2 = (String)it.next();
//             System.out.println(string2);
//             it.remove();
//         }

//     }
// }
// .............................Remove a Non-Alphabatic Character of String in java............
// import java.lang.String;
// import java.util.regex.*;

// public class StringMaker{
//     public static String removeNonAplhabat(String str){
//         String regex = "[a-zA-z]";
//         String string=" ";
//         String lString=" ";
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             // if(String.valueOf(ch).matches(regex)){ 
//             if(Character.isLetter(ch)){
//                 string += ch;
//             }
//             else{
//                 lString += ch;
//             }
//         }
//         return string;

//     }

//     public static void main(String[] args){
//         String str = "My%Na@@@me is &&&& Md****S&&&&&hahaid%%%% ***A@@@L%%%I*****";
//         System.out.println("Original String is:- "+str);
//         System.out.println("Original String is:- "+str.length());
//         System.out.println("Remove Non Alphabatic Character String is:- "+removeNonAplhabat(str));
//         System.out.println("Length of the String is :- "+removeNonAplhabat(str).length());
//     }
// }

// .............................Remove a extra Delimeter in String in java...........
// public class StringMaker{
//     public static void main(String[] args){
//         String str =" Geek,For,Geeks,";
//         char delimiter =','; 

//         System.out.println("Original String is:- "+str);

//         int index = str.lastIndexOf(delimiter); // generate a last index of the string....

//         str = str.substring(0, index)+str.substring(index+1); 

//         System.out.println("Remove A Extra Delimiter is:- "+str);
//     }
// }

// ....................................Convert String into Double in java.............
// import java.lang.Double;

// public class StringMaker{

//     public static Double getMEthod(String str){
//         return Double.valueOf(str);
//     }

//     public static Double getMethodDouble(String str){
//         Double objDouble = new Double(str);

//         return objDouble;

//     }
//     public static void main(String[] args){
//         /**
//          * Using Double.paseDouble in String...
//          */
//         String str ="222.01244";
//         System.out.println("String is :- "+str);
//         double doub = Double.parseDouble(str);
//         System.out.println("String Convert Into Double :- "+doub);

//         /**
//          * Using Double.ValueOf(String str) Method...
//          */
//         System.out.println("\n\n\t Using String convert To Double By USing Double.valueOf(String str) Methid...\n");
//         System.out.println("Value of Double is :- "+getMEthod(str));

//         /**
//          * USing String Convert To Double By Double Object...
//          */
//         System.out.println("\n\n\t Using String convert To Double By Double Object...\n");
//         System.out.println("\nString Convert Double is:- "+getMethodDouble(str));

//     }
// }

// ...........................Convert Set of String into String Array in Java ..............
// import java.util.Arrays;
// import java.util.Set;
// import java.util.HashSet;

// public class StringMaker{
//     public static  String[] convert(Set<String> setOfString){
//         /**
//          * First USing Native Method...
//          */

//          String[] arrayOfStrings = new String[setOfString.size()];

//          int index =0;
//          for(String  c: setOfString){
//              arrayOfStrings[index] = c;
//              index++;
//          }

//          return arrayOfStrings;

//     }

//     public static String[] convertSecondMethod(Set<String> setOfString){
//         /**
//          * Second Method Using Set.toArray() Method...
//          */
//         String[] arrayOfStrings = setOfString.toArray(new String[0]); // convert The Set of String into String Array By Passing 0..
//         return arrayOfStrings;
//     }

//     public static String[] convertThirdStrings(Set<String> setOfString){
//         /**
//          * Third Methid USing Arrays.copyOf() Method...
//          */

//          String[] arrayOfString = Arrays.copyOf(setOfString.toArray(), setOfString.size(),String[].class);
//          return arrayOfString;
//     }

//     public static String[]  convertForthMethod(Set<String> setOfString){
//         /**
//          * Fourth Method USing System.arraycopy() Method...
//          */
//         String[] arrayOfString = new String[setOfString.size()];
//         System.arraycopy(setOfString.toArray(),0,arrayOfString, 0,setOfString.size());
//         return arrayOfString;
//     }

//     public static String[] convertFifthMethod(Set<String> setOfString){
//         /**
//          * Fifith Method USing java 8 Stream Method...
//          */
//         String[] arrayOfString = setOfString.stream().toArray(String[]::new); // convert set of String into Strem then Convert Array of String...
//         return arrayOfString;

//     }

//     public static void main(String[] args){
//         Set<String> setOfString = new HashSet<String>(Arrays.asList("Geeks","For Geeks", "A Computer Science Portal"));
//         System.out.println("Set Of String:- "+setOfString); // print the Set of String/////
//         String[] arrayOfString = convert(setOfString); // using first Method...
//         String[] arrayStrings2 = convertSecondMethod(setOfString); // Using Second Method...
//         String[] arrayStrings3 = convertThirdStrings(setOfString) ; // Using Third Method...
//         String[] arrayStrings4 = convertForthMethod(setOfString); // Using Fourth Method...
//         String[] arrayOfStrings5 = convertFifthMethod(setOfString); // Using Fifth Method...

//         System.out.println("Using First Method Array of String is :- "+Arrays.toString(arrayOfString));
//         System.out.println("Using Second Method Array of String is:- "+Arrays.toString(arrayStrings2));
//         System.out.println("Using Third Method Array of String is:- "+Arrays.toString(arrayStrings3));
//         System.out.println("Using Fourth Method Array Of String is:- "+Arrays.toString(arrayStrings4));
//         System.out.println("Using Fifth Methid Array Of String is :- "+Arrays.toString(arrayOfStrings5));
//     }
// }

// .......................Convert A String into a List Of Character in jav.......
// import java.util.*;
// import java.util.stream.*;

// public class StringMaker{
//     public static List<Character> convertToString(String str){
/**
 * USing First Method of String.toCharArray() Method...
 */
// List<Character> listCharacters = new ArrayList<Character>();

// for(char c: str.toCharArray()){
//     listCharacters.add(c); // append the Character of the Streing...
// }

// return listCharacters;

/**
 * Using Second Method of String Java.stream ...
 */

//  List<Character> list = str.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
//  return list;

/**
 * Using Third Method (AbstactList Interface)...
 */
//     return new AbstractList<Character>(){

// 		@Override
// 		public Character get(int index) {
// 			// TODO Auto-generated method stub
// 			return str.charAt(index);// return a Cjharacter of the String in List Cof Character...
// 		}

// 		@Override
// 		public int size() {
// 			// TODO Auto-generated method stub
// 			return str.length(); // return the String of the Length ...
// 		}

//     };
// }

//     public static void main(String[] args){
//         System.out.println("\n\tUsing String convert into List of Character Using String.toCharArray() Method..\n");
//         String str = "Shahid";
//         List<Character> chars = convertToString(str);
//         System.out.println("List of Character is:- "+chars);
//         System.out.println("List of Character to String is convert  is:- "+chars.toString());

//     }
// }

// .............................................How to get a Character from String in java...........

public class StringMaker{
    public static char getCharFromString(String str, int index){
        /**
         * Using First Method ... String.charAt() Method.....
         */
        return str.charAt(index); // return the Charcater of String who pass the index postion...
    }

    public static char getCharFromString2(String str, int index){
        /**
         * Using Second Method of String.toCharArray() Method...
         */
        return str.toCharArray()[index];
    }

    public static char getCharFromString3(String str, int index){
        /**
         * Third Method is Java 8 Stream                                                  
         */
        return str.chars().mapToObj(c ->(char)c).toArray(Character[]::new )[index];
    }

    public static char getCharFromString4(String str, int index){
        /**
         * Using Fourth Method  String.codePointAt() Method..
         */

         return (char)str.codePointAt(index);
    }

    public static char getCharFromString5(String str, int index){
        char[] charArray = new char[1];

        str.getChars(index, index+1, charArray, 0);

        return charArray[0];
    }

    public static void main(String[] args){
        System.out.println("\n\n\t Using First Method..\n");
        String str ="Shahid";
        int index = 3;
        char charFirst = getCharFromString(str, index);
        System.out.println("Character from "+str+"At Index "+index +" is:- "+charFirst);

        System.out.println("\n\n\tUsing Second Method...\n");
        char charSecond = getCharFromString2(str, index);
        System.out.println("Character from "+str+"At Index "+index +" is:- "+charSecond);

        System.out.println("\n\n\t Third Method...\n");
        char charThird = getCharFromString3(str, index);
        System.out.println("Character from "+str+"At Index "+index +" is:- "+charThird);
        System.out.println("\n\n\tUsing Fourth Method .,.....\n");
        char charFourth = getCharFromString4(str, index);
        System.out.println("Character from "+str+"At Index "+index +" is:- "+charFourth);
        System.out.println("\n\n\tUsing Fifth Method ..\n");
        char charFifth = getCharFromString5(str, index);
        System.out.println("Character from "+str+"At Index "+index +" is:- "+charFifth);
        
    }
}


// ............................remove a Word from String in Java............



