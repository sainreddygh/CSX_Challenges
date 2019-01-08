package Challenges;

public class ComplexNumberMultiplication {
	public static String getResult(String a , String b) {
		int a1 = Integer.valueOf(a.split("\\+")[0]),
            a2 = Integer.valueOf(a.split("\\+")[1].split("i")[0]),
            b1 = Integer.valueOf(b.split("\\+")[0]),
            b2 = Integer.valueOf(b.split("\\+")[1].split("i")[0]);
        return ""+(a1*b1 - a2*b2)+"+"+(b2*a1 + a2*b1)+"i";
	}

}
