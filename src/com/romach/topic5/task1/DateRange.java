package com.romach.topic5.task1;

import java.util.Date;

public class DateRange {
    private Date startDate;
    private Date endDate;

    public DateRange(){

    }

    public DateRange(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }
}
