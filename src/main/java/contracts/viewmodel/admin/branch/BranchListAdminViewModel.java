package contracts.viewmodel.admin.branch;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record BranchListAdminViewModel(
        BaseViewModel base,
        List<BranchAdminViewModel> branches
) {
}
