import java.util.*;
class sum{
public static void main(String[] args){

int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter  numbers of elements");
int n= sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the numbers:");
for( int i=0;i<n;i++){
a[i]=sc.nextInt();
sum+=a[i];
}
System.out.println(sum);
}
}
