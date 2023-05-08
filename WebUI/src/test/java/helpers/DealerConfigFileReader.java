package helpers;

import java.util.Properties;

public class DealerConfigFileReader {

    private Properties prop = null;

    public DealerConfigFileReader(String environment) {
        prop = new Properties();
        try {
            prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/" + environment + ".properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAgentUserName(String dealer, String agent) {
        return null;
    }

    public String getAgentPassword(String dealer, String agent) {
        return null;
    }

    public String getDealerID(String dealer) {
        return null;
    }

    public String getDealerName(String dealer, String customer) {
        return null;
    }


}
