package contracts.viewmodel.user;

import contracts.viewmodel.order.OrderPositionViewModel;

import java.util.List;

public record BasketViewModel(
        Integer cost,
        String branchId,
        String branchName,
        String branchCity,
        String branchAddress,
        List<OrderPositionViewModel> orderPositions

) {
}
