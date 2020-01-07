package link.yangxin.resume.controller;

import link.yangxin.resume.entity.PersonalInfo;
import link.yangxin.resume.service.PersonalInfoService;
import link.yangxin.resume.vo.R;
import link.yangxin.resume.vo.VRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@RestController
@RequestMapping("/api/personalInfo")
public class PersonalInfoController extends BaseController {

    @Resource
    private PersonalInfoService personalInfoService;

    @GetMapping("/get")
    public R<PersonalInfo> get() {
        PersonalInfo personalInfo = personalInfoService.get();
        return success(personalInfo);
    }

    @PostMapping("/create")
    public R<Void> create(@RequestBody VRequest<PersonalInfo> request) {
        personalInfoService.create(request.getParam());
        return success();
    }

}