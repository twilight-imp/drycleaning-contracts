package contracts.viewmodel.order;

import jakarta.validation.constraints.NotBlank;


public record OrderEditForm(

        String orderId,

        String userId,

        @NotBlank(message = "Филиал обязателен")
        String branch
){
}
