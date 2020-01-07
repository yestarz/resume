package link.yangxin.resume.service.impl;

import link.yangxin.resume.dao.PersonalInfoDao;
import link.yangxin.resume.entity.PersonalInfo;
import link.yangxin.resume.service.PersonalInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author yangxin
 * @date 2020/1/3
 */
@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {

    @Resource
    private PersonalInfoDao personalInfoDao;

    @Override
    public void create(PersonalInfo personalInfo) {
        PersonalInfo data = personalInfoDao.find();
        if (data != null) {
            BeanUtils.copyProperties(personalInfo, data);
            data.setUpdateTime(new Date());
            personalInfoDao.save(data);
        } else {
            personalInfo.setCreateTime(new Date());
            personalInfoDao.save(personalInfo);
        }
    }

    @Override
    public PersonalInfo get() {
        return personalInfoDao.find();
    }
}