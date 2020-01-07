package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.WorkDao;
import link.yangxin.resume.entity.Work;
import link.yangxin.resume.service.WorkService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class WorkServiceImpl implements WorkService {

    @Resource
    private WorkDao workDao;

    @Override
    public JpaRepository<Work, Long> getRepository() {
        return workDao;
    }
}