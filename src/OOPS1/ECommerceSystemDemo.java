package OOPS1;
import java.util.*;

public class ECommerceSystemDemo {
    public static void main(String[] args) {

    }
}
/*
=======PRODUCT CLASS===========
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
