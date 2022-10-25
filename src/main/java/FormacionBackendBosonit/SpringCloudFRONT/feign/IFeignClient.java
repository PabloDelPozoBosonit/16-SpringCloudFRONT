package FormacionBackendBosonit.SpringCloudFRONT.feign;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "feignClient", url = "http://localhost:8080/client")
public interface IFeignClient {

    @PostMapping
    ClientOutputDTO callClientPostController(@RequestBody ClientInputDTO clientInputDTO) throws Exception;

    @GetMapping("get/{id}")
    ClientOutputDTO callClientGetController(@PathVariable int id)throws Exception;

    @PutMapping("update/{id}")
    ClientOutputDTO callClientPutController(@RequestBody ClientInputDTO clientInputDTO, @PathVariable int id)throws Exception;

    @DeleteMapping("delete/{id}")
    String callClientDeleteController(@PathVariable int id)throws Exception;

    @GetMapping("getAll")
    List<Client>callAllClientController()throws Exception;

}
