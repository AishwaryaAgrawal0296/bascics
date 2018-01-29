package neebal;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("in class A");

	
 class Bii{
		int a = 10 ;
		public  void Mmethod(){
			System.out.println("in b:"+a);
		}
	}
class G extends Bii {
	//public static void main(String[] args) {
		
	G g = new G() ;
	g.Mmethod();
	//public void Method (int i) 
	//{
		System.out.println("in class G"+i);
	//}
	//g.Mmethod(1);
}
}
}
