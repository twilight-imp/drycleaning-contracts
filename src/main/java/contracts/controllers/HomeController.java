package contracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface HomeController extends BaseController{
    @GetMapping
    String index(Model model); //топ 5 популярных услуг за 3 месяца

}
