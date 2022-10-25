package FormacionBackendBosonit.SpringCloudFRONT.feign;

import FormacionBackendBosonit.SpringCloudFRONT.ticket.infrastructure.dtos.TicketOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.domain.Trip;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "feignTrip", url = "http://localhost:8080/trip")
public interface IFeignTrip {

    @PostMapping
    TripOutputDTO createTrip(@RequestBody TripInputDTO tripInputDTO) throws Exception;

    @GetMapping("get/{id}")
    TripOutputDTO getTrip(@PathVariable Integer id) throws Exception;

    @PutMapping("update/{id}")
    TripOutputDTO updateTrip(@RequestBody TripInputDTO tripInputDTO, @PathVariable int id) throws Exception;

    @DeleteMapping("delete/{id}")
    String deleteTrip(@PathVariable int id) throws Exception;

    @GetMapping("getAll")
    List<Trip> getAllTrips() throws Exception;

    @PostMapping("addPassenger/{idTrip}/{idPassenger}")
    public TicketOutputDTO addPassenger(@PathVariable Integer idTrip, @PathVariable Integer idPassenger) throws Exception;

    @GetMapping("count/{idTrip}")
    public String countPassengers(@PathVariable Integer idTrip) throws Exception;

    @PostMapping("changeStatus/{idTrip}/{status}")
    public TripOutputDTO changeStatus(@PathVariable Integer idTrip,@PathVariable boolean status) throws Exception;

    @GetMapping("getStatus/{tripId}")
    public String getStatus(@PathVariable Integer tripId) throws Exception;
}
