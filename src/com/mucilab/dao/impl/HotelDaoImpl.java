package com.mucilab.dao.impl;

import com.mucilab.dao.HotelDao;
import com.mucilab.entities.HotelEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * Created by 9ian1i on 2017/6/24.
 */
public class HotelDaoImpl implements HotelDao{
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public List<HotelEntity> getList() {
        List<HotelEntity> list = (List<HotelEntity>) hibernateTemplate.find("from HotelEntity");
        return list;
    }
}
