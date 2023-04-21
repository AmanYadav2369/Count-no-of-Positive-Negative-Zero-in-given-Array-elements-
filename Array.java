/* wajp to read arrays of numbers and count number of ( positive no , negative no , and 0's  ).
*/

import java.io.*;
class Array 
{
public static void main(String args[])
{
Console c=System.console();
int size=Integer.parseInt(c.readLine("enter the size of array :"));

int num[]=new int[size];

for(int i=0; i<size; i++){
num[i]=Integer.parseInt(c.readLine("enter the numbers :"));
}

int c1=0, c2=0, c3=0;
for(int i=0; i<size; i++){
if(num[i]>0)		c1++;
else if(num[i]<0)		c2++;
else			c3++;
}
System.out.println(c1+" "+c2+" "+c3);

}
}