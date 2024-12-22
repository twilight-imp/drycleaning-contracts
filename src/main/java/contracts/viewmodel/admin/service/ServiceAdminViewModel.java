package contracts.viewmodel.admin.service;

public record ServiceAdminViewModel(
        String id,
        String name,

        String description,

        Integer cost,

        boolean isDeleted
) {
}
