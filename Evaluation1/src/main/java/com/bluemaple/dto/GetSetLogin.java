package com.bluemaple.dto;

public class GetSetLogin 
{
private static String usrname;
private static String pasword;
public String getUsrname() {
	return usrname;
}
public void setUsrname(String usrname) {
	GetSetLogin.usrname = usrname;
}
public  String getPasword() {
	return pasword;
}
public void setPasword(String pasword) {
	GetSetLogin.pasword = pasword;
}

}
