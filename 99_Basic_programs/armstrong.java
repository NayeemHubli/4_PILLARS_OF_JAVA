import java.util.*;
class armstrong{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
int temp=n;
int r,arm=0;
while(n>0){
r =  n%10;
n =  n/10;
arm+=r*r*r;
}
if(arm == temp){
System.out.println("its armstrong");
}
else{
System.out.println("not and armstrong");
}
}
}
