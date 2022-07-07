package sejin.slipmanagement.controller;

import lombok.Data;
import sejin.slipmanagement.domain.History;
import sejin.slipmanagement.domain.Member;

@Data
public class SpendDTO {
    private String spend_name;
    private String spend_place;
    private int spend_count;
    private int spend_amount;

    private MemberDTO memberDTO;
    private SlipDTO slipDTO;
    private HistoryDTO historyDTO;
}
