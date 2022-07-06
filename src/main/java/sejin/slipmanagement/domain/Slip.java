package sejin.slipmanagement.domain;

import lombok.Data;

@Data
public class Slip {

    private int member_id;
    private int total;
    private int used;
}
