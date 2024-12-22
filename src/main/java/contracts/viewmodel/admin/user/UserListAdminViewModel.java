package contracts.viewmodel.admin.user;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record UserListAdminViewModel(
        BaseViewModel base,
        List<UserAdminViewModel> users) {
}
