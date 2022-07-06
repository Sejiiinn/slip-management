package sejin.slipmanagement.controller;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class SlipDTO {
    private int member_id;
    private int total;
    private int used;
}
