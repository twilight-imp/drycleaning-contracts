package contracts.viewmodel.admin.user;

import java.util.List;

public record UserAdminViewModel(
        String id,
        String lastName,
        String name,
        String phone,
        String email,
        String password,
        String city,
        int discount,
        int numOrders,
        List<String> role
) {
}
