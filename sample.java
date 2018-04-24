package pure_storage;

public class sample {
static void tester(int number){
	number++;
}
public static void main(String args[]){
	int num=1;
	tester(num);
	System.out.println(num);
	String a = "abc";
	String b = new String("abc");
	System.out.println(a==b);
}
}
