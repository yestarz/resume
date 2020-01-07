package link.yangxin.resume.service;

import link.yangxin.resume.entity.PersonalInfo;

/**
 * @author yangxin
 * @date 2020/1/3
 */
public interface PersonalInfoService {

    void create(PersonalInfo personalInfo);

    PersonalInfo get();

}
