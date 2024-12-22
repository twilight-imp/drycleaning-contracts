package contracts.viewmodel.admin.branch.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record BranchAdminEditForm(

        @NotBlank(message = "Идентификатор обязателен")
        String id,
        @NotBlank(message = "Название обязательно")
        String name,
        @NotBlank(message="Город обязателен")
        String city,

        @NotBlank(message = "Адрес обязателен")
        String address,

        @Pattern(regexp = "^7\\d{10}$", message = "Не допустимый номер телефона")
        String phone
) {
}
