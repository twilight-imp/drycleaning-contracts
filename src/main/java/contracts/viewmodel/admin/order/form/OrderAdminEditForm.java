package contracts.viewmodel.admin.order.form;

import jakarta.validation.constraints.NotBlank;


public record OrderAdminEditForm(


        String id,
        String branchId,
//
//        @NotBlank(message = "Пользователь обязателен")
//        String userId,

        @NotBlank(message = "Статус обязателен")
        String orderStatus
) {
}
