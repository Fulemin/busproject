package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.example.ReLineExample;
import com.mashensoft.bus.mapper.LineBusMapper;
import com.mashensoft.bus.mapper.LineMapper;
import com.mashensoft.bus.mapper.LineUptownMapper;
import com.mashensoft.bus.model.*;
import com.mashensoft.bus.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class LineServiceImpl implements LineService {
    @Autowired
    LineMapper lineMapper;
    @Autowired
    LineBusMapper lineBusMapper;
    @Autowired
    LineUptownMapper lineUptownMapper;


    @Override
    public List selectWorkGoOutLine(Integer uptownId) {


        List re = new ArrayList<ReLineExample>();

        LineExample lineExample = new LineExample();
        List<Line> lineList = lineMapper.selectByExample(lineExample);


        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineDateEqualTo(1).andLineDirectionEqualTo(1);
        List<LineBus> lineBusList = lineBusMapper.selectByExample(lineBusExample);


        LineUptownExample lineUptownExample = new LineUptownExample();
        lineUptownExample.createCriteria().andUptownIdEqualTo(uptownId);
        List<LineUptown> lineUptownList = lineUptownMapper.selectByExample(lineUptownExample);


        for (int i = 0; i < lineUptownList.size(); i++) {
            ReLineExample reLineExample = new ReLineExample();


            for(int item = 0 ; item < lineList.size();item++){
                if (lineUptownList.get(i).getLineId() == lineList.get(item).getLineId()){
                    reLineExample.setUptownId(lineUptownList.get(i).getLineUptownId());//注入UptownId
                    reLineExample.setLineId(lineList.get(item).getLineId());//注入lineID
                    reLineExample.setLineName(lineList.get(item).getLineName());//注入LineName
                    reLineExample.setLineOrigin(lineList.get(item).getLineOrigin());//注入LineOrigin（线路起点）
                    reLineExample.setLineDestination(lineList.get(item).getLineDestination());//注入lineLineDestination（线路终点）
                    reLineExample.setLineMoney(lineList.get(item).getLineMoney());//注入LineMoney()（线路金额）
                    List Linetime = new ArrayList();
                    for (int item2 = 0 ; item2 < lineBusList.size() ; item2++){
                        if(lineBusList.get(item2).getLineId() == lineList.get(item).getLineId()){
                            Linetime.add(lineBusList.get(item2).getLineTime());
                            reLineExample.setLineDate(lineBusList.get(item2).getLineDate());
                            reLineExample.setLineDirection(lineBusList.get(item2).getLineDirection());

                        }
                    }
                    reLineExample.setLineTime(Linetime);
                }
            }

            if(reLineExample.getLineDate() != null){
                re.add(reLineExample);
            }
        }
        return re;
    }

    @Override
    public List selectWorkGoBackLine(Integer uptownId) {


        List re = new ArrayList<ReLineExample>();

        LineExample lineExample = new LineExample();
        List<Line> lineList = lineMapper.selectByExample(lineExample);


        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineDateEqualTo(1).andLineDirectionEqualTo(2);
        List<LineBus> lineBusList = lineBusMapper.selectByExample(lineBusExample);


        LineUptownExample lineUptownExample = new LineUptownExample();
        lineUptownExample.createCriteria().andUptownIdEqualTo(uptownId);
        List<LineUptown> lineUptownList = lineUptownMapper.selectByExample(lineUptownExample);


        for (int i = 0; i < lineUptownList.size(); i++) {
            ReLineExample reLineExample = new ReLineExample();



            for(int item = 0 ; item < lineList.size();item++){
                if (lineUptownList.get(i).getLineId() == lineList.get(item).getLineId()){
                    reLineExample.setUptownId(lineUptownList.get(i).getLineUptownId());//注入UptownId
                    reLineExample.setLineId(lineList.get(item).getLineId());//注入lineID
                    reLineExample.setLineName(lineList.get(item).getLineName());//注入LineName
                    reLineExample.setLineOrigin(lineList.get(item).getLineOrigin());//注入LineOrigin（线路起点）
                    reLineExample.setLineDestination(lineList.get(item).getLineDestination());//注入lineLineDestination（线路终点）
                    reLineExample.setLineMoney(lineList.get(item).getLineMoney());//注入LineMoney()（线路金额）
                    List Linetime = new ArrayList();
                    for (int item2 = 0 ; item2 < lineBusList.size() ; item2++){
                        if(lineBusList.get(item2).getLineId() == lineList.get(item).getLineId()){
                            Linetime.add(lineBusList.get(item2).getLineTime());
                            reLineExample.setLineDate(lineBusList.get(item2).getLineDate());
                            reLineExample.setLineDirection(lineBusList.get(item2).getLineDirection());
                        }
                    }
                    reLineExample.setLineTime(Linetime);
                }
            }

            if(reLineExample.getLineDate() != null){
                re.add(reLineExample);
            }
        }
        return re;
    }

    @Override
    public List selectWeekendGoOutLine(Integer uptownId) {


        List re = new ArrayList<ReLineExample>();

        LineExample lineExample = new LineExample();
        List<Line> lineList = lineMapper.selectByExample(lineExample);


        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineDateEqualTo(2).andLineDirectionEqualTo(1);
        List<LineBus> lineBusList = lineBusMapper.selectByExample(lineBusExample);


        LineUptownExample lineUptownExample = new LineUptownExample();
        lineUptownExample.createCriteria().andUptownIdEqualTo(uptownId);
        List<LineUptown> lineUptownList = lineUptownMapper.selectByExample(lineUptownExample);


        for (int i = 0; i < lineUptownList.size(); i++) {
            ReLineExample reLineExample = new ReLineExample();



            for(int item = 0 ; item < lineList.size();item++){
                if (lineUptownList.get(i).getLineId() == lineList.get(item).getLineId()){
                    reLineExample.setUptownId(lineUptownList.get(i).getLineUptownId());//注入UptownId
                    reLineExample.setLineId(lineList.get(item).getLineId());//注入lineID
                    reLineExample.setLineName(lineList.get(item).getLineName());//注入LineName
                    reLineExample.setLineOrigin(lineList.get(item).getLineOrigin());//注入LineOrigin（线路起点）
                    reLineExample.setLineDestination(lineList.get(item).getLineDestination());//注入lineLineDestination（线路终点）
                    reLineExample.setLineMoney(lineList.get(item).getLineMoney());//注入LineMoney()（线路金额）
                    List Linetime = new ArrayList();
                    for (int item2 = 0 ; item2 < lineBusList.size() ; item2++){
                        if(lineBusList.get(item2).getLineId() == lineList.get(item).getLineId()){
                            Linetime.add(lineBusList.get(item2).getLineTime());
                            reLineExample.setLineDate(lineBusList.get(item2).getLineDate());
                            reLineExample.setLineDirection(lineBusList.get(item2).getLineDirection());
                        }
                    }
                    reLineExample.setLineTime(Linetime);
                }
            }

            if(reLineExample.getLineDate() != null){
                re.add(reLineExample);
            }
        }
        return re;
    }

    @Override
    public List selectWeekendGoBackLine(Integer uptownId) {


        List re = new ArrayList<ReLineExample>();

        LineExample lineExample = new LineExample();
        List<Line> lineList = lineMapper.selectByExample(lineExample);


        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineDateEqualTo(2).andLineDirectionEqualTo(2);
        List<LineBus> lineBusList = lineBusMapper.selectByExample(lineBusExample);


        LineUptownExample lineUptownExample = new LineUptownExample();
        lineUptownExample.createCriteria().andUptownIdEqualTo(uptownId);
        List<LineUptown> lineUptownList = lineUptownMapper.selectByExample(lineUptownExample);


        for (int i = 0; i < lineUptownList.size(); i++) {
            ReLineExample reLineExample = new ReLineExample();



            for(int item = 0 ; item < lineList.size();item++){
                if (lineUptownList.get(i).getLineId() == lineList.get(item).getLineId()){
                    reLineExample.setUptownId(lineUptownList.get(i).getLineUptownId());//注入UptownId
                    reLineExample.setLineId(lineList.get(item).getLineId());//注入lineID
                    reLineExample.setLineName(lineList.get(item).getLineName());//注入LineName
                    reLineExample.setLineOrigin(lineList.get(item).getLineOrigin());//注入LineOrigin（线路起点）
                    reLineExample.setLineDestination(lineList.get(item).getLineDestination());//注入lineLineDestination（线路终点）
                    reLineExample.setLineMoney(lineList.get(item).getLineMoney());//注入LineMoney()（线路金额）
                    List Linetime = new ArrayList();
                    for (int item2 = 0 ; item2 < lineBusList.size() ; item2++){
                        if(lineBusList.get(item2).getLineId() == lineList.get(item).getLineId()){
                            Linetime.add(lineBusList.get(item2).getLineTime());
                            reLineExample.setLineDate(lineBusList.get(item2).getLineDate());
                            reLineExample.setLineDirection(lineBusList.get(item2).getLineDirection());
                        }
                    }
                    reLineExample.setLineTime(Linetime);
                }
            }
            if(reLineExample.getLineDate() != null){
                re.add(reLineExample);
            }

        }
        return re;
    }

    @Override
    public Map<String, Object> getCarObjectMap(String time, String deriection) {
        return null;
    }

    @Override
    public List<LineBus> selectIdByTime(LineBus lineBus) {
        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineTimeEqualTo(lineBus.getLineTime()).andLineIdEqualTo(lineBus.getLineId()).andLineDateEqualTo(lineBus.getLineDate()).andLineDirectionEqualTo(lineBus.getLineDirection());
        return lineBusMapper.selectByExample(lineBusExample);
    }

}
