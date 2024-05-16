package fundamentos;

public class interferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);

		// "var" delcarete what type of is the variable
		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);

		c = "outro texto";
		System.out.println(c);

		// if "b" is number or double you can't change the type of the variable

		double d;// variable was declaared here
		d = 123.65;// Variable was initialized here
		System.out.println(d);// used

		// you can't do this with var, because var needs to be declared first

		var e = 123.45;
		System.out.println(e);

		var f = 12;// int
		// f = 12.01; java wants you need to be explicit what do you want
		System.out.println(f);
	}

}
