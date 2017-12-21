package mappings.modules.sys.controller;

import common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gaolei on 2017/12/21.
 */
@Controller
@RequestMapping("/index")
public class index extends BaseController {

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("main")
    public String main(){
        return "/page/main";
    }
}
