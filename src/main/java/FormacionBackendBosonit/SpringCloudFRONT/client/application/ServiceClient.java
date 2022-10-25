package FormacionBackendBosonit.SpringCloudFRONT.client.application;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientOutputDTO;

import java.util.List;


public interface ServiceClient {


    ClientOutputDTO createClient(ClientInputDTO clientInputDTO) throws Exception;
    ClientOutputDTO getClient(int id) throws Exception;
    ClientOutputDTO updateClient(ClientInputDTO clientInputDTO, int id) throws Exception;
    String deleteClient(int id) throws Exception;
    List<Client>findAll() throws Exception;

}
