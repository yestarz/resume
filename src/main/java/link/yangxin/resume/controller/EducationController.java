package link.yangxin.resume.controller;

import link.yangxin.resume.entity.Education;
import link.yangxin.resume.service.EducationService;
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
@RequestMapping("/api/education")
public class EducationController extends BaseController {

    @Resource
    private EducationService educationService;

    @GetMapping("/list")
    public R<List<Education>> list(){
        List<Education> list = educationService.getList();
        return success(list);
    }

    @PostMapping("/create")
    public R<Void> create(@RequestBody VRequest<Education> request) {
        educationService.create(request.getParam());
        return success();
    }

}