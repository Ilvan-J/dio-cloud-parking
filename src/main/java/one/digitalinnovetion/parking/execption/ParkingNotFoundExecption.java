package one.digitalinnovetion.parking.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotFoundExecption extends RuntimeException {

    public ParkingNotFoundExecption(String id) {
        super("Parking not found with Id: " + id);
    }
}
