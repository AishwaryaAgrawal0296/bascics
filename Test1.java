package neebal;
 class Test2{
	static int q = 6;
	int r;
	static {
		System.out.println("Parent static Inilization");
		System.out.println(q);
	}
	{
		System.out.println("Instance intilization of Parent");
		System.out.println(r);
	}
	 Test2(){
		System.out.println("parent class constructor");
	}
	 Test2(int j){
		System.out.println("parametrised construtor of parent:"+j);
		
	}
	
	
}

public class Test1 extends  Test2 {
	static int p;
    int nonStaticVariable;        

    // Static initialization block:
    // Runs once (when the class is initialized)
    static 
	{
        System.out.println("Static initalization of child class.");
        p = 5;
    }

    // Instance initialization block:
    // Runs each time you instantiate an object
    {
        System.out.println("Instance initialization of child class.");
        nonStaticVariable = 7;
    }

    public Test1() {
        System.out.println("Constructor of child class.");
    }
    Test1(int i){
    	System.out.println("parametrised constructor of child class:"+i);
    }

    public static void main(String[] args) {
        new Test1();
        new Test1(7);
    }
}


