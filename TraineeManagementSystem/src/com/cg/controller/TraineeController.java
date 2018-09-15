package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;


@PropertySource("classpath:admininfo.properties")
@Controller
public class TraineeController {
	
	Integer SHOW_WHOLE_VIEW=1;
	Integer SHOW_PAR_VIEW=2;
	@Value("${username}") 
	 String adminName;
	@Value("${password}") 
	 String adminPassword;
	@Autowired 
	TraineeService tService;
	
         @RequestMapping("dashboard")
         public String showDashboard(Model model ){
        	
        	 
        	 return "Home";
        	 
        	/*if(username.equals(adminName)&&password.equals(adminPassword)){
        		return "Home";	
        	}
        	else return "index";*/
         }
         @RequestMapping("traineeManager")
         public String manageTrainee(@RequestParam("choice")Integer choice,Model model)
         
         {
        	 Trainee trainee=new Trainee();
        	 Integer viewMode;
        	 List<Trainee> trainees =new ArrayList<>();
        	 switch(choice)
        	 { case 1: model.addAttribute("trainee", trainee);
        	           return "insertTrainee";
        	 
        	 case 2: model.addAttribute("trainee",trainee);
        	 viewMode=SHOW_PAR_VIEW;
        	 model.addAttribute("viewMode", viewMode);
	                 return "deleteTrainee";
	                 
        	 case 3:model.addAttribute("trainee",trainee);
        	 viewMode=SHOW_PAR_VIEW;
        	 model.addAttribute("viewMode", viewMode);
        		 return "modifyTrainee";
        	 case 4: return "retrievetrainee";
        	 case 5: return "retrievAll";
        	 default: return "Home";
        	 }
         }
         @RequestMapping("insertTrainee")
         public String insertTrainee(@Valid@ModelAttribute("trainee")Trainee trainee,BindingResult res,Model model){
        	// System.out.println(trainee);
        	 if(res.hasErrors())
        	 {
        		 model.addAttribute("trainee", trainee);
        		 return "insertTrainee";
        	 } else
        	 {
        	 tService.addTrainee(trainee);
        	 return "success";
         }
         }
         @RequestMapping("deleteTrainee")
         public String deleteTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
         {
        	 Trainee tr=tService.retrieveTrainee(trainee.getTraineeId());
        	 model.addAttribute("viewMode", SHOW_WHOLE_VIEW);
        	 model.addAttribute("trainee", tr);
        	 return "deleteTrainee";
         }
         @RequestMapping("finaldelete")
         public String finaldelete(@ModelAttribute("trainee")Trainee trainee,Model model)
         {
        	 tService.deleteTrainee(trainee.getTraineeId());
        	 return null;
         }
         @RequestMapping("retrieveTrainee")
         public String retrieveTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
         {
        	 Integer viewMode=SHOW_WHOLE_VIEW;
        	 model.addAttribute("viewMode", viewMode);
        	 trainee=tService.retrieveTrainee(trainee.getTraineeId());
        	 model.addAttribute("trainee",trainee);
        	 return "modifyTrainee";
         }
         @RequestMapping("updateTrainee")
         public String updateTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
         {
        	 tService.modifyTrainee(trainee);
        	 return null;
         }
}
