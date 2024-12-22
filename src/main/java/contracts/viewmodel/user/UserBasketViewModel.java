package contracts.viewmodel.user;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record UserBasketViewModel(
        BaseViewModel base,
        BasketViewModel order) {
}

