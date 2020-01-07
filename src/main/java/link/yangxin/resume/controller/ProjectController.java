package link.yangxin.resume.controller;

import link.yangxin.resume.entity.Project;
import link.yangxin.resume.service.ProjectService;
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
@RequestMapping("/api/project")
public class ProjectController extends BaseController {

    @Resource
    private ProjectService projectService;

    @GetMapping("/list")
    public R<List<Project>> list() {
        return success(projectService.getList());
    }

    @PostMapping("/create")
    public R<Void> create(@RequestBody VRequest<Project> request) {
        projectService.create(request.getParam());
        return success();
    }

}