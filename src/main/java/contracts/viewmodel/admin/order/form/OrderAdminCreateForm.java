package contracts.viewmodel.admin.order.form;

import jakarta.validation.constraints.NotBlank;


public record OrderAdminCreateForm(


        @NotBlank(message = "Пользователь обязателен")
        String userId

) {
}
