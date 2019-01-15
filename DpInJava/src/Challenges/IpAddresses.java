package Challenges;

import java.util.ArrayList;
import java.util.List;

public class IpAddresses {
	public static List<String> getIpAddresses(String s){
		List<String> fDStrings = new ArrayList<String>();
        List<String> sDStrings = new ArrayList<String>();
        List<String> tDStrings = new ArrayList<String>();
        if(s.length()<4) return tDStrings;
        if(s.charAt(0)=='0'){
            fDStrings.add(s.substring(0,1)+"."+s.substring(1));
        }else {            
            for(int i = 1; i<4; i++){
                if(Integer.valueOf(s.substring(0,i))<=255){
                    fDStrings.add(s.substring(0,i)+"."+s.substring(i));    
                }           
            }
        }
        for(String fd : fDStrings){
            String[] all  =  fd.split("\\.");
            if(all.length<2) continue;
            String pr =  all[0];
            String rest  =  all[1];
            if(rest.charAt(0)=='0'){
                sDStrings.add(pr+"."+rest.substring(0,1)+"."+rest.substring(1));
                continue;
            }
            for(int i = 1; i<4; i++){            
                if(rest.length()>i && Integer.valueOf(rest.substring(0,i))<=255){
                    sDStrings.add(pr+"."+rest.substring(0,i)+"."+rest.substring(i));    
                }
            }
        }
        for(String sd : sDStrings){
            String[] all  =  sd.split("\\.");
            if(all.length<3) continue;
            String pr =  all[0]+"."+all[1];
            String rest  =  all[2];
            if(rest.charAt(0)=='0'){
                if(rest.length()>1 && rest.length()<7 && Integer.valueOf(rest.substring(1))<=255 && (rest.substring(1).charAt(0)!='0' || rest.substring(1).length()==1)){
                    tDStrings.add(pr+"."+rest.substring(0,1)+"."+rest.substring(1));
                }
                continue;
            }
            for(int i = 1; i<4; i++){
                if(rest.length()>i && rest.length()<7 && Integer.valueOf(rest.substring(0,i))<=255 && Integer.valueOf(rest.substring(i))<=255 && (rest.substring(i).charAt(0)!='0' || rest.substring(i).length()==1)){
                    tDStrings.add(pr+"."+rest.substring(0,i)+"."+rest.substring(i));    
                }
            }
        }
        return tDStrings;
	}

}
