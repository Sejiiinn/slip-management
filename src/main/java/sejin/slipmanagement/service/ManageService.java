package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejin.slipmanagement.controller.ManagementDTO;
import sejin.slipmanagement.repository.ManagementDAO;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ManageService {

    private final ManagementDAO memberSlipDAO;

    public List<ManagementDTO> searchAll() {

        return memberSlipDAO.findAll();
    }
}
