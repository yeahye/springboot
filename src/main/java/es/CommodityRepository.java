package es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yejunnan
 * @version 1.0
 * @className CommodityRepository
 * @date 2020/11/11 16:22
 */
@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String> {

}
