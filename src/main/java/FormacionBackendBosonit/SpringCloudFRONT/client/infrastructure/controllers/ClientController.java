package FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.controllers;

import FormacionBackendBosonit.SpringCloudFRONT.client.application.ServiceClient;
import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.GetClientInputDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("client")
@RestController
@Slf4j
public class ClientController {


    @Autowired
    ServiceClient serviceClient;


    @PostMapping
    ClientOutputDTO createClient(@RequestBody ClientInputDTO clientInputDTO) throws Exception{

        return serviceClient.createClient(clientInputDTO);
    }


    @GetMapping("get")
    ClientOutputDTO getClient(@RequestBody GetClientInputDTO getClientInputDTO) throws Exception {

        return serviceClient.getClient(getClientInputDTO.getIdClient());
    }

    @PutMapping("update/{id}")
    ClientOutputDTO updateClient(@RequestBody ClientInputDTO clientInputDTO, @PathVariable int id) throws Exception {
        return serviceClient.updateClient(clientInputDTO, id);
    }

    @DeleteMapping("delete/{id}")
    String deleteClient(@PathVariable int id) throws Exception{

        return serviceClient.deleteClient(id);
    }

    @GetMapping("getAll")
    List<Client> findAll()throws Exception {
        return serviceClient.findAll();
    }


}

