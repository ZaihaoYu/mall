//package com.mall.ecmall.order.service.impl;
//
//import org.springframework.stereotype.Service;
//import java.util.Map;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.mall.common.utils.PageUtils;
//import com.mall.common.utils.Query;
//
//
//import com.mall.ecmall.order.dao.UndoLogDao;
//import com.mall.ecmall.order.entity.UndoLogEntity;
//import com.mall.ecmall.order.service.UndoLogService;
//
//
//@Service("undoLogService")
//public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLogEntity> implements UndoLogService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UndoLogEntity> page = this.page(
//                new Query<UndoLogEntity>().getPage(params),
//                new QueryWrapper<UndoLogEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}