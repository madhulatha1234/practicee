package Practice;

public class New5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,1,0,0,0,1};
int b[]=new int[a.length];
int m=0;
int n=a.length-1;
for(int i=0;i<a.length;i++) {
	if(a[i]==0) {
		b[m]=a[i];
		m++;}
		else if(a[i]==1){
			b[n]=a[i];
			n--;
		}
	
}
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
}
	}

}
