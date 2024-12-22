package contracts.viewmodel.admin.product;

public record ProductAdminViewModel(
        String id,
        String name,

        String material,

        Integer extraCharge,

        String typeProductId
) {
}
