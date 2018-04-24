package pure_storage;

import java.util.Scanner;

public class Benchmark {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[][] ch=new char[(n*2)-1][(2*n)-1];
	int counter=0;
	for(int i=n-1;i>=0;i--){
		System.out.println(i);
		int j=0;
		for(j=0;j<counter;j++){
			ch[i][j]=' ';
		}
		int k = 0;
		if(counter%2==0){
			for(j=counter;j<(i-counter*2);j+=2){
				ch[i][j]='*';
				if(j<(i-counter*2-1))
					ch[i][j+1]='!';
			}
		}
		else{
			for(k=j;k<(i-counter*2);k+=2){
				ch[i][k]='*';
				if(k<(i-counter*2-1))
					ch[i][k+1]='_';
			}
		}
		for(int l=k;l<counter;l++){
			ch[i][l]=' ';
		}
		counter++;
	}
	for(int i=0;i<(2*n-1);i++){
		{
			for(int j=0;j<(2*n-1);j++)
			System.out.print(ch[i][j]);
		}
		System.out.println();
	}
}
}
