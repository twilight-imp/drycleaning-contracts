package contracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/branches")
public interface BranchController extends BaseController{
    @GetMapping
    String listBranchesByRating(Principal principal,Model model);

}