import java.util.*;
class prime{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
int m =  n/2;
int flag=0;
if(n==0||n==1){
System.out.println("0 and 1 are prime number ,may be not");
}
else{
for(int i=2;i<=m;i++){
if(n%i==0){
System.out.println("not prime");
flag=1;
break;
}}
if(flag==0){
System.out.println("prime");
}
}
}
}