package net.okjsp.gawi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.okdevtv.mvc.HomeController;

@Controller
public class GawiController {
	private static final Logger logger = LoggerFactory.getLogger(GawiController.class);
	@RequestMapping(value = "/query.do", method = RequestMethod.POST)	
	public String queryJSON(Model model){
		//logger.info("Welcome query.do! The client locale is ");
		return "queryJSON";
	}

	@RequestMapping(value = "/stat.do", method = RequestMethod.GET)	
	public String statJSON(Model model){
		//logger.info("Welcome query.do! The client locale is ");
		return "statJSON";
	}

}
