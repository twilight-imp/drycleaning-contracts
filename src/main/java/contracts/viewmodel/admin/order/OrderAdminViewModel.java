package contracts.viewmodel.admin.order;

import contracts.viewmodel.admin.branch.BranchAdminViewModel;


import java.time.LocalDate;
import java.util.List;

public record OrderAdminViewModel(
        String id,
        String user,
        BranchAdminViewModel branch,
        LocalDate date,
        String orderStatus,
        Integer finalPrice,
        List<OrderPositionAdminViewModel> positions,
        String comment,
        Integer score
) {
}
