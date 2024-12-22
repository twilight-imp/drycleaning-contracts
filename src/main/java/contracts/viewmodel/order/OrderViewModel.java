package contracts.viewmodel.order;

import contracts.viewmodel.BaseViewModel;
import contracts.viewmodel.branch.BranchViewModel;

import java.time.LocalDate;
import java.util.List;

public record OrderViewModel(
        String id,
        Integer cost,
        String branchId,
        String branchName,
        String branchCity,
        String branchAddress,
        LocalDate date,
        String status,
        boolean hasReview,
        List<OrderPositionViewModel> orderPositions

) {
}
