package link.yangxin.resume.controller;

import link.yangxin.resume.config.AdminUser;
import link.yangxin.resume.entity.*;
import link.yangxin.resume.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangxin
 * @date 2020/1/3
 */
@Controller
public class IndexController extends BaseController {

    @Resource
    private AdminUser adminUser;

    @Resource
    private PersonalInfoService personalInfoService;

    @Resource
    private EducationService educationService;

    @Resource
    private ProjectService projectService;

    @Resource
    private SkillService skillService;

    @Resource
    private WorkService workService;

    @RequestMapping("/")
    public String index() {
        PersonalInfo personalInfo = personalInfoService.get();
        List<Education> educationList = educationService.getList();
        List<Project> projectList = projectService.getList();
        List<Skill> skillList = skillService.getList();
        List<Work> workList = workService.getList();

        setAttr("person", personalInfo);
        setAttr("educationList", educationList);
        setAttr("projectList", projectList);
        setAttr("skillList", skillList);
        setAttr("workList", workList);
        return "index";
    }

}