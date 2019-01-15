package Challenges;

import java.util.ArrayList;
import java.util.List;

public class IpAddresses {
	public static List<String> getIpAddresses(String s){
		List<String> fDStrings = new ArrayList<String>();
        List<String> sDStrings = new ArrayList<String>();
        List<String> tDStrings = new ArrayList<String>();
        for(int i = 1; i<4; i++){
            if(Integer.valueOf(s.substring(0,i))<=255){
                fDStrings.add(s.substring(0,i)+"."+s.substring(i));    
            }           
        }
        for(String fd : fDStrings){
            String[] all  =  fd.split(".");
            String pr =  all[0];
            String rest  =  all[1];
            for(int i = 1; i<4; i++){            
                if(rest.length()>i && Integer.valueOf(rest.substring(0,i))<=255){
                    sDStrings.add(pr+"."+rest.substring(0,i)+"."+rest.substring(i));    
                }
            }
        }
        for(String sd : sDStrings){
            String[] all  =  sd.split(".");
            String pr =  all[0]+"."+all[1];
            String rest  =  all[2];
            for(int i = 1; i<4; i++){            
                if(rest.length()>i && Integer.valueOf(rest.substring(0,i))<=255 && Integer.valueOf(rest.substring(i))<=255 ){
                    tDStrings.add(pr+"."+rest.substring(0,i)+"."+rest.substring(i));    
                }
            }
        }
        return tDStrings;
	}

}
