package com.intesasanpaolo.cos2noc.cosmodel;

import com.intesasanpaolo.cos2noc.Model;
import com.intesasanpaolo.cos2noc.ModelEntry;
import com.intesasanpaolo.cos2noc.SetModelRequest;
import com.intesasanpaolo.cos2noc.SetModelResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Bomitali Evelino on 15/04/2017.
 */
@Component
public class CosModelUpdater {

    private static Logger logger = LoggerFactory.getLogger(CosModelUpdater.class);

    /*
    @PostConstruct

    public void initData() {
        Logger logger = LoggerFactory.getLogger(CosModelUpdater.class);
    }
    */

    public List<String> setModel (Model model) {
        Assert.notNull(model, "doSomething called with null object");
        Iterator<ModelEntry> iter = model.getEntry().iterator();
        ModelEntry item;
        List<String> res = new ArrayList<String>();

        while (iter.hasNext()) {
            item = iter.next();
            logger.info("Processing entry " + item.getCodiceCanale() + ":" + item.getCodiceBanca() + ":" + item.getBizService());
            res.add(item.getCodiceCanale() + ":" + item.getCodiceBanca() + ":" + item.getBizService() + "->" + "ok");
        }
        return res;
    }
}

