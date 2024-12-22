package contracts.controllers.admin;

import contracts.viewmodel.admin.branch.form.BranchAdminCreateForm;
import contracts.viewmodel.admin.branch.form.BranchAdminEditForm;
import contracts.controllers.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/branches")
public interface BranchAdminController extends BaseController, BaseAdminController<BranchAdminCreateForm, BranchAdminEditForm>{
}
