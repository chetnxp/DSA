package rectangle.com; 
import java.io.*; 
import java.util.*; 
import java.io.*; 
 class Rect  
 { 
  double width,length; 
  String color; 
  void set_length(double a) 
  {  
   length=a;  
  } 
  void set_width(double a) 
  {  
   width=a;  
  } 
  void set_color(String x) 
  {  
   color=x; 
  } 
  double area() 
  {  
   return(width*length);  
     } 
  String getcolor() 
  {  
   return(color);  
  } 
} 
class Rectangle 
{ 
 public static void main(String arg[])throws Exception 
 { 
  Scanner in=new Scanner(System.in); 
  Rect a=new Rect(); 
     System.out.println("Enter the length for first rectangle"); 
 //s=in.nextLine(); 
 a.set_length(in.nextDouble()); 
 System.out.println("Enter the width for first rectangle"); 
 //s=in.readLine(); 
 a.set_width(in.nextDouble()); 
 System.out.println("Enter the Color for first rectangle"); 
 a.set_color(in.next()); 
 
 Rect 
 b=new Rect(); 
 System.out.println("Enter the length for second rectangle"); 
 b.set_length(in.nextDouble()); 
System.out.println("Enter the width for second rectangle"); 
b.set_width(in.nextDouble()); 
System.out.println("Enter the Color for second rectangle"); 
//String s1=in.nextLine(); 
b.set_color(in.next()); 
if(a.area()==b.area()&& a.getcolor().equals(b.getcolor()) ) 
System.out.println("Matching Rectangle "); 
else 
System.out.println("Non Matching Rectangle "); 
}