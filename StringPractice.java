import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Predicate;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * first Convert Integer to String using 5 ways...
 */

public class StringPractice{
    public static void main(String[] args){
        /**
         * StringBuilder in java............
         */
        String string = "Software";

        StringBuilder stringbuilder = new StringBuilder(string);
        System.out.println("default Capacity of StringBuilder is:- "+stringbuilder.capacity());
        //append in the String in StringBukilder...
        stringbuilder.append("Engineer"); // append the String at last of the Software...
        System.out.println("StringBuilder is:- "+stringbuilder);
        stringbuilder.appendCodePoint(115);
        System.out.println("New StringBuilder is :- "+stringbuilder);
        for(int i=0; i<stringbuilder.length(); i++){
            System.out.println("Position of "+stringbuilder.charAt(i)+" is:- "+stringbuilder.codePointAt(i));
        }

        System.out.println("Length of StringBuilder is :- "+stringbuilder.length());
        System.out.println("Capacity of StringBuilder is:- "+stringbuilder.capacity());
        System.out.println("Reverse of StringBuilder is :- "+stringbuilder.reverse());


        /**
         * StringTokenizer Class in String in java.
         */

        //in StringTokenizer we are create a token into String into token using delimeter....
        String stringfoString = "Shahid is a good boy";
        StringTokenizer stringTokenizer = new StringTokenizer(stringfoString , " ");

        
        while(stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }

        /**
         * StringJoiner class in java...
         */
        //. join of the two string using add() ..

        StringJoiner stringjoiner = new StringJoiner(",");
        stringjoiner.setEmptyValue("StringJoiner Are Empty..");
        System.out.println("Before Adding StringJoiner is:- "+stringjoiner);

        stringjoiner.add(stringfoString).add(string);

        System.out.println("Adding of Two String in StringJoiner is:- "+stringjoiner);
        System.out.println("Length of The StringJoiner is :- "+stringjoiner.length());
        



        /**
         * Convert Intger to String ....
         * first Convert Using Integer.toString()...
         */
        int a = 20000;
        System.out.println("Value of Integer is:- "+a);
        String str = Integer.toString(a);
        System.out.println("Value of String is :- "+str);



        /**
         * second using String.valueof(int index)...
         */

         String str2 = String.valueOf(a);
         System.out.println("Value of String2 is:- "+str2);


        /**
        * third using decimalFormat...
        */

          DecimalFormat dicimal = new DecimalFormat("##,###");

          String str3 = dicimal.format(a); // convert integer into String using decimal Format...

          System.out.println("Decimal Format String is :-  "+str3);

        /**
        * fourth USing StringBuffered.........
         */

         StringBuffer strbuffer = new StringBuffer().append(a);
         

         System.out.println("String Convert StringBuffer is:- "+strbuffer.toString());


         /**
          * sixth using StringBuilder .........
          */
          StringBuilder strbuilder = new StringBuilder().append(a);

          System.out.println("String Convert StringBuilder is:- "+strbuilder.toString());

          /**
           * Using Binary format,Octal and Hexadeciaml Format...
           */

           String str5 = Integer.toBinaryString(a);

           String str6 = Integer.toOctalString(a);

           String str7 = Integer.toHexString(a);

           System.out.println("Integer Convert Intop Binary String :- "+str5);
           System.out.println("Integer Convert into Octal String:- "+str6);
           System.out.println("Integer Convert Into HexDeciamal String:- "+str7);


           System.out.println("\n\t\t.........................Convert String to Integer ............................\n\n");

           int integer = Integer.parseInt(str);
           System.out.println("Convert String into Integer is:- "+integer);
           

           int ints = Integer.parseInt(str, 6); 
           System.out.println("Now Pass A Radix so Integer is :- "+ints);

           int integer2 = Integer.valueOf(str); // convert string into integer...
           System.out.println("Now 2nd Way to Convert String into Integer is:- "+integer2);


           System.out.println("\n\t\t...............................Search Index,character and substring in string........................\n\n");
           String newString = "GeekforGeeks";

           System.out.println("Original String is:- "+newString);

           for(int i=0; i<newString.length(); i++){
               System.out.println("Index of "+newString.charAt(i)+" is:- "+newString.indexOf(newString.charAt(i)));
           }

           System.out.println("Substring of the NewString is :- "+newString.substring(0, 4));
           System.err.println("String Contains Geek is:- "+newString.contains("Geek"));
           System.out.println("String start with Geek :- "+newString.startsWith("Geek"));

           System.out.println("String Ends With Geeks:- "+newString.endsWith("Geeks"));



           System.out.println("\n\t\t......................Swap two String without any Third Variable...........................\n\n");
           String fString ="GeekForGeeks";
           String lString= "Software-Engineer";

           fString = fString+lString;

           lString = fString.substring(0, fString.length()-lString.length());

           fString = fString.substring(lString.length());

           System.out.println("First String is:- "+fString);
           System.out.println("Last String is:- "+lString);


           System.out.println("\n\t\t..........................Compare Two String USing 4-5 ways..............................\n\n");
           /**
            * first Using Built Own Method.........
            */
            String fasString = "GeeksForGeeks";
            String lasString = "Practice";
            String iString = "Geeks";
            String lString2 = "Geeks";

            System.out.println("Compare for "+fasString+" And "+lasString+" is:- "+StringPractice.compareString(fasString, lasString));
            System.out.println("Compare for "+lasString+" And "+iString+" is:- "+StringPractice.compareString(lasString, iString));
            System.out.println("Compare for "+iString+" And "+lString2+" is:- "+StringPractice.compareString(iString, lString2));
            System.out.println("Compare for "+lString2+" And "+fasString+" is:- "+StringPractice.compareString(lString2, fasString));

            /**
             * second USing string.equal(String str).....
             */
            System.out.println("USing equals() Method in String...");
            System.out.println("Compare for "+fasString+" And "+lasString+" is:- "+fasString.equals(lasString)); // return a false means boolean datatype..
            System.out.println("Compare for "+lasString+" And "+iString+" is:- "+lasString.equals(iString)); // return false...
            System.out.println("Compare for "+iString+" And "+lString2+" is:- "+iString.equals(lString2)); // return true...
            System.out.println("Compare for "+lString2+" And "+fasString+" is:- "+lString2.equals(fasString)); // return false..

            /**
             * Third Using equlasIgnoreCase() method....
             */
            System.out.println("Using eualsIgnoreCase() Method in String...");
            System.out.println("Compare for "+fasString+" And "+lasString+" is:- "+fasString.equalsIgnoreCase(lasString)); // return a false means boolean datatype..
            System.out.println("Compare for "+lasString+" And "+iString+" is:- "+lasString.equalsIgnoreCase(iString)); // return false...
            System.out.println("Compare for "+iString+" And "+lString2+" is:- "+iString.equalsIgnoreCase(lString2)); // return true...
            System.out.println("Compare for "+lString2+" And "+fasString+" is:- "+lString2.equalsIgnoreCase(fasString)); // return false..

            /**
             * Fourth USing String.compareTo() Methood ..This Method declare in Camporator interface....
             */
            System.out.println("Using CompareTo() Method in String..");
            System.out.println("Compare for "+fasString+" And "+lasString+" is:- "+fasString.compareTo(lasString)); // return -9
            System.out.println("Compare for "+lasString+" And "+iString+" is:- "+lasString.compareTo(iString)); // return 9
            System.out.println("Compare for "+iString+" And "+lString2+" is:- "+iString.compareTo(lString2)); // return 0
            System.out.println("Compare for "+lString2+" And "+fasString+" is:- "+lString2.compareTo(fasString)); // return 8





             /**
              * Fifth USing String.compareToIgnoreCase() Method... This Method declare in String Class.
              */
              System.out.println("Using CompareToIgnoreCase() Method in String..");
              System.out.println("Compare for "+fasString+" And "+lasString+" is:- "+fasString.compareToIgnoreCase(lasString)); // return -9
              System.out.println("Compare for "+lasString+" And "+iString+" is:- "+lasString.compareToIgnoreCase(iString)); // return 9
              System.out.println("Compare for "+iString+" And "+lString2+" is:- "+iString.compareToIgnoreCase(lString2)); // return 0
              System.out.println("Compare for "+lString2+" And "+fasString+" is:- "+lString2.compareToIgnoreCase(fasString)); // return 8


              /**
               * Sixth Using Objects.equals(String str1, String str2);
               */
            String obj1 = new String(fasString);
            String obj2 = new String(lasString);
            String obj3 = new String(iString);
            String obj4 = new String(lString2);
              System.out.println("Using Objects.equals() Method in String..");
              System.out.println("Compare for "+obj1+" And "+obj2+" is:- "+Objects.equals(obj1, obj2)); // return return false..
              System.out.println("Compare for "+obj2+" And "+obj3+" is:- "+Objects.equals(obj2, obj3)); // return return false..
              System.out.println("Compare for "+obj3+" And "+obj4+" is:- "+Objects.equals(obj3, obj4)); // return true..
              System.out.println("Compare for "+obj4+" And "+obj1+" is:- "+Objects.equals(obj4, obj1)); // return false..



              System.out.println("\n\t\t..............................String Revese Method in java.............................\n\n");

              /**
               * Reverse a String Using Byte[] array ...
               */
              System.out.println("Reverse String Using Byte[] array ...");
              byte[] bytes = fasString.getBytes();

              byte[] temp1 = new byte[bytes.length]; // when reverse a string then reverse string store in temp1..

              for(int i=0; i<bytes.length; i++){
                  temp1[i] = bytes[bytes.length-i-1]; // store the revese string into byte...
              }

              System.out.println("Reverese String is:- "+new String(temp1)); // now reverse byte convert to string objects....


              /**
               * Reverse String Using char[] array......
               */
              System.out.println("\nReverse A String Using char[] array...");
              char[] character = fasString.toCharArray();
              for(int i=character.length-1; i>=0; i--){
                    System.out.print(character[i]); // reverse a string...
              }


            /**
             * Reverse a String Using StingBuilder Class...
             */
            System.out.println("\nUsing a Reverse String by StringBuilder Class");
            StringBuilder stringBuilder2 = new StringBuilder(fasString);

            StringBuilder reveString = stringBuilder2.reverse();
            System.out.println("StringBuilder Reverse String is:- "+reveString);

              /**
               * Reverse a String into Convert char[] array by Swap ...
               */
              System.out.println("\nReverse a String into Convert char[] array by Swap");
              int left, right=0;
              char[] characterArray = fasString.toCharArray();
              right = characterArray.length-1;

              for(left=0; left<right; left++, right--){
                  char temp = characterArray[left];
                  characterArray[left] = characterArray[right];
                  characterArray[right] = temp;
                  
              }
              System.out.println("Reverse String is:- "+new String(characterArray));

              /** 
               * Reverse a String using ArrayList Class and ListIterator and Collections...
               */
              System.out.println("Using Reverse a String By ArrayList Class...");
              char[] abc = fasString.toCharArray();
               List<Character> arrayList = new ArrayList<Character>();

               for(char c: abc){
                   arrayList.add(c); // add character one by one in arrayList ...
               }

               Collections.reverse(arrayList); // reverse of arrayList Object refernce..

               ListIterator list = arrayList.listIterator();
               System.out.print("Reverse String Are:----");
               while(list.hasNext()){
                   System.out.print(list.next());
               }

               /**
                * Remove Leading Zero In String in Java...
                Input:- 0000012345
                Ouput:- 12345

                Input:- 00000012345670
                Output:- 12345670
                */
                System.out.println("\nRemove Leading Zero In String ...\n");
                String stringZero = "000001234546";
                System.out.println("New String is:- "+removeZero(stringZero));
                

                /**
                 * Remove Space in String in java....
                 */
                System.out.println("\nRemove Leading Zero In String...");
                String stringSpace = "    Hey My Name    ";
                System.out.println("\nRemoving Space is:- "+stringSpace.trim());
                System.out.println("Create Own Built Function And Remove Space of The String:- "+removeSpace(stringSpace));


               /**
                * Counting the Word, Character ,sentence and Paragraph in The File in java.........

                */
                try{
                    File file = new File("./Shahid.txt");
                    FileInputStream fileinput = new FileInputStream(file);
                    InputStreamReader inputStream = new InputStreamReader(fileinput);
                    BufferedReader bufferReader = new BufferedReader(inputStream);
                    int wordCount =0;
                    int characterCount=0;
                    int sentenceCount=0;
                    int whiteSpace=0;
                    int paragraphCount=1;
                    String line;
                    try{
                        while((line = bufferReader.readLine())!= null) {
                            if(line.equals("")){
                                paragraphCount++;
                            }
                            if(!(line.equals(""))){
                                characterCount += line.length();
                                
                                String[] whiteSpace2 = line.split("\\s+");
                                System.out.println("WhiteSpace spilt is:- "+whiteSpace2.length);
                                wordCount+= whiteSpace2.length;
                                whiteSpace+= whiteSpace2.length-1;

                                String[] sentence = line.split("[!?.:]+");

                                sentenceCount+= sentence.length;

                                
                                
                            }
                        }
                        System.out.println("WordCount is:- "+wordCount);
                        System.out.println("Character Count is:- "+characterCount);
                        System.out.println("WhiteSpace Count is:- "+whiteSpace);
                        System.out.println("Paragraph Count is:- "+paragraphCount);
                        System.out.println("Sentence Count is:- "+sentenceCount);
                        
                    }
                    

                    catch(IOException exz){
                        exz.getMessage();
                    }
                    
                }
                
                catch(FileNotFoundException ex){
                    ex.printStackTrace();
                }
                
                /**
                 * Remove a specific Element in List using Prdicate in java...
                 */
                System.out.println("\n\t\tRemove a Specific Element in list by Predicate in 4 ways...\n");
                System.out.println("\nFirst Using Iterator Interface...");
                List<String> lists = new ArrayList<>(Arrays.asList("Geek",null,"ForGeeks",null,"A Computer Science Portal"));
                System.out.println("New ArrayList is:- "+lists);
                Predicate<String> isNull = item ->Objects.nonNull(item);  // Create a Predicate for Which Element are Remove In List...
                System.out.println("Update ArrayList is>:- "+removeElement(lists, isNull));

                System.out.println("\n\nSecond Using List.removeAll() ....\n");
                List<String> listNumber = new ArrayList<>(Arrays.asList("10","20","30","40","50","10","60"));
                System.out.println("AraryList is:- "+listNumber);
                Predicate<String> is10 = i ->(i=="10");
                System.out.println("New Update ArrayList is:- "+removeInteger(listNumber,is10));


                System.out.println("\n\nThird Using Lambdas() Exceptions... ....\n");
                List<String> listNull = new ArrayList<>(Arrays.asList("10",null,"20",null,"30"));
                System.out.println("ArrayList is:- "+listNull);
                Predicate<String> isNullSupport = x ->(x==null);
                System.out.println("New ArrayList is:- "+removeLamdas(listNull, isNullSupport));


                System.out.println("\n\n\tFourth Using list.removeIf(Predicate p) method...");
                List<String> listRemove = new ArrayList<>(Arrays.asList("Geek","For Geeks","Geeks","A Computer Science Portal","Geek"));
                System.out.println("New ArrayList is:- "+listRemove);
                Predicate<String> isGeek = item ->(item=="Geek");
                System.out.println("New Update ArrayList is:- "+removeIfMethod(listRemove, isGeek));


                 /**
                  * Check If String Contains Only Alphabat Using Lambda Exceptions...
                  */
                  System.out.println("\n\n\t Check if String Contains Only Aplhabat ..........\n\n");
                  String stringLambdas = "SoftwareEngineer";
                  System.out.println("String Contains Only Alphabat is:- "+stringAlphabarUsingLambdas(stringLambdas));

                 

                  /**
                   * Check if String Contains Only Alphabat Using Ascii Value in java...
                   */
                  System.out.println("\n\n\t Check if String Contains Only Aplhabat USing Ascii Value  ..........\n\n");
                  String stringAsciString = "SoftwareEngineer";
                  System.out.println("String Contains Only Alphabat is:- "+stringAlphabatUsingAscii(stringAsciString));

                   /**
                    * Check if String Contains Only Aplhabat Using regex Expression...
                    */
                System.out.println("\n\n\t Check if String Contains Only Aplhabat Using Regex Exception..........\n\n");
                String stringregerxString = "SoftwareEngineer";
                System.out.println("String Contains Only Alphabat is:- "+stringAlphabatUsingRegex(stringregerxString));
                




         
    }
    public static boolean stringAlphabatUsingRegex(String str){
        return (str!=null && !str.equals("") && str.matches("^[a-zA-Z]*$"));
    }
    public static boolean stringAlphabatUsingAscii(String str){
        if(str==null || str.equals("")){
            return false;
        }
        else{
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if((!(ch>='A' && ch<='Z')) && (!(ch>='a' && ch<='z'))){
                    return false;
                }
                
            }
        }
        return true;
    }
    /**
     * @param str
     * @return
     */
    public static boolean stringAlphabarUsingLambdas(String str){
        return (str!=null && (!str.equals("")) && str.chars().allMatch(Character::isLetter)); // check if string using only alphabat in lamdas exception...

    }
    public static <PlaceHolder> List<PlaceHolder> removeIfMethod(List<PlaceHolder> l, Predicate<PlaceHolder> p) {
        l.removeIf(x ->p.test(x));

        return l;
    }
    /**
     * 
     * @param <PlaceHolder>
     * @param l
     * @param p
     * @return
     */
    public static <PlaceHolder> List<PlaceHolder> removeLamdas(List<PlaceHolder> l, Predicate<PlaceHolder> p){
        l= l.stream().filter(p).collect(Collectors.toList());
        return l;
    }
    /**
     * 
     * @param <PlaceHolder>
     * @param l
     * @param p
     * @return
     */
    public static <PlaceHolder> List<PlaceHolder> removeInteger(List<PlaceHolder> l, Predicate<PlaceHolder> p){
        Collection<PlaceHolder> collection = new ArrayList<PlaceHolder>();
        for(PlaceHolder t : l){
            if(p.test(t)){
                collection.add(t); // insert element whose match of the predications...
            }
        }
        System.out.println("Removal Element is:- "+collection);
        l.removeAll(collection);

        return l;



    }
    /**
     * 
     * @param <T>
     * @param l
     * @param p
     * @return
     */
    // ...................Using generic Method in String.....
    public static <T> List<T> removeElement(List<T> l, Predicate<T> p){
        Iterator it = l.iterator();
        while(it.hasNext()){
            T t = (T) it.next(); 
            if(p.test(t)){
                it.remove();
            }
        }
        return l; // return list/...
    }
    /**
     * 
     * @param str
     * @return
     */
    public static String removeSpace(String str){
        StringBuffer stringBufferSpace = new StringBuffer(str);
        int i=0;
        while(i<stringBufferSpace.length()){
            if(stringBufferSpace.charAt(i)==' '){
                stringBufferSpace.deleteCharAt(i);
            }
            else{
                return stringBufferSpace.toString();
            }
        }

        return stringBufferSpace.toString();
    }
    /**
     * @param str
     * @return
     */
    public static String removeZero(String str){
        StringBuffer stringBufferzero = new StringBuffer(str);
        int i=0;
        while(i<stringBufferzero.length()){
            if(stringBufferzero.charAt(i)=='0'){
                stringBufferzero.deleteCharAt(i);
            }
            else{
                return stringBufferzero.toString();
            }
        }
        return stringBufferzero.toString();
    }
    /**
     * 
     * @param str1
     * @param str2
     * @return
     */
    public static int compareString(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int minlen= Math.min(len1, len2);

        for(int i=0; i<minlen; i++){
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
            if(str1_ch!=str2_ch){
                return str1_ch-str2_ch;
            }
        }
        if(len1!=len2){
            return len1-len2;
        }
        else{
            return 0;
        }
    }
}