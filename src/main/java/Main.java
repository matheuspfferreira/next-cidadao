import br.com.demo.models.AnonymousServiceRequestModel;
import br.com.demo.models.IdentifiedServiceRequestModel;
import br.com.demo.models.ServiceHistoryModel;
import br.com.demo.models.enums.ServiceCategory;
import br.com.demo.models.enums.ServicePriority;
import br.com.demo.models.interfaces.ServiceRequestType;
import br.com.demo.services.ServiceRequestService;

public class Main {
    public static void main(String[] args) {
        ServiceRequestType serviceRequestType = new IdentifiedServiceRequestModel(
                1,
                "Asistência médica na escola municipal",
                ServiceCategory.HEALTH,
                ServicePriority.LOW,
                "Paranavaí-PR"
        );

        System.out.println("Autenticação concluída: " + ServiceRequestService.sendServiceRequest(serviceRequestType));

    }
}
