import java.util.*;
class check{
public static void main(String[] args){

int largest,smallest;
Scanner sc = new Scanner(System.in);
System.out.println("Enter  numbers of elements");
int n= sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the numbers:");
for( int i=0;i<n;i++){
a[i]=sc.nextInt();
}
largest=a[0];
smallest=a[0];
for(int j=0;j<n;j++){
if(a[j]>largest){
largest=a[j];
}
if(a[j]<smallest){
smallest=a[j];
}
}

System.out.println("largest:"+largest+" smallest:"+smallest);
}
}
