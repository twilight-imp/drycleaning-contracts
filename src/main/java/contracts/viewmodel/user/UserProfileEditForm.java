package contracts.viewmodel.user;


import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record UserProfileEditForm(

        @NotBlank(message = "Фамилия обязательна")
        String lastName,

        @NotBlank(message = "Имя обязательно")
        String name,


        @Pattern(regexp = "^7\\d{10}$", message = "Не допустимый номер телефона")
        String phone,

        @NotBlank(message = "E-mail обязателен")
        @Email(message = "Недействительный e-mail")
        String email,

        @NotBlank(message = "Город обязателен")
        String city,

        String password,

        @Pattern(regexp = "^$|.{8,30}", message = "Пароль должен быть от 8 до 30 символов")
        String newPassword


) {
}
