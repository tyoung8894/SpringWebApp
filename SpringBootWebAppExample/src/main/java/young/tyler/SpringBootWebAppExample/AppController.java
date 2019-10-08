package young.tyler.SpringBootWebAppExample;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	
	/*
	 * puts this collection to a Model object, which will be then used by the view.
	 * it returns the view name “contact”, which can be resolved to a JSP
	 * page or a ThymeLeaf template, depending on our configuration.
	 */
	@RequestMapping("/list_contact")
	public String listContact(Model model) {
		
		 ContactBusiness business = new ContactBusiness();
         List<Contact> contactList = business.getContactList();
         model.addAttribute("contacts", contactList);
         
         return "contact";	
	}
	
	

}
