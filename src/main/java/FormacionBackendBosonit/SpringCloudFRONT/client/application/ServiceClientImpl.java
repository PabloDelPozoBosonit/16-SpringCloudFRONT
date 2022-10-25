package FormacionBackendBosonit.SpringCloudFRONT.client.application;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.feign.IFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    IFeignClient iFeignClient;

    @Override
    public ClientOutputDTO createClient(ClientInputDTO clientInputDTO) throws Exception{

            return iFeignClient.callClientPostController(clientInputDTO);

    }

    @Override
    public ClientOutputDTO getClient(int id) throws Exception {

            return iFeignClient.callClientGetController(id);

    }

    @Override
    public ClientOutputDTO updateClient(ClientInputDTO clientInputDTO, int id) throws Exception {

        return iFeignClient.callClientPutController(clientInputDTO, id);
    }

    @Override
    public String deleteClient(int id) throws Exception {

            return iFeignClient.callClientDeleteController(id);



    }

    @Override
    public List<Client> findAll() throws Exception {

            return iFeignClient.callAllClientController();

    }
}
