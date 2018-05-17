import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCodeSubdomaInVisitCount {
    public static void main(String[] args) {

    }

    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> domainUsage = new HashMap<>();

        for (String domain:cpdomains) {

            String [] usageAndDomain = domain.split("\\s+");

            int usage = Integer.parseInt(usageAndDomain[0]);

            while (usageAndDomain[1].length() != 0){

                domainUsage.put(usageAndDomain[1], domainUsage.getOrDefault(usageAndDomain[1], 0) + usage);

                int index = usageAndDomain[1].indexOf(".");
                if (index != -1) {
                    usageAndDomain[1] = usageAndDomain[1].substring(index + 1);
                }else{
                    usageAndDomain[1] = "";
                }
            }
        }
        ArrayList<String> usage = new ArrayList<>(domainUsage.size());

        for (Map.Entry<String, Integer> entry: domainUsage.entrySet()){
            usage.add(entry.getValue() + " " + entry.getKey());
        }

        return  usage;
    }
}
