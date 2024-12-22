package contracts.viewmodel.branch;

import contracts.viewmodel.review.ReviewViewModel;

import java.util.List;

public record BranchViewModel(
        String name,
        String city,
        String address,
        String phone,
        Double rating,

        List<ReviewViewModel> reviews
) {

}
