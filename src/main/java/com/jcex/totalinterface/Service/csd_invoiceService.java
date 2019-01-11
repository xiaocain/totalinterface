package com.jcex.totalinterface.Service;

import com.jcex.totalinterface.Entity.csd_invoice;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.jcex.totalinterface.Dao.csd_invoiceDao;

@Service
public class csd_invoiceService {

    @Resource
    private csd_invoiceDao csd_invoiceDao;

    public int insert(csd_invoice pojo){
        return csd_invoiceDao.insert(pojo);
    }

    public int insertList(List< csd_invoice> pojos){
        return csd_invoiceDao.insertList(pojos);
    }

    public List<csd_invoice> select(csd_invoice pojo){
        return csd_invoiceDao.select(pojo);
    }

    public int update(csd_invoice pojo){
        return csd_invoiceDao.update(pojo);
    }

}
