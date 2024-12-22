package contracts.viewmodel.order;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;

public record OrderPositionCreateForm(
        @NotBlank(message = "Не выбрано изделие")
        String product,

        @NotBlank(message = "Не выбрана услуга")
        String service,

        @Positive(message = "Количество не может быть меньше 1")
        Integer number
) {
}
