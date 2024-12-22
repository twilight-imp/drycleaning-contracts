package contracts.viewmodel.order;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record OrderUserViewModel(
        BaseViewModel base,
        List<OrderViewModel> orders
) {
}
