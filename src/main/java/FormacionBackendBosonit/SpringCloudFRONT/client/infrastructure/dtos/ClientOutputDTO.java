package FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ClientOutputDTO   {

    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String email;
    private String telf;

    public ClientOutputDTO(Client client) {

        this.id = client.getIdClient();
        this.name = client.getName();
        this.surname = client.getSurname();
        this.age = client.getAge();
        this.email = client.getEmail();
        this.telf = client.getTelf();
    }
}
