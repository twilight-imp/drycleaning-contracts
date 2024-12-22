package contracts.viewmodel.admin.order;

public record OrderPositionAdminViewModel(
        String id,
        String product,
        String material,
        String service,
        Integer number,
        Integer amount
) {
}
