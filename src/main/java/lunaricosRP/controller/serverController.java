package lunaricosRP.controller;

import lunaricosRP.dto.servidorOnlineDTO;
import lunaricosRP.models.servidorOnline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import lunaricosRP.service.servidorService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cadastrar")
public class serverController {

    @Autowired
    private servidorService servidor;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public servidorOnline cadastrar(@RequestBody servidorOnlineDTO serverDTO){
        servidor.reciclagem();
        return servidor.create(serverDTO);
    }

    @GetMapping
    public List<servidorOnline> cadastrarGetAll(){

        return servidor.findAll();
    }



}
