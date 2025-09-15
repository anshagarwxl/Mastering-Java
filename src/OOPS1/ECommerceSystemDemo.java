package OOPS1;
import java.util.*;
import java.time.LocalDateTime;

public class ECommerceSystemDemo {
    public static void main(String[] args) {

    }
}
/*
=======PRODUCT CLASS============
*/
final class Product{
    //private final fields: productId, name, category, manufacturer, basePrice, weight, features[], specifications(Map)
    private final String productId;
    private final String name;
    private final String category;
    private final String manufacturer;
    private final double basePrice;
    private final double weight;
    private final String[] features;
    private final Map<String, String> specifications;


    //Private Constructors to force factory settings
    private Product(String productId, String name, String category, String manufacturer,
                    double basePrice, double weight, String[] features, Map<String, String> specifications){
        this.productId = Objects.requireNonNull(productId);
        this.name = Objects.requireNonNull(name);
        this.category = Objects.requireNonNull(category);
        this.manufacturer = Objects.requireNonNull(manufacturer);
        this.basePrice = basePrice;
        this.weight = weight;
        this.features = features == null ? new String[0] : Arrays.copyOf(features, features.length);
        this.specifications = specifications == null ? new HashMap<>() : new HashMap<>(specifications);
    }
    //Factory methods:
    public static Product createElectronics(String productId, String name, String category, String manufacturer,
                                            double basePrice, double weight, String[] features, Map<String, String> specifications) {
        return new Product(productId, name, category, manufacturer, basePrice, weight, features, specifications);
    }

    public static Product createClothing(String productId, String name, String category, String manufacturer,
                                         double basePrice, double weight, String[] features, Map<String, String> specifications) {
        return new Product(productId, name, category, manufacturer, basePrice, weight, features, specifications);
    }

    public static Product createBooks(String productId, String name, String category, String manufacturer,
                                     double basePrice, double weight, String[] features, Map<String, String> specifications) {
        return new Product (productId, name, category, manufacturer, basePrice, weight, features, specifications);
    }

    //Getter methods with defensive copying wherever needed:
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getManufacturer() { return manufacturer; }
    public double getBasePrice() { return basePrice; }
    public double getWeight() { return weight; }
    public String[] getFeatures() {
        return Arrays.copyOf(features, features.length);
    }
    public Map<String, String> getSpecifications() {
        return new HashMap<>(specifications);
    }

    //business methods that should not get overridden
    public final double calculateTax(String region) {
        switch (region == null ? "" : region.toUpperCase(Locale.ROOT)) {
            // if region is null -> no tax
            // region.toUpperCase -> let's 'in' 'In' or 'IN' all be readable as 'IN'
            case "IN": return basePrice * 0.18; // 18%
            case "US": return basePrice * 0.07; // 7%
            case "EU": return basePrice * 0.20; // 20%
            default: return basePrice * 0.10; // default 10%
        }
    }
}

/*
===========CUSTOMER CLASS=================
 */

class Customer {
    //        * private final fields: customerId, email, accountCreationDate
    //        * Editable fields: name, phoneNumber, preferredLanguage
    private final String customerId;
    private final String email;
    private final String accountCreationDate;
    private String name;
    private String phoneNumber;
    private String preferredLanguage;

    //        * package-private getCreditRating() for internal use
    //        * public getPublicProfile() to return safe data for reviews/ratings

    int creditRating = 999; //only visible inside this package

    //CONSTRUCTOR
    public Customer(String customerId, String email, String name, String phoneNumber, String preferredLanguage) {
        this.customerId = Objects.requireNonNull(customerId);
        this.email = Objects.requireNonNull(email);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.preferredLanguage = preferredLanguage;
        this.accountCreationDate = LocalDateTime.now().toString();
    }

    //PERMANENT INFO GETTERS
    public String getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    //MODIFIABLE DATA USING SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    int getCreditRating() {
        return creditRating;
    }

//* public getPublicProfile() to return safe data for reviews/ratings

    public Map<String, String> getPublicProfile() { // example : {customerId=C101, name=John Doe, preferredLanguage=en}
        Map<String, String> map = new HashMap<>(); //Creates a new empty HashMap (a type of Map that stores key-value pairs).
        map.put("customerId:", customerId); // Adds the customerId of this customer into the map.
        map.put("name", name == null ? "Anonymous :" : name); // If name is null, put "Anonymous" as the value | Otherwise, put the actual name
        map.put("preferred language = ", preferredLanguage == null ? "en " : preferredLanguage); //If no language is set (null), default to "en" (English) | Otherwise, use the actual preferredLanguage.
        return map;
    }

}

// to be continued.......