package com.go2q.web.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.go2q.web.data.entity.Category;
import com.go2q.web.data.entity.Counters;
import com.go2q.web.data.entity.Srv;
import com.go2q.web.services.CategoryService;
import com.go2q.web.services.CountersService;
import com.go2q.web.services.SrvService;

@Controller
@RequestMapping(value = "/sp")
public class ServiceProviderResource {
//	
//	@Autowired
//	ServiceProviderService spService;
	@Autowired
	CategoryService catService;
	@Autowired
	CountersService counterService;
	@Autowired
	SrvService srvService;
	
//	@GetMapping(value = "/list")
//	public List<Serviceprovider> findAllSP() {
//		return spService.findAll();
//	}
	
	@RequestMapping(value="/dashboard", method= RequestMethod.GET)
	public String dashboard() {
		
		return "admin.dashboard";
	}
	
	@GetMapping(value = "/category/list")
	public List<Category> findAllCategories() {
		return catService.findAll();
	}
	
	/*@GetMapping(value = "/category/{id}")
	public Category updateCategory(@PathVariable Integer id) {
		System.out.println("id "+id);
		return catService.findById(id);
	}*/
	
	//**** Desk operations ********//
	@PostMapping(value = "/counters/add")
	public String createCounter(@ModelAttribute("Counters") Counters counter,HttpServletRequest request,Model model) {	
		System.out.println(counter);
		
	//	counterService.createCounter(counter);
		request.getSession().setAttribute("SuccessMsg", "Desk created Successfully");
		List<Counters> counterLst=counterService.findAll();
		model.addAttribute("counterLst", counterLst);
		return "admin.desklist";
	}
	
	@PostMapping(value = "/counters/update")
	public Counters updateCounter(@RequestBody Counters counter) {		
		return counterService.update(counter);
	}
	
	@GetMapping(value = "/counters/list")
	public String findAllCounters(Model model) {
		List<Counters> counterLst=counterService.findAll();
		model.addAttribute("counterLst", counterLst);
		return "admin.desklist";
	}	
	
	/*@GetMapping(value = "/counters/{id}")
	public Counters findCounterById(@PathVariable Integer id) {
		
		try {
			return counterService.findById(id);
		} catch (NoSuchElementException nle) {			
			nle.printStackTrace();
			return null;
		}
		 
	}*/
	
	@GetMapping(value = "/counters/{id}")
	public String deleteCounter(@PathVariable Integer id) {
		
		System.out.println(id);
		
		counterService.deleteById(id);
		return "Successfuly deleted the Desk.";
	}	

	//**** Counter operations ends********//
	
	//**** Service operations ********//
		@PutMapping(value = "/service/add")
		public Srv createSrv(@RequestBody Srv srv) {		
			return srvService.createSrv(srv);
		}
		
		@PostMapping(value = "/service/update")
		public Srv updateCounter(@RequestBody Srv srv) {		
			return srvService.update(srv);
		}
		
		@GetMapping(value = "/service/list")
		public List<Srv> findAllSrv() {
			return srvService.findAll();
		}	
		
		/*@GetMapping(value = "/service/{id}")
		public Srv findSrv(@PathVariable Integer id) {
			
			try {
				return srvService.findById(id);
			} catch (NoSuchElementException nle) {			
				nle.printStackTrace();
				return null;
			}
			 
		}
		
		@DeleteMapping(value = "/service/{id}")
		public String deleteSrv(@PathVariable Integer id) {
			srvService.deleteById(id);
			return "Successfuly deleted the Desk.";
		}*/	
		
		//**** Service operations ends********//

	
}
