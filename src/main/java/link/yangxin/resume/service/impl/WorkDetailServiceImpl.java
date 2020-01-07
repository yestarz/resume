package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.WorkDetailDao;
import link.yangxin.resume.entity.WorkDetail;
import link.yangxin.resume.service.WorkDetailService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class WorkDetailServiceImpl implements WorkDetailService {

    @Resource
    private WorkDetailDao workDetailDao;

    @Override
    public JpaRepository<WorkDetail, Long> getRepository() {
        return workDetailDao;
    }
}