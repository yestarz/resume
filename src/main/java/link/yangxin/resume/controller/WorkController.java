package link.yangxin.resume.controller;

import link.yangxin.resume.entity.Project;
import link.yangxin.resume.entity.Work;
import link.yangxin.resume.service.ProjectService;
import link.yangxin.resume.service.WorkService;
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
@RequestMapping("/api/work")
public class WorkController extends BaseController {

    @Resource
    private WorkService workService;

    @GetMapping("/list")
    public R<List<Work>> list() {
        return success(workService.getList());
    }

    @PostMapping("/create")
    public R<Void> create(@RequestBody VRequest<Work> request) {
        workService.create(request.getParam());
        return success();
    }

}