package contracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/products")
public interface ProductController extends BaseController {

    @GetMapping()
    String listProducts(Principal principal, Model model);

}
