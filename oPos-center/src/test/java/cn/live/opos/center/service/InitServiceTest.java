package cn.live.opos.center.service;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.live.opos.center.entity.OscOrderEntity;
import cn.live.opos.center.entity.OscOrderItemEntity;
import cn.live.opos.center.entity.PscSkuEntity;
import cn.live.opos.center.entity.UscGuideEntity;
import cn.live.opos.center.repository.OscOrderItemRepository;
import cn.live.opos.center.repository.OscOrderRepository;
import cn.live.opos.center.repository.PscSkuRepository;
import cn.live.opos.center.repository.UscGuideRepository;

/**
 * init service.
 * 
 * @author chenxinjie
 * @date 2020-08-08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InitServiceTest {

  private static final Logger logger = LoggerFactory.getLogger(InitServiceTest.class);

  @Before
  public void beforeTest() {
    logger.info("InitServiceTest - beforeTest");
  }

  @Autowired
  private OscOrderRepository orderRepository;

  @Autowired
  private OscOrderItemRepository orderItemRepository;
  
  @Test
  public void initInfo() {
    initGuide();
    initSku();
  }

  @Test
  public void initOrder() {
    OscOrderEntity orderEntity;
    OscOrderItemEntity orderItemEntity;
    orderEntity = orderRepository.findByOrderNo("OD202008080001");
    if (orderEntity == null) {
      orderEntity = new OscOrderEntity();
      orderEntity.setOrderNo("OD202008080001");
      orderEntity.setOrderType(1);
      orderEntity.setOrderStatus(1);
      orderEntity.setNum(1);
      orderEntity.setTotal(2500);
      orderEntity.setGuideNo("UG002");
      orderRepository.save(orderEntity);
      
      orderItemEntity = new OscOrderItemEntity();
      orderItemEntity.setOrderNo(orderEntity.getOrderNo());
      orderItemEntity.setSku("TB202000110001000");
      orderItemEntity.setNum(1);
      orderItemEntity.setTagPrice(3000);
      orderItemEntity.setRetailPrice(2500);
      orderItemEntity.setTotal(2500);
      orderItemRepository.save(orderItemEntity);

    }

  }

  @Autowired
  private UscGuideRepository guideRepository;

  @Test
  public void initGuide() {
    UscGuideEntity guideEntity;
    guideEntity = guideRepository.findByNo("UG001");
    if (guideEntity == null) {
      guideEntity = new UscGuideEntity();
      guideEntity.setNo("UG001");
      guideEntity.setName("泰罗奥特曼");
      guideEntity.setGender(1);
      guideEntity.setTs(new Date());
      guideRepository.save(guideEntity);
    }

    guideEntity = guideRepository.findByNo("UG002");
    if (guideEntity == null) {
      guideEntity = new UscGuideEntity();
      guideEntity.setNo("UG002");
      guideEntity.setName("哆啦A梦");
      guideEntity.setGender(1);
      guideEntity.setTs(new Date());
      guideRepository.save(guideEntity);
    }

    guideEntity = guideRepository.findByNo("UG003");
    if (guideEntity == null) {
      guideEntity = new UscGuideEntity();
      guideEntity.setNo("UG003");
      guideEntity.setName("朽木露琪亚");
      guideEntity.setGender(0);
      guideEntity.setTs(new Date());
      guideRepository.save(guideEntity);
    }

  }

  @Autowired
  private PscSkuRepository pscSkuRepository;

  @Test
  public void initSku() {
    PscSkuEntity skuEntity;
    skuEntity = pscSkuRepository.findBySku("TB202000110001000");
    if (skuEntity == null) {
      skuEntity = new PscSkuEntity();
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

    skuEntity = pscSkuRepository.findBySku("TB202000110011001");
    if (skuEntity == null) {
      skuEntity = new PscSkuEntity();
      skuEntity.setSku("TB202000110011001");
      skuEntity.setProductNo("TB2020001");
      skuEntity.setProductName("2020款运动背心");
      skuEntity.setColorNo(1001);
      skuEntity.setColorName("白色");
      skuEntity.setSizeNo(1001);
      skuEntity.setSizeName("170/92A");
      skuEntity.setTagPrice(3000);
      skuEntity.setRetailPrice(2500);
      skuEntity.setTs(new Date());
      pscSkuRepository.save(skuEntity);
    }

    skuEntity = pscSkuRepository.findBySku("TB202000110021002");
    if (skuEntity == null) {
      skuEntity = new PscSkuEntity();
      skuEntity.setSku("TB202000110021002");
      skuEntity.setProductNo("TB2020001");
      skuEntity.setProductName("2020款运动背心");
      skuEntity.setColorNo(1002);
      skuEntity.setColorName("红色");
      skuEntity.setSizeNo(1002);
      skuEntity.setSizeName("160/92A");
      skuEntity.setTagPrice(3000);
      skuEntity.setRetailPrice(2500);
      skuEntity.setTs(new Date());
      pscSkuRepository.save(skuEntity);
    }
  }

}
