package org.launchcode.Controllers;

import org.launchcode.models.data.TimeSlotsDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TimeSlotsController {

    @Autowired
    private TimeSlotsDao timeSlotDao;
}
