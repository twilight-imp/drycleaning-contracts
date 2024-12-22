package contracts.controllers;

import contracts.viewmodel.order.OrderPositionCreateForm;
import contracts.viewmodel.user.auth.LogInForm;
import contracts.viewmodel.user.auth.RegisterForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/auth")
public interface AuthController extends BaseController {

    @GetMapping("/login")
    String loginForm(Model model);

    @GetMapping("/register")
    String registerForm(Model model);

    @PostMapping("/login-error")
    String onFailedLogin(@ModelAttribute String username, RedirectAttributes redirectAttributes);

    @PostMapping("/register")
    String register( @Valid @ModelAttribute("form") RegisterForm form,BindingResult bindingResult, Model model);

}

