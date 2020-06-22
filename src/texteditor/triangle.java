

package texteditor;
import java.util.Scanner;
class triangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
//int A = myObj.nextInt();
//int B = myObj.nextInt();
//int C = myObj.nextInt();
////testTriangle(A,B,C);
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
//    	System.out.print(i);
//        System.out.print(j);
System.out.print("i * j: ");
        System.out.print(i * j +"\t");
    }
    System.out.println();
}
}
    
static public void testTriangle(int A,int B, int C){
if(A+B > C){
            System.out.println("YES");
        }else if(A+C > B){
            System.out.println("YES");
        }else if(B+C >A){
            System.out.println("YES");
        }else{
                       System.out.println("NO");
 
        }


} 
}