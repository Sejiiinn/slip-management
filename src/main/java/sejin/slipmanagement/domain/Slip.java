package sejin.slipmanagement.domain;

import lombok.Data;

@Data
public class Slip {

    private int memberId;
    private int total;
    private int used;
}
