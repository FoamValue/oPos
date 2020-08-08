package cn.live.opos.center.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cn.live.opos.center.entity.OscOrderEntity;

/**
 * osc_order repository.
 * 
 * @author chenxinjie
 * @date 2020-08-08
 */
public interface OscOrderRepository extends CrudRepository<OscOrderEntity, String> {

  @Query(value = "select t from OscOrderEntity t where t.orderNo = ?1")
  OscOrderEntity findByOrderNo(String orderNo);

}
