package lunaricosRP.service;

import lunaricosRP.dto.servidorOnlineDTO;
import lunaricosRP.models.servidorOnline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lunaricosRP.repository.servidorOnlineRepository;

import java.util.List;

@Service
public class servidorService {

    @Autowired
    private servidorOnlineRepository serverRepository;

    public servidorOnline create(servidorOnlineDTO servidorDTO) {
        servidorOnline server = servidorDTO.doToEntity();
        return serverRepository.save(server);
    }
    public void reciclagem(){
        serverRepository.deleteAll();
    }

    public List<servidorOnline> findAll() {
        return serverRepository.findAll();
    }
}
