package modules.com.github.gaohome123.sys.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import common.base.BaseController;
import modules.com.github.gaohome123.swagger.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author GAOLEI
 * @create 2018-01-21 21:32
 **/
@Controller
@RequestMapping("/menu")
@Api(value="MenuController",description="获取菜单")
public class MenuController  extends BaseController {

    @RequestMapping(value = "list", produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    @ApiOperation(value = "获取菜单", httpMethod = "GET", produces = "application/json, application/xml",response = Menu.class, notes = "获取菜单")
    public Object login(){

        return "[{\n" +
                "\t\"title\" : \"后台首页\",\n" +
                "\t\"icon\" : \"icon-computer\",\n" +
                "\t\"href\" : \"page/main.html\",\n" +
                "\t\"spread\" : false\n" +
                "},{\n" +
                "\t\"title\" : \"文章列表\",\n" +
                "\t\"icon\" : \"icon-text\",\n" +
                "\t\"href\" : \"page/news/newsList.html\",\n" +
                "\t\"spread\" : false\n" +
                "},{\n" +
                "\t\"title\" : \"友情链接\",\n" +
                "\t\"icon\" : \"&#xe64c;\",\n" +
                "\t\"href\" : \"page/links/linksList.html\",\n" +
                "\t\"spread\" : false\n" +
                "},{\n" +
                "\t\"title\" : \"开发API\",\n" +
                "\t\"icon\" : \"&#xe631;\",\n" +
                "\t\"href\" : \"static/swagger/index.html\",\n" +
                "\t\"spread\" : false\n" +
                "},{\n" +
                "\t\"title\" : \"其他页面\",\n" +
                "\t\"icon\" : \"&#xe630;\",\n" +
                "\t\"href\" : \"\",\n" +
                "\t\"spread\" : false,\n" +
                "\t\"children\" : [\n" +
                "\t\t{\n" +
                "\t\t\t\"title\" : \"404页面\",\n" +
                "\t\t\t\"icon\" : \"&#xe61c;\",\n" +
                "\t\t\t\"href\" : \"page/404.html\",\n" +
                "\t\t\t\"spread\" : false\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\" : \"登录\",\n" +
                "\t\t\t\"icon\" : \"&#xe609;\",\n" +
                "\t\t\t\"href\" : \"page/login/login.html\",\n" +
                "\t\t\t\"spread\" : false,\n" +
                "\t\t\t\"target\" : \"_blank\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}]";
    }
}
