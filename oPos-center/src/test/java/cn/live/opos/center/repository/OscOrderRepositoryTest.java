package cn.live.opos.center.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.live.opos.center.entity.OscOrderEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OscOrderRepositoryTest {

  private static final Logger logger = LoggerFactory.getLogger(OscOrderRepositoryTest.class);

  @Before
  public void beforeTest() {
    logger.info("OscOrderRepositoryTest - beforeTest");
  }

  @Autowired
  private OscOrderRepository orderRepository;
  
  @Test
  public void findByOrderNo() {
    OscOrderEntity findByOrderNo = orderRepository.findByOrderNo("OD202008080001");
    if (findByOrderNo != null) {
      logger.info(String.format("orderNo: %s, guideNo: %s, guideName: %s, orderItemSize: %s, orderItemSku: %s, productName: %s", 
          findByOrderNo.getOrderNo(),
          findByOrderNo.getGuideNo(),
          findByOrderNo.getGuideEntity().getName(),
          findByOrderNo.getOrderItems().size(),
          findByOrderNo.getOrderItems().get(0).getSku(),
          findByOrderNo.getOrderItems().get(0).getSkuEntity().getProductName()
          ));
      
    }
  }

}
