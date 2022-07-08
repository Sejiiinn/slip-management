package sejin.slipmanagement.dto;

import lombok.Data;

@Data
public class SpendDTO {
    private String spendName;
    private String spendPlace;
    private int spendCount;
    private int spendAmount;

    private MemberDTO memberDTO;
    private SlipDTO slipDTO;
    private HistoryDTO historyDTO;
}
