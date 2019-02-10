package Challenges;

import java.util.ArrayList;
import java.util.List;

public class EvalueatFraction {
	public String fractionAddition(String expression) {
        List<Point> points =  new ArrayList<>();
        Point currentPoint =  new Point(0,1);
        int currentVal = 0;
        boolean negative = expression.charAt(0)=='-';
        int lcm = 1;
        boolean isDeno = false;
        for(int i = 0; i<expression.length(); i++){
            char c =  expression.charAt(i);
           if(i!=0 && (c=='-' || c=='+')){
              currentPoint.den = currentVal;
              lcm = getLcm(lcm, currentVal);
              points.add(currentPoint);
              currentVal=0;
              isDeno = false;
              negative=c=='-';
              currentPoint= new Point(0,1);
           }
            if(c=='/'){
                currentPoint.num = negative ? -1*currentVal : currentVal;
                isDeno = true;
                currentVal = 0;                
            }
            if(c-'0'>=0 && c-'0'<=10 ){
                currentVal = currentVal*10+ (c-'0');
            }
        }
        currentPoint.den = currentVal;
        lcm = getLcm(lcm, currentVal);
        points.add(currentPoint);
        
        int totalNum = 0;
        for(Point p : points){
            totalNum+=p.num*lcm;
        }
        int gcd = getGcd(totalNum, lcm);
        totalNum/=gcd;
        lcm/=gcd;
        StringBuilder sb = new StringBuilder();
        if(totalNum<0)
            sb.append("-");
        return sb.append(totalNum).append("/").append(lcm).toString();
    }
    
    class Point {
        int num;
        int den;
        Point(int num, int den){
            this.num = num;
            this.den = den;
        }
    }
    int getLcm(int a, int b){
        return a*b/getGcd(a,b);
    }
    int getGcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a =t;
        }
        return a;
    }
}
