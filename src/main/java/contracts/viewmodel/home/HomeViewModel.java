package contracts.viewmodel.home;

import contracts.viewmodel.service.ServiceViewModel;
import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record HomeViewModel(
        BaseViewModel base,
        List<ServiceViewModel> popularServices
) {
}
