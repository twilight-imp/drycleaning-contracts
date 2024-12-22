package contracts.controllers;

import contracts.viewmodel.order.OrderPositionEditForm;
import contracts.viewmodel.review.ReviewCreateForm;
import contracts.viewmodel.user.UserProfileEditForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/profile")
public interface UserController extends BaseController {

    String profile(Principal principal, Model model);

    @GetMapping("/edit")
    String editProfile(Principal principal, Model model);

    @PostMapping("/edit")
    String editProfile(Principal principal, @Valid @ModelAttribute("form")UserProfileEditForm form, BindingResult bindingResult, Model model);

    @GetMapping("/orders")
    String ordersOfUser(Principal principal, Model model);

    @GetMapping("/review")
    String addReview(@RequestParam String orderId, Model model);

    @PostMapping("/review")
    String addReview(@RequestParam String orderId, @Valid @ModelAttribute("form") ReviewCreateForm form,BindingResult bindingResult, Model model, Principal principal);
}
