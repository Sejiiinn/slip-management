package sejin.slipmanagement.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class SpendDTO {
    private Date spendDate;
    private String spendName;
    private String spendPlace;
    private int spendCount;
    private int spendAmount;

    private MemberDTO memberDTO;
    private SlipDTO slipDTO;
    private HistoryDTO historyDTO;
}
