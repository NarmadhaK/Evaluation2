package com.bluemaple.exev;
//import com.bluemaple.DAO.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.DAO.Daoclass;
import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;
//import com.bluemaple.dto.GetSetTimings;
import com.bluemaple.service.Servicej;

@Controller
@RequestMapping(value="/Register")

public class Controler {

	@Autowired
	private Servicej serv;

	@RequestMapping(value = "/MainPage", method = RequestMethod.POST)
	public String getRegister(@ModelAttribute GetSetRegister reg) {
		serv.getReg(reg);
		return "MainPage";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView getLog(@ModelAttribute GetSetLogin log,@ModelAttribute GetSetMovie mov) {
		serv.getLog(log);
		
		/* if (log.getPasword() == null || log.getUsrname() == null ||
				  log.getUsrname().isEmpty() || log.getPasword().isEmpty()) {
			 return "MainPage"; }*/
		
		System.out.println("Controller called.!");
		serv.getMov(mov);
		ModelAndView viewpage = new ModelAndView();
		viewpage.setViewName("Dashboard");
		viewpage.addObject("Moviess", Daoclass.namearray);
		return viewpage;
		
		

	}

	/*
	 * if (log.getPasword() == null || log.getUsrname() == null ||
	  log.getUsrname().isEmpty() || log.getPasword().isEmpty()) { return
	  "MainPage"; }
	 * 
	 * /*GetSetLogin login = serv.getLog(log);
	 * 
	 * boolean result=false; if (!result|| login!=null) { return "Dashboard";
	 * }else{ return "MainPage"; }
	 */

	/*@RequestMapping(value = "/booking", method = RequestMethod.POST)
	public (@ModelAttribute GetSetMovie mov) {

		
		
		

	}*/
	
	/*@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String getTimings(@ModelAttribute GetSetTimings tym)
	{
		serv.getTimings(tym);
		return ;
		
	}*/

}
