package contracts.viewmodel.admin.user.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record UserAdminCreateForm(
        @NotBlank(message = "Фамилия обязательна")
        String lastName,

        @NotBlank(message = "Имя обязательно")
        String name,

        @NotBlank(message = "Телефон обязателен")
        String phone,

        @NotBlank(message = "E-mail обязателен")
        @Email(message = "Недействительный e-mail")
        String email,

        @NotBlank(message = "Город обязателен")
        String city,

        @Size(min = 8, max = 30, message = "Пароль должен быть от 8 до 30 символов")
        String password
) {

}
