package in.co.mentation.setup.modules.front.controllers;

import in.co.mentation.setup.common.enums.UserStatus;
import in.co.mentation.setup.models.entities.UserEntity;
import in.co.mentation.setup.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Controller
public class HomeController extends FrontBaseController{

    @Autowired
    protected UserRepository userModel;

    @GetMapping("/")
    public ModelAndView index(ModelAndView mv){
         System.out.print(userModel.count());
//         UserEntity ue=new UserEntity();
//         ue.username="mandeepsinghn";
//         ue.password="master";
//         ue.status=UserStatus.ACTIVE;
//         userModel.save(ue);
        mv.setViewName("front/home/index");
        Calendar.getInstance().get(Calendar.YEAR);
        return mv;
    }

}
