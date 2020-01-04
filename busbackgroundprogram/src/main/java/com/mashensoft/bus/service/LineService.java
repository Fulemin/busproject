package com.mashensoft.bus.service;

import com.mashensoft.bus.model.LineBus;

import java.util.List;
import java.util.Map;

public interface LineService {
    public List selectWorkGoOutLine(Integer uptownId);
    public List selectWorkGoBackLine(Integer uptownId);
    public List selectWeekendGoOutLine(Integer uptownId);
    public List selectWeekendGoBackLine(Integer uptownId);
    public Map<String, Object> getCarObjectMap(String time, String deriection);
    public List<LineBus> selectIdByTime(LineBus lineBus);
}
