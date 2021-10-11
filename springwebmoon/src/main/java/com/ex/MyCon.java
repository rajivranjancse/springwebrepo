package com.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class MyCon {
@GetMapping("/user")
	public String myTest()
{
return "view.jsp";	
}
}
