package contracts.viewmodel.review;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record ReviewCreateForm(
        String comment,

        @Min(value = 0, message = "Оценка не может быть меньше 0")
        @Max(value = 5, message = "Оценка не может быть больше 5")
        int score
) {
}
