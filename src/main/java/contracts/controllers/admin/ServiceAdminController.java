package contracts.controllers.admin;

import contracts.controllers.BaseController;
import contracts.viewmodel.admin.service.form.ServiceAdminCreateForm;
import contracts.viewmodel.admin.service.form.ServiceAdminEditForm;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/services")
public interface ServiceAdminController extends BaseController, BaseAdminController<ServiceAdminCreateForm, ServiceAdminEditForm> {
}
