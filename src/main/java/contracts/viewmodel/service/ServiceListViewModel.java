package contracts.viewmodel.service;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record ServiceListViewModel(
        BaseViewModel base,
        List<ServiceViewModel> services
) {
}
