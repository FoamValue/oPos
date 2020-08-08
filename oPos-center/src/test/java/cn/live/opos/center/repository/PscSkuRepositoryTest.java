package cn.live.opos.center.repository;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.live.opos.center.entity.PscSkuEntity;

/**
 * PscSkuRepository Test Class.
 *
 * @author chenxinjie
 * @date 2020-08-08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PscSkuRepositoryTest {

  private static final Logger logger = LoggerFactory.getLogger(PscSkuRepositoryTest.class);

  @Before
  public void beforeTest() {
    logger.info("PscSkuRepositoryTest - beforeTest");
  }

  @Autowired
  private PscSkuRepository pscSkuRepository;

  @Test
  public void insertTest() {
    PscSkuEntity skuEntity = new PscSkuEntity();
    skuEntity.setSku("TB202000110001000");
    skuEntity.setProductNo("TB2020001");
    skuEntity.setProductName("2020款运动背心");
    skuEntity.setColorNo(1000);
    skuEntity.setColorName("黑色");
    skuEntity.setSizeNo(1000);
    skuEntity.setSizeName("180/92A");
    skuEntity.setTagPrice(3000);
    skuEntity.setRetailPrice(2500);
    skuEntity.setTs(new Date());
    pscSkuRepository.save(skuEntity);
  }

  @Test
  public void selectTest() {
    Iterable<PscSkuEntity> findAll = pscSkuRepository.findAll();
    findAll.forEach(entity -> logger.info(String.format("id: %s, sku: %s, productNo: %s",
        entity.getId(), entity.getSku(), entity.getProductNo())));
  }

  @Test
  public void findBySku() {
    PscSkuEntity entity = pscSkuRepository.findBySku("TB202000110001000");
    logger.info(
        String.format("id: %s, sku: %s, productNo: %s", 
            entity.getId(), 
            entity.getSku(),
            entity.getProductNo()));
  }

  @Test
  public void findByProductNo() {
    List<PscSkuEntity> findBySku = pscSkuRepository.findByProductNo("TB2020001");
    findBySku.forEach(entity -> logger.info(String.format("id: %s, sku: %s, productNo: %s",
        entity.getId(), entity.getSku(), entity.getProductNo())));

  }
}
