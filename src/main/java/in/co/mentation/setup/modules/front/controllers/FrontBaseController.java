package in.co.mentation.setup.modules.front.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class FrontBaseController {
    @ModelAttribute
    public void setCommonData(Model model){
        model.addAttribute("msn","Mandeep Singh Nain");
    }
}
