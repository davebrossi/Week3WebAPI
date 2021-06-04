package com.promineotech.jeep.DAO;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public interface JeepSalesDAO {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
