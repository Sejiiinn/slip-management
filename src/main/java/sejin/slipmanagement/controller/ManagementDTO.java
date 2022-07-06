package sejin.slipmanagement.controller;

import lombok.Data;

import java.util.List;

@Data
public class ManagementDTO {
     private List<MemberDTO> memberDTO;
     private List<SlipDTO> slipDTO;
}
