package contracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/services")
public interface ServiceController extends BaseController {
    @GetMapping()
    String listServices(Principal principal, Model model);

}
