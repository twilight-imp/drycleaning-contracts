package contracts.viewmodel.product;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record ProductListViewModel(
        BaseViewModel base,
        List<ProductViewModel> products

) {
}
