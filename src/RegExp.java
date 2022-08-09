import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   *
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    String IpAddress = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.){3}(25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)";
    Pattern pattern = Pattern.compile(IpAddress);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      return matcher.group();
    }
    return "";
  }
}