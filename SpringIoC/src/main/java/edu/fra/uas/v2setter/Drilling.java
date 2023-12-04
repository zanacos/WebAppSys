package edu.fra.uas.v2setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Drilling implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);
   

    MasterV2 masterV2 = new MasterV2 ();
    masterV2.setJourneymanAndWork(new Journeyman(), new Drilling());
    
    masterV2.delegateWork();

    public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");
    }
}
