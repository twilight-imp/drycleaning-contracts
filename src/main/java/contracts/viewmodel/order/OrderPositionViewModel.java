package contracts.viewmodel.order;

public record OrderPositionViewModel(
        String id,
        String product,
        String material,
        String service,

        Integer number,

        Integer amount
) {

}
