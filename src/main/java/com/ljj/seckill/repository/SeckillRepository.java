package com.ljj.seckill.repository;

import com.ljj.seckill.common.entity.Seckill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @CLassName SeckillRepository
 * @Description SeckillRepository
 * @Author LeeJack
 * @Date 2019/4/30/030 22:27
 * @Version 1.0
 */
public interface SeckillRepository extends JpaRepository<Seckill, Long> {
}
