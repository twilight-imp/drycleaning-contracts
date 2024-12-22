package contracts.viewmodel.admin.user.form;

import jakarta.validation.constraints.NotEmpty;


import java.util.List;

public record UserAdminEditForm(

        @NotEmpty(message = "Роль обязательна")
        List<String> roles

) {
}
