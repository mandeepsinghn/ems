package in.co.mentation.setup.modules.admin.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Calendar;

public class AdminBaseController {
    @ModelAttribute
    public void setCommonViewModel(Model model){
        model.addAttribute("currentyear",Calendar.getInstance().get(Calendar.YEAR));
    }
}
