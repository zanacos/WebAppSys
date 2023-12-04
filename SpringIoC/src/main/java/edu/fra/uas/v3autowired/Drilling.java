package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.v2setter.MasterV2;

@Component
public class Drilling implements Work{
    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);
    
    public static Logger getLogger() {
        return LOGGER;
    }
    @Autowired
    private MasterV3 masterV3;
    masterV3.delagateWork();

    MasterV2 masterV2 = new MasterV2 ();
    masterV2.setJourneymanAndWork(new Journeyman(), new Drilling());
    masterv2.delagateWork();
    
public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");
    }
    public MasterV3 getMasterV3() {
        return masterV3;
    }
    public void setMasterV3(MasterV3 masterV3) {
        this.masterV3 = masterV3;
    }
}
