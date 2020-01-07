package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.ProjectDao;
import link.yangxin.resume.entity.Project;
import link.yangxin.resume.service.ProjectService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectDao projectDao;

    @Override
    public JpaRepository<Project, Long> getRepository() {
        return projectDao;
    }
}