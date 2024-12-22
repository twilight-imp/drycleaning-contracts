package contracts.viewmodel.order;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

public record OrderCreateForm(

        @NotBlank(message = "Филиал обязателен")
        String branch,
        @NotEmpty(message = "Корзина пуста")
        Set<OrderPositionCreateForm> orderPositions
) {
}
