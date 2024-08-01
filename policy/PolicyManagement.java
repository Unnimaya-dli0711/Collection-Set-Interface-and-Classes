package policy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
class Policy{
    String policy_number;
    String name_holder;
    LocalDate expiry_date;
    String coverage_type;
    Double amount;
    Policy(String policy_number, String name_holder, LocalDate expiry_date, String coverage_type, Double amount){
        this.policy_number=policy_number;
        this.amount=amount;
        this.coverage_type=coverage_type;
        this.name_holder=name_holder;
        this.expiry_date=expiry_date;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public String getName_holder() {
        return name_holder;
    }

    public void setName_holder(String name_holder) {
        this.name_holder = name_holder;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getCoverage_type() {
        return coverage_type;
    }

    public void setCoverage_type(String coverage_type) {
        this.coverage_type = coverage_type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
public class PolicyManagement {
    static String policy_number;
    static String name_holder;
    static LocalDate expiry_date;
    static String coverage_type;
    static Double amount;
    static ArrayList<Policy> policies=new ArrayList<>();
    static HashMap<String,Policy> policies_hashmap=new HashMap<>();
    static LinkedHashMap<String,Policy> policies_linkedhashmap=new LinkedHashMap<>();
    static TreeMap<Policy,LocalDate> policies_treemap=new TreeMap<>();

    public static void main(String[] args) throws ParseException {
        int choice;
        do{
            System.out.println("Enter the choice");
            System.out.println("1.Add new policy");
            System.out.println("2.Get policy by number");
            System.out.println("3.Get Policies expiring soon");
            System.out.println("4.Get policy for policy holder");
            System.out.println("5.Remove Policies that expired");
            System.out.println("6.Exit");
            Scanner scannerobject=new Scanner(System.in);
            choice=scannerobject.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the details of new policy");
                    System.out.println("Name of Policy holder");
                    scannerobject.nextLine();
                    name_holder=scannerobject.nextLine();
                    System.out.println("Name of Policy number");
                    policy_number=scannerobject.next();
                    System.out.println("Type of coverage");
                    coverage_type=scannerobject.next();
                    System.out.println("Amount");
                    amount=scannerobject.nextDouble();
                    System.out.println("Expiry Date");
                    String expiry_date_string=scannerobject.next();

                    expiry_date= LocalDate.parse(expiry_date_string);;
                    Policy policyobject=new Policy(policy_number,name_holder,expiry_date,coverage_type,amount);
                    policies.add(policyobject);
                    policies_hashmap.put(policy_number,policyobject);
                    policies_treemap.put(policyobject,expiry_date);
                    policies_linkedhashmap.put(policy_number,policyobject);
                    System.out.println(policies);
                    break;
                case 2:
                    System.out.println("Policy by policy number");
                    System.out.println("Enter policy number");
                    String find_policy=scannerobject.next();
                    System.out.println(policies_hashmap.get(find_policy));
                    break;
                case 3:
                    System.out.println("Expiring in 30 days");
                    Set<Policy>expiring=new HashSet<>();
                    LocalDate today = LocalDate.now();
                    LocalDate thirtyDaysFromNow = today.plusDays(30);
                    for (Policy policy : policies) {
                        LocalDate expiryDate = policy.getExpiry_date();
                        if (!expiryDate.isBefore(today) && !expiryDate.isAfter(thirtyDaysFromNow)) {
                            expiring.add(policy);
                        }
                    }
                    System.out.println(expiring);
                    break;
                case 4:
                    System.out.println("Policies for specific policy holder");
                    System.out.println("Enter name");
                    String name=scannerobject.next();
                    for(int i=0;i<policies.size();i++){
                        if(name.equals(policies.get(i).name_holder)){
                            System.out.println(policies.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Deleting Expired policies");
                    List<Policy> expiringPolicies_delete=new ArrayList<>();
                    LocalDate today_now = LocalDate.now();
                    LocalDate thirtyDaysFromToday = today_now.plusDays(30);
                    for (Policy policy : policies) {
                        LocalDate expiryDate = policy.getExpiry_date();
                        if (!expiryDate.isBefore(today_now) && !expiryDate.isAfter(thirtyDaysFromToday)) {
                            expiringPolicies_delete.add(policy);
                        }
                    }
                    System.out.println(expiringPolicies_delete);
                    List<Policy> new_policy=new ArrayList<>();
                    for(Policy i:policies){
                        if(!expiringPolicies_delete.contains(i)){
                            new_policy.add(i);
                        }
                    }
                    System.out.println(new_policy);
                    break;

                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid ");

            }

        }while (choice<6);
    }
}
