package cn.live.opos.center.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cn.live.opos.center.entity.UscGuideEntity;

/**
 * usc_guide repository.
 * 
 * @author chenxinjie
 * @date 2020-08-08
 */
public interface UscGuideRepository extends CrudRepository<UscGuideEntity, String> {

  @Query(value = "select t from UscGuideEntity t where t.no = ?1")
  UscGuideEntity findByNo(String no);

}
