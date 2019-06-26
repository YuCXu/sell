package com.xyc.repository;

import com.xyc.domain.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String>{

    SellerInfo findByOpenid(String openid);
}
