package Challenges;

public class MskingPersonalInformation {
	public String maskPII(String S) {
        boolean isEmail =  (S.charAt(S.length()-1)-'A' <26 && S.charAt(S.length()-1)-'A' >=0) ||
            (S.charAt(S.length()-1)-'a' <26 && S.charAt(S.length()-1)-'a' >=0);
        if(isEmail){
            String[] emailStrings =S.split("@");
            String firstChar =  Character.toString(Character.toLowerCase(emailStrings[0].charAt(0)));
            String lastChar =   Character.toString(Character.toLowerCase(emailStrings[0].charAt(emailStrings[0].length()-1)));
            String secondName =  emailStrings[1].toLowerCase();
            return firstChar+"*****"+lastChar+"@"+secondName;
        }else {
            char[] pN =  new char[16];
            int pointer = 15;
            for(int i = S.length()-1; i>=0; i--){
                char c = S.charAt(i);
                if(c-'0'>=0 && c-'0'<=9){
                    if(pointer == 11 || pointer == 7 || pointer == 3){
                        pN[pointer--] ='-';
                    }
                    pN[pointer--] =c;
                }
            }
            if(pointer>2) return new String(pN).substring(pointer+1);
            else return "+"+new String(pN).substring(pointer+1);
        }
    }

}
