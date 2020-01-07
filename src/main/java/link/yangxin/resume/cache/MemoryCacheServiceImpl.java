package link.yangxin.resume.cache;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class MemoryCacheServiceImpl implements CacheService {

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    @Override
    public void put(String key, Object value) {
        map.put(key, value);
    }

    @Override
    public <T> T get(String key) {
        return (T) map.get(key);
    }

    @Override
    public boolean contains(String key) {
        if (key == null) {
            return false;
        }
        return map.containsKey(key);
    }
}