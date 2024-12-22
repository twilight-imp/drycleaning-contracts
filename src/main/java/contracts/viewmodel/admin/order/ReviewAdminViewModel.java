package contracts.viewmodel.admin.order;

public record ReviewAdminViewModel(
        String reviewId,
        String comment,
        int score,
        String orderId
) {
}
