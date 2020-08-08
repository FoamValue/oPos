package cn.live.opos.center.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cn.live.opos.center.entity.PscSkuEntity;

/**
 * psc_sku repository.
 * 
 * @author chenxinjie
 * @date 2020-08-08
 */
public interface PscSkuRepository extends CrudRepository<PscSkuEntity, String> {

  @Query(value = "select t from PscSkuEntity t where t.sku = ?1")
  PscSkuEntity findBySku(String sku);
  
  @Query(value = "select t from PscSkuEntity t where t.productNo = ?1 order by t.sku asc")
  List<PscSkuEntity> findByProductNo(String productNo);

}
