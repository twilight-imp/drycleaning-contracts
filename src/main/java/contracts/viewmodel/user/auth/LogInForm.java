package contracts.viewmodel.user.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record LogInForm(
        @NotBlank(message = "Email обязателен")
        @Email
        String email,

        @Size(min = 8, max = 30, message = "Пароль должен быть от 8 до 30 символов")
        String password
) {
}
