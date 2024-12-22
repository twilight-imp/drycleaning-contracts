package contracts.controllers.admin;

import contracts.viewmodel.admin.order.form.OrderAdminCreateForm;
import contracts.viewmodel.admin.order.form.OrderAdminEditForm;
import contracts.controllers.BaseController;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/orders")
public interface OrderAdminController extends BaseController{

    @GetMapping
    String list(Model model);
    @GetMapping("/edit")
    String editForm(
            @RequestParam String id,
            Model model
    );

    @PostMapping("/edit")
    String edit(
            @RequestParam String id,
            @Valid @ModelAttribute("form") OrderAdminEditForm form,
            BindingResult bindingResult,
            Model model
    );
}
