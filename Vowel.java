public class Vowel
{
 public static void main(String args[])
{char ch ='A';
   switch(ch)
{
   case 'A' :
   case 'E' :
   case 'I' :
   case 'O' :
   case 'U' :
   case 'a' :
   case 'e' :
   case 'i' :
   case 'o' :
   case 'u' :
System.out.println(ch + "is vowel");
break;
default:
System.out.println(ch + "is not vowel");
}
}
}