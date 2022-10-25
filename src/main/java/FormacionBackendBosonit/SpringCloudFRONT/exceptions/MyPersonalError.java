package FormacionBackendBosonit.SpringCloudFRONT.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class MyPersonalError extends RuntimeException{

    Date timeStamp;
    int httpCode;

    public MyPersonalError(String message, int httpCode){
        super(message);
        setTimeStamp(new Date());
        setHttpCode(httpCode);
    }
}