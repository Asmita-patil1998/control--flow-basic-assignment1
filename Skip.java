public class Skip
{
public static void main(String args[])
{
int no=3;
while(no<=30)
{
if(no==24)
{
no++;
continue;
}
System.out.println(no);
no++;
}
}
}