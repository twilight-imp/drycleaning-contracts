package contracts.controllers.admin;

import contracts.controllers.BaseController;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
public interface BaseAdminController<CreateForm, UpdateForm> extends BaseController {

    @GetMapping
    String list(Model model);


    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String create(@Valid @ModelAttribute("form") CreateForm form, BindingResult bindingResult, Model model
    );

    @GetMapping("/edit")
    String editForm(@RequestParam String id, Model model
    );

    @PostMapping("/edit")
    String edit(@RequestParam String id, @Valid @ModelAttribute("form") UpdateForm form, BindingResult bindingResult, Model model
    );

    @GetMapping("/delete")
    String delete(@RequestParam String id);
}
