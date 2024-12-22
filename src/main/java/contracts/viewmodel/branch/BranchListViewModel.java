package contracts.viewmodel.branch;

import contracts.viewmodel.BaseViewModel;

import java.util.List;

public record BranchListViewModel(
        BaseViewModel base,
        List<BranchViewModel> branches
){ }
