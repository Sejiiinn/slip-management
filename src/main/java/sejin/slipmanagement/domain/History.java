package sejin.slipmanagement.domain;

import lombok.Data;

import java.sql.Date;


@Data
public class History {
    private Date date;
    private String people;
    private String place;
    private int count;
    private int expense;
}
