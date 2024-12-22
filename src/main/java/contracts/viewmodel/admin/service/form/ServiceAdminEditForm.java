package contracts.viewmodel.admin.service.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;

public record ServiceAdminEditForm(
        @NotBlank(message = "Идентификатор обязателен")
        String id,
        @NotBlank(message = "Название обязательно")
        String name,

        @NotBlank(message = "Описание обязательно")
        String description,

        @NotNull(message = "Стоимость обязательна")
        @Positive(message = "Стоимость не может быть меньше 0")
        Integer cost
) {
}
