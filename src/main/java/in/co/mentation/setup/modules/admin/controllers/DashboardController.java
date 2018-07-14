package in.co.mentation.setup.modules.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController extends AdminBaseController {
    @RequestMapping({"/admin/dashboard","/admin"})
    public ModelAndView dashboardAction(ModelAndView mv){
        mv.setViewName("admin/dashboard/dashboard");
        return mv;
    }
}
