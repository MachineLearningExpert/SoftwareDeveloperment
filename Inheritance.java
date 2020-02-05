

// .................................Singal Inheritance in java.............................

// class Base{
//     /**
//      * use singal inheritance in java...
//      */

//      //use constructer of Base Class...
//      int i;
//      Base(int i){
//          this.i=i;
//      }

//      public int getData(){
//          return i;
//      }
// }

// class Derived extends Base{
//     int j;
//     Derived(int i, int j){
//         super(i);
//         this.j=j;
//     }
    
//     @Override
//     public int getData(){
//         return (super.getData()+j); // use Base Class Function....
        

//     }

// }

// public class Inheritance{
//     public static void main(String[] args){
//         Derived dr = new Derived(10, 20);
//         System.out.println("Data is:-"+dr.getData());
        

//     }
// }



// ........................................Mulilti-level or Granparent Access Member..................................

// class Base{
//     private int firstValue;

//     public Base(int i){
//         firstValue=i;
//     }

//     public void getData(){
//         System.out.println("Value of Base Class is:- "+firstValue);
//     }
// }

// class Derived extends Base{
//     private int secondValue;

//     public Derived(int i, int j){
//         super(i);
//         secondValue=j;
//     }

//     @Override
//     public void getData(){
//         super.getData();
//         System.out.println("Value of Derived Class is:- "+secondValue);
//     }
// }

// class Third extends Derived{
//     /**
//      * here use Mullti-Inheritance in java./........
//      */
//     private int thirdValue;

//     public Third(int i, int j, int z){
//         super(i, j);
//         thirdValue=z;
//     }
//     @Override
//     public void getData(){
//         super.getData();
//         System.out.println("Third Class Value is:- "+thirdValue);
//     }
// }

// public class Inheritance{
//     public static void main(String[] args){
//         /**
//          * use first access Subclass Using Parent class object...
//          * then second use subclass using Subclass class Object...
//          */
//         Derived base = new Third(100, 200, 300);
//         base.getData();
         
//     }
// }


// ......................................Private Method Overriding in java.................................
// import java.lang.String;
// public class Inheritance{
//     private String msg = "Hello Programmer...";

//     private void foo(){
//         System.out.println("Outer Fun()");
//     }

//     class Inner extends Inheritance{
        
//         private void foo(){
//             System.out.println("Accessinf private Member of Outer "+msg);
//         }
//     }


    
//     public static void main(String[] args){
//            Inheritance o = new Inheritance();

//             Inner i = o.new Inner();

//             o.foo();
            
//             i.foo();


//     }
// }



// .................................Object Serialization with Object ..............................

// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInput;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;


// class Base implements Serializable{
//     public  int firstData;

//     public Base(int firstData){
//         this.firstData=firstData;
//     }
// }

// /**
//  * when supeclass Implements Serializable interface then subclass Automatic serializable....
//  */

//  class Derived extends Base{
//      int j;

//      public Derived(int firstData,int j){
//          super(firstData);
//          this.j=j;
//      }
//  }
 
//  public class Inheritance{
//      public static void main(String[] args) throws IOException,ClassNotFoundException,FileNotFoundException{
//          Derived dr = new Derived(100, 200);

//          FileOutputStream fs = new FileOutputStream("shahidali.txt");
//         ObjectOutputStream ois = new ObjectOutputStream(fs);

//         ois.writeObject(dr);

//         fs.close();
//         ois.close();

//         FileInputStream fos = new FileInputStream("shahidali.txt");
//         ObjectInputStream ous = new ObjectInputStream(fos);

//         Derived ds =(Derived) ous.readObject();

//         System.out.println("Value form first Data in  File is:- "+dr.firstData);
//         System.out.println("Value from Second Data in File is:- "+dr.j);

//         fos.close();
//         ous.close();
//      }
//  }



// //  ............................access retrive with superclass and subclass...........

// class Base{
//     private void fun(){
//         System.out.println("This class is Base class");
//     }
// }

// class Derived extends Base{
    
//     public void fun(){
//         System.out.println("This Class is Derived Class...");
//     }
// }

// public class Inheritance{
//     public static void main(String[] arg){
//         Derived dr = new Derived();
//         dr.fun();
//     }
// }



// .........................................superclass ans subclass have same data memeber.............................
class Superclass{
    int value=100;

    public void showData(){
        System.out.println("Value Of SupeClass is:- "+value);
    }
}

class Subclass extends Superclass{
    int value=1000;
    @Override
    public void showData(){
        System.out.println("Value of Subclass is:- "+value);
    }
}

public class Inheritance{
    public static void main(String[] args){
        Subclass sb = new Subclass();

        System.out.println("Value of Subclass is:- "+sb.value); // print value of subclass is:- 1000;
        Superclass sp = sb;

        System.out.println("Value of Superclass is:- "+sp.value); // print value of Superclass is:- 100;
    }
}




