package contracts.viewmodel.admin.product.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;

public record ProductAdminEditForm(
        @NotBlank(message = "Идентификатор обязателен")
        String id,
        @NotBlank(message = "Название обязательно")
        String name,
        @NotBlank(message = "Материал обязателен")
        String material,
        @NotNull(message = "Стоимость обязательна")
        @Positive(message = "Стоимость не может быть меньше 0")
        Integer extraCharge,
        @NotNull(message = "Тип изделия обязателен")
        String typeProductId
) {
}
