package contracts.viewmodel.admin.service;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record ServiceListAdminViewModel(BaseViewModel base,
                                        List<ServiceAdminViewModel> services) {
}
