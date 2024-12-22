package contracts.viewmodel.admin.order;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record OrderListAdminViewModel(
        BaseViewModel base,
        List<OrderAdminViewModel> orders) {
}
