package link.yangxin.resume.cache;

/**
 * @author yangxin
 * @date 2020/1/7
 */
public interface CacheService {

    void put(String key, Object value);

    <T> T get(String key);

    boolean contains(String key);

}
