package contracts.viewmodel.admin.product;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record ProductListAdminViewModel(BaseViewModel base,
                                        List<ProductAdminViewModel> products
) {
}
