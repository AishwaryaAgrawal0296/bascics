package neebal;
 class Draw{
void draw (Shape shape) {
	System.out.println("hii");
	
}
void draw (Shape shape , double x,double y){
 	System.out.println("hiii");
}
void draw (String string) {
	System.out.println("hiiiii");
}
void draw (String string , double x,double y)
{
	System.out.println("hiiiii");
}
}
public class Overloadng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Draw draw = new Draw ('a');
			
	}

}
