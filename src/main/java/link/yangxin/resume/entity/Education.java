package link.yangxin.resume.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

/**
 * 教育经历
 *
 * @author yangxin
 * @date 2020/1/3
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Education extends BaseEntity {

    // 学校
    private String school;

    // 开始时间
    private Date begin;

    // 结束时间
    private Date end;

    // 学历程度
    private String degree;


}