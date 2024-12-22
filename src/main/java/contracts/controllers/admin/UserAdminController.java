package contracts.controllers.admin;

import contracts.controllers.BaseController;
import contracts.viewmodel.admin.user.form.UserAdminCreateForm;
import contracts.viewmodel.admin.user.form.UserAdminEditForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/users")
public interface UserAdminController extends BaseController {
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
            @Valid @ModelAttribute("form") UserAdminEditForm  form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("/delete")
    String delete(@RequestParam String id);
}
