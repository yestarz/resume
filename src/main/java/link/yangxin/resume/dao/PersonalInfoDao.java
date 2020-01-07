package link.yangxin.resume.dao;

import link.yangxin.resume.entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author yangxin
 * @date 2020/1/3
 */
@Repository
public interface PersonalInfoDao extends JpaRepository<PersonalInfo, Long> {

    @Query(value = "select * from personal_info limit 1",nativeQuery = true)
    PersonalInfo find();

}