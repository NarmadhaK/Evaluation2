package com.bluemaple.DAO;


import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;
//import com.bluemaple.dto.GetSetTimings;

public interface Daointerface
{
	public GetSetRegister getReg(GetSetRegister reg);
	public GetSetLogin getLog(GetSetLogin log);
	public GetSetMovie getMov(GetSetMovie mov);
	//public  GetSetTimings getTimings(GetSetTimings tym);
}
