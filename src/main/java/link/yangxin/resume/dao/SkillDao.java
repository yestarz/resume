package link.yangxin.resume.dao;

import link.yangxin.resume.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangxin
 * @date 2020/1/3
 */
@Repository
public interface SkillDao extends JpaRepository<Skill,Long> {
}
