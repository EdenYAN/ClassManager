package com.mucilab.service.impl;

import com.mucilab.dao.HotelDao;
import com.mucilab.entities.HotelEntity;
import com.mucilab.service.HotelService;

import java.util.List;

/**
 * Created by 9ian1i on 2017/6/24.
 */
public class HotelServiceImpl implements HotelService {

    private HotelDao hotelDao;
    public void setHotelDao(HotelDao hotelDao){
        this.hotelDao=hotelDao;
    }

    @Override
    public List<HotelEntity> getList() {
        return hotelDao.getList();
    }
}
