package cl.metricasinteligentes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.metricasinteligentes.model.Cliente;
import cl.metricasinteligentes.model.User;
import cl.metricasinteligentes.service.SecurityService;
import cl.metricasinteligentes.service.UserService;
import cl.metricasinteligentes.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(Model model) {
     

        return "menu";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);
        System.out.println("el password");
        System.out.println(userForm.getPassword());

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
        System.out.println(" oeee yapo" + userForm.getUsername());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
    	System.out.println("pase al abrir el login");
    	System.out.println(logout);
    	
        if (error != null)
            model.addAttribute("error", "el usuario y password son invalidos.");

        if (logout != null)
            model.addAttribute("message", "Sesion cerrada con exito.");

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET )
    public String welcome(Model model) {
    	model.addAttribute("clienteForm", new Cliente());
        return "welcome";
    }
    
    
    
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.POST )
    public String welcome2(@ModelAttribute("clienteForm") Cliente clienteForm, BindingResult bindingResult, Model model) {
    	System.out.println("volvi al controller del welcome post" + clienteForm.getNombre());
    	clienteForm.setNombre("enzo");
    	clienteForm.setRut("");
    	clienteForm.setDireccion("");
    	
    	
    	

    	
    	model.addAttribute("message", "Cliente creado con exito.");
    	
        return "welcome";
    }
    
}
