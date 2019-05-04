/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.String;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args){
  
  String strArray[] ={
   "MNO",
   "A",
   "DEF",
   "GHI",
   "JKL",
   "PQR",
   "BC",
   "STU",
   "YZ",
   "VWX"};
  
  
  Arrays.sort(strArray);
  System.out.println("berisi abjad");
  showAll(strArray);
  
 }
 
 static void showAll(String[] a){
  for(int i = 0; i < a.length; i++){
   System.out.println(i + ": " + a[i]);
  }
 }
}