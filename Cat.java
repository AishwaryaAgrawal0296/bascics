package neebal;

public class Cat {
String name ; // String is a special reference type for strings
Cat(String catName)
{
	name = catName ;

}
String name()
{
	return name;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat cat = new Cat ("priya");
System.out.println(cat.name());
	}

}
