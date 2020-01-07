package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.EducationDao;
import link.yangxin.resume.entity.Education;
import link.yangxin.resume.service.EducationService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/6
 */
@Service
public class EducationServiceImpl implements EducationService {

    @Resource
    private EducationDao educationDao;

    @Override
    public JpaRepository<Education, Long> getRepository() {
        return educationDao;
    }
}