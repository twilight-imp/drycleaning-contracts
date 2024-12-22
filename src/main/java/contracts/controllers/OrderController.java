package contracts.controllers;

import contracts.viewmodel.order.OrderEditForm;
import contracts.viewmodel.order.OrderPositionCreateForm;
import contracts.viewmodel.order.OrderPositionEditForm;
import contracts.viewmodel.review.ReviewCreateForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/user")
public interface OrderController extends BaseController{
    @GetMapping("/order")
    String listOrderPositions(Principal principal, Model model);

    @GetMapping("/order/add")
    String addOrderPosition(Model model);

    @PostMapping("/order/add")
    String addOrderPosition(Principal principal,@Valid @ModelAttribute("form") OrderPositionCreateForm form,
                            BindingResult bindingResult, Model model);

    @GetMapping("/order/edit")
    String editOrderPosition(@RequestParam String orderPositionId, Model model);

    @PostMapping("/order/edit")
    String editOrderPosition(Principal principal,@RequestParam String orderPositionId, @Valid @ModelAttribute("form") OrderPositionEditForm form,BindingResult bindingResult, Model model);

    @GetMapping("/order/delete")
    String delete(@RequestParam String orderPositionId, Principal principal);

    @GetMapping("/order/editBranch")
    String editBranch(Principal principal, Model model);

    @PostMapping("/order/editBranch")
    String editBranch(Principal principal, @Valid @ModelAttribute("form")OrderEditForm form,BindingResult bindingResult, Model model);

    @GetMapping("/order/create")
    String createOrder(Principal principal, Model model);

}
