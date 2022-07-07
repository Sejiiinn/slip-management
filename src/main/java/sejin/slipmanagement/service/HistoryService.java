package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejin.slipmanagement.controller.HistoryDTO;
import sejin.slipmanagement.repository.HistoryDAO;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HistoryService {

    private final HistoryDAO historyDAO;

    public List<HistoryDTO> findHistories() {
        return historyDAO.findAll();
    }
}
