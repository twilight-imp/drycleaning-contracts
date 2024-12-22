package contracts.controllers.admin;

import contracts.controllers.BaseController;
import contracts.viewmodel.admin.product.form.ProductAdminCreateFrom;
import contracts.viewmodel.admin.product.form.ProductAdminEditForm;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/products")
public interface ProductAdminController extends BaseController,BaseAdminController<ProductAdminCreateFrom, ProductAdminEditForm> {
}
