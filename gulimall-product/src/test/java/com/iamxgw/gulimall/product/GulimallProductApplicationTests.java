package com.iamxgw.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iamxgw.gulimall.product.entity.BrandEntity;
import com.iamxgw.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(6L);
//        brandEntity.setName("huawei");
//        brandService.updateById(brandEntity);

//        brandEntity.setName("APPLE");
//        brandService.save(brandEntity);
//        System.out.println("save success...");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item.getBrandId() + " " + item.getShowStatus());
        });
    }
}
