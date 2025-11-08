package main;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords(){
		loginInfo.put("root", "1234");
		loginInfo.put("Brometheus", "PWD");
		loginInfo.put("BroCode", "abc1234");
	}
	
	protected HashMap<String, String> getLoginInfo(){
		return loginInfo;
	}

}
