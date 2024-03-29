package com.xyc.repository;

import com.xyc.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678910");
        orderDetail.setOrderId("11111112");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("1111113");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(3.5));
        orderDetail.setProductQuantity(5);
        OrderDetail  result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("11111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}