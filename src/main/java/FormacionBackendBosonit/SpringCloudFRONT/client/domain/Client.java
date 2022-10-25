package FormacionBackendBosonit.SpringCloudFRONT.client.domain;


import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientInputDTO;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Client {

    private Integer idClient;
    private String name;
    private String surname;
    private Integer age;
    private String email;
    private String telf;

    public void createClient(ClientInputDTO clientInputDTO) {

        this.name = clientInputDTO.getName();
        this.surname = clientInputDTO.getSurname();
        this.age = clientInputDTO.getAge();
        this.email = clientInputDTO.getEmail();
        this.telf = clientInputDTO.getTelf();
    }
}
