package contracts.viewmodel.admin.branch.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record BranchAdminCreateForm(
        @NotBlank(message = "Название обязательно")
        String name,
        @NotBlank(message="Город обязателен")
        String city,

        @NotBlank(message = "Адрес обязателен")
        String address,

        @Pattern(regexp = "^7\\d{10}$", message = "Недопустимый номер телефона")
        String phone
) {
}
