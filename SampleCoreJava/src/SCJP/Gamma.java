package SCJP;

public class Gamma {

	static Foo fooBar(Foo foo){
		foo = new Foo(100);
		return foo;
	}
	public static void main(String[] args) {
		Foo foo = new Foo(300);
		System.out.println(foo.getX()+"-");
		Foo fooFoo = fooBar(foo);
		System.out.println(foo.getX()+"-");
		System.out.println(fooFoo.getX()+"-");
		foo = fooBar(fooFoo);
		System.out.println(foo.getX()+"-");
		System.out.println(fooFoo.getX());

	}

}
