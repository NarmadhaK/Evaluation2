package com.bluemaple.service;
import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;
//import com.bluemaple.dto.GetSetTimings;

public interface Serviceinterface {

	public GetSetLogin getLog(GetSetLogin log);

	public GetSetRegister getReg(GetSetRegister reg);

	public GetSetMovie getMov(GetSetMovie mov);
	
	//public GetSetTimings getTimings(GetSetTimings tym);
	
}
