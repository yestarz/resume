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
 * 工作详情，主要记录工作内容
 *
 * @author yangxin
 * @date 2020/1/3
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class WorkDetail extends BaseEntity{

    // 工作id
    private Long workId;

    // 工作内容
    private String content;


}