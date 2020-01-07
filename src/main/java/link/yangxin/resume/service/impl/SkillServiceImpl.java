package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.SkillDao;
import link.yangxin.resume.entity.Skill;
import link.yangxin.resume.service.SkillService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class SkillServiceImpl implements SkillService {

    @Resource
    private SkillDao skillDao;

    @Override
    public JpaRepository<Skill, Long> getRepository() {
        return skillDao;
    }
}