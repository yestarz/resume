package link.yangxin.resume.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author yangxin
 * @date 2020/1/3
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class PersonalInfo extends BaseEntity {

    private String name;

    private String gender;

    private Integer age;

    private String job;

    private String salary;

    private String address;

    private String mobile;

    private String email;

    private String personalIndexPage;

    private String userIcon;

    private String github;

    private String selfComment;

    // 浏览量
    private Long viewCount;

    // 最后构建日期
    private Date lastBuildTime;

    private Date createTime;

    private Date updateTime;

}