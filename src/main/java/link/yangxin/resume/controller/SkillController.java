package link.yangxin.resume.controller;

import link.yangxin.resume.entity.Project;
import link.yangxin.resume.entity.Skill;
import link.yangxin.resume.service.ProjectService;
import link.yangxin.resume.service.SkillService;
import link.yangxin.resume.vo.R;
import link.yangxin.resume.vo.VRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@RestController
@RequestMapping("/api/skill")
public class SkillController extends BaseController {

    @Resource
    private SkillService skillService;

    @GetMapping("/list")
    public R<List<Skill>> list() {
        return success(skillService.getList());
    }

    @PostMapping("/create")
    public R<Void> create(@RequestBody VRequest<Skill> request) {
        skillService.create(request.getParam());
        return success();
    }

}