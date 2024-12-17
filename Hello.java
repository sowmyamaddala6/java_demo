/*class Hello{
   // public static void main(String args[]){
        //System.out.println("Haii");
   // }
}*/
//import java.util.Scanner;

//public class Hello {
    //public static class Calculator {
        //public void add(int a, int b) {
            //System.out.println("Addition: " + (a + b));
        //}
        //public void sub(int a, int b) {
            //System.out.println("Subtraction: " + (a - b));
        //}
        //public void mul(int a, int b) {
            //System.out.println("Multiplication: " + (a * b));
        //}
    //}

    //public static void main(String[] args) {
        //Calculator calculator = new Calculator(); 
        //Scanner sc = new Scanner(System.in);

        //System.out.println("Enter a value:");
        //int a = sc.nextInt(); 

        //System.out.println("Enter b value:");
        //int b = sc.nextInt(); 

       // calculator.add(a, b);
       // calculator.sub(a, b);
       // calculator.mul(a, b);

        //System.out.println("Thank you!");
        //sc.close(); 
   // }
//}
//JAVA PRACTICE
//class Hello{
    // public static void main(String[] args) {
        //System.out.println("Hi ");

    //}
//}
//Variables
//class Hello{
    //public static void main(String[] args) {
       // System.out.println(6-5);
       // System.out.println(8-5);

   // }
//}
//class Hello{
    //public static void main(String[] args) {
        //int num1 = 6;
       // int num2 = 3;
       // int result = num1+num2;
       // System.out.println(result);
    //}
//}
//Data Types
//class Hello{
   // public static void main(String args[]){
        //int num =6;
        //byte by =3;
        //short s =23;
       // long l = 3456;
       // float f = 5.8f;
       // double d = 5.8;
        //char c = 's';
       // boolean b = true;

    //}

//}
//literals
//class Hello{
    //public static void main(String[] args) {
        //char c = 'a';
       // c++;
       // System.out.println(c);
    //}
//}
//Type conversions and casting
//class Hello{
   // public static void main(String args[]){
       // byte b =127;
       // int a=255;
       // byte k = (byte)a;
       // float f = 5.6f;
       // int t = (int)f;
       //int a=6;
       //byte k = (byte)a;
       // System.out.println(a);
   // }
//}
//Arithmetic operators in java
//class Hello{
   // public static void main(String[] args) {
      //  int num1 = 6;
       // num1 = num1+3;
       // int num2 = 5;
       // int result = num1%num2;
       //num1 -=2;
      // num1 ++;
       // System.out.println(num1);
    //}
//}
//Relational operators in java
//class Hello{
    //public static void main(String[] args) {
        //int x=6;
        //int y=5;
        //boolean result = x!=y;
        //System.out.println(result);
    //}
//}
//class Hello{
    //public static void main(String[] args) {
       // double x = 5.6;
        //double y = 6.5;
        //boolean result = x>=y;
       // System.out.println(result);
    //}
//}
//class Hello{
   // public static void main(String[] args) {
        //System.out.println("hi");
    //}
//}
//Logical operators
//public class Hello{
    //public static void main(String[] args) {
       // int x = 6;
        //int y = 5;
        //int a = 3;
        //int b = 4;
       // boolean result = x>y || a<b;
        //System.out.println(result);
   // }
//}
/*public class Hello{
    public static void main(String[] args) {
        int a =5;
        int b=6;
        int x=4;
        int y=3;
        boolean result = x>y;
        System.out.println(!result); 
    }
}*/
//conditional statements(if else)
/*public class Hello{
    public static void main(String[] args) {
        int x=16;
        int y=15;
        if(x>y)
        {
        System.out.println(x);
        System.out.println("Thank you");
        }
        else
        System.out.println(y);
    }
}*/
//if else if
/*public class Hello{
    public static void main(String[] args) {
        int x=8;
        int y=7;
        int z=9;
        if(x>y && x>z)
        System.out.println(x);
        else if(y>x && y>z)
        System.out.println(y);
        else
        System.out.println(z);
    }
}*/
/*public class Hello{
    public static void main(String[] args) {
        int x=8;
        int y=6;
        int z=9;
        if(x>y && x>z)
        System.out.println(x);
        else if(y>x && y>z)
        System.out.println(y);
        else
        System.out.println(z);
    }
}*/
//Ternary operator
/*public class Hello{
    public static void main(String[] args) {
        int n=5;
        int result=0;
        if(n%2==0)
        result=10;
        else
        result=20;
        System.out.println(result);
    }
}*/
/*public class Hello{
    public static void main(String[] args) {
        int n=6;
        int result=0;
        result = n%2==0 ? 10:20;
        System.out.println(result);
    }
}*/
//Switch statements 
/*public class Hello{
    public static void main(String[] args) {
       int  n=8;
       switch(n){
              case 1:
        System.out.println("Monday");
        break;
              case 2:
        System.out.println("Tuesday");
        break;
             case 3:
        System.out.println("Wednesday");
        break;
             case 4:
        System.out.println("Thursday");
        break;
             case 5:
        System.out.println("Friday");
        break;
             case 6:
        System.out.println("Saturday");
        break;
             case 7: 
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Enter a valid number");
       }

    }
}*/
//New in java switch 
/*public class Hello{
    public static void main(String[] args) {
        String day = "Sunday";
        String result ="";
         result = switch(day){
        
            case"Saturday","Sunday"  : yield "6am";
            case "Monday" :yield "8am";
            default :yield "7am";
         };
        
        System.out.println(result);
    }
}*/
//Need For Loop in Java
/*public class Hello{
    public static void main(String[] args) {
        System.err.println("Hi");
        System.err.println("Hi");
        System.err.println("Hi");
    }
}*/
//While Loop
/*public class Hello{
    public static void main(String[] args) {
        int i=1;
        while(i<=1){
        System.out.println("Hi" + i);
        i++;
        }
    }
}*/