package link.yangxin.resume;
import java.util.Date;


import link.yangxin.resume.config.AdminUser;
import link.yangxin.resume.dao.PersonalInfoDao;
import link.yangxin.resume.entity.Education;
import link.yangxin.resume.service.EducationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ResumeApplicationTests {

    @Resource
    PersonalInfoDao personalInfoDao;

    @Resource
    private EducationService educationService;

    @Resource
    private AdminUser adminUser;

    @Test
    public void test1(){
        System.out.println(adminUser);
    }

}
