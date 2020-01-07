package link.yangxin.resume.service;

import link.yangxin.resume.entity.BaseEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * @author yangxin
 * @date 2020/1/6
 */
public interface BaseService<T extends BaseEntity, ID> {

    JpaRepository<T, ID> getRepository();

    default void create(T t) {
        boolean create = t.getId() == null;
        if (!create) {
            t.setUpdateTime(new Date());
        } else {
            t.setCreateTime(new Date());
        }
        getRepository().save(t);
    }

    default void singleCreate(T t) {
        T record = this.findOne();
        boolean create = record == null;
        if (!create) {
            BeanUtils.copyProperties(t, record);
            record.setUpdateTime(new Date());
            getRepository().save(record);
        } else {
            t.setCreateTime(new Date());
            getRepository().save(t);
        }
    }

    default T findOne() {
        List<T> all = getRepository().findAll();
        if (all == null || all.isEmpty()) {
            return null;
        }
        return all.get(0);
    }

    default List<T> getList() {
        return getRepository().findAll();
    }

}