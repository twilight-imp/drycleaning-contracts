package contracts.viewmodel.user;

import contracts.viewmodel.BaseViewModel;

public record UserProfileViewModel(
        BaseViewModel base,
        String lastName,
        String name,
        String phone,
        String email,
        String city,
        int discount,
        int numOrders
) { }
