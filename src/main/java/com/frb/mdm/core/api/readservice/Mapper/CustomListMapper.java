package com.frb.mdm.core.api.readservice.Mapper;

import com.frb.mdm.core.api.readservice.Model.MDMResponse.PrtyIDItem;
import com.frb.mdm.core.api.readservice.controller.HomeController;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Mapper
public abstract class CustomListMapper {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private PartyMappersRepository repository = Mappers.getMapper(PartyMappersRepository.class);

    public <Source, Target> List<Target> map(Class<Source> sourceClass, List<Source> sourceList, String CallbackFn) throws NoSuchMethodException {
        Method dynamicMethod = repository.getClass().getMethod(CallbackFn);
//        PartyMappersRepository.class.getMethod(CallbackFn, PrtyIDItem.class);
        List<Target> outputList = new ArrayList<Target>();
        sourceList.forEach(item -> {
            try {
                outputList.add((Target) dynamicMethod.invoke(item));
            } catch (IllegalAccessException e) {
                logger.error(e.getMessage());
            } catch (InvocationTargetException e) {
                logger.error(e.getMessage());
            }
        });
        return outputList;
    }
}
