package mapinterface.policy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
class Policy{
    String policy_number;
    String name_holder;
    Date expiry_date;
    String coverage_type;
    Double amount;
    Policy(String policy_number, String name_holder, Date expiry_date, String coverage_type, Double amount){
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

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
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
    static Date expiry_date;
    static String coverage_type;
    static Double amount;
    static ArrayList<Policy> policies=new ArrayList<>();
    static HashMap<String,Policy> policies_hashmap=new HashMap<>();
    static LinkedHashMap<String,Policy> policies_linkedhashmap=new LinkedHashMap<>();
    static TreeMap<Policy,Date> policies_treemap=new TreeMap<>();

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

                    expiry_date=new SimpleDateFormat("dd/MM/yyyy").parse(expiry_date_string);
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
                    Calendar calendar = Calendar.getInstance();
                    Date today = calendar.getTime();
                    calendar.add(Calendar.DAY_OF_YEAR, 30);
                    Date thirtyDaysFromNow = calendar.getTime();
                    List<Policy> expiringPolicies=new ArrayList<>();
                    for (Policy policy : policies) {
                        Date expiryDate = policy.getExpiry_date();
                        if (!expiryDate.before(today) && !expiryDate.after(thirtyDaysFromNow)) {
                            expiringPolicies.add(policy);
                        }
                    }
                    System.out.println(expiringPolicies);
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
                    Calendar calendar_delete = Calendar.getInstance();
                    Date today_now = calendar_delete.getTime();
                    calendar_delete.add(Calendar.DAY_OF_YEAR, 30);
                    Date thirtyDaysFromNowdelete = calendar_delete.getTime();
                    List<Policy> expiringPolicies_delete=new ArrayList<>();
                    for (Policy policy : policies) {
                        Date expiryDate = policy.getExpiry_date();
                        if (!expiryDate.before(today_now) && !expiryDate.after(thirtyDaysFromNowdelete)) {
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
