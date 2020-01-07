package link.yangxin.resume.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 项目经验
 *
 * @author yangxin
 * @date 2020/1/3
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Project extends BaseEntity{

    private String projectName;

    // 开始时间
    private Date begin;

    // 结束时间 不填则为至今
    private Date end;

    // 技术
    private String technology;

    // 项目描述，项目介绍
    private String projectDescription;

    // 个人承担的工作
    private String selfWork;

    // 团队人数介绍
    private String team;

    // 项目地址
    private String projectUrl;

}