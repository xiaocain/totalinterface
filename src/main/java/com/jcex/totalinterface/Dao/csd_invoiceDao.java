package com.jcex.totalinterface.Dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.jcex.totalinterface.Entity.csd_invoice;

public interface csd_invoiceDao {

    int insert(@Param("pojo") csd_invoice pojo);

    int insertList(@Param("pojos") List< csd_invoice> pojo);

    List<csd_invoice> select(@Param("pojo") csd_invoice pojo);

    int update(@Param("pojo") csd_invoice pojo);

}
