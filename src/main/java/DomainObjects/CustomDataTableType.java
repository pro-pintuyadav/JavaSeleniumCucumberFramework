package DomainObjects;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {

    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String, String> entry) {
        return new BillingDetails(
            entry.get("billingFirstName"),
            entry.get("billingLastName"),
            entry.get("billingAddressOne"),
            entry.get("billingCity"),
            entry.get("billingState"),
            entry.get("billingEmail")
        );
    }
}
