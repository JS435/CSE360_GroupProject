
public class messageClass {

  String messageSender;
  String messageRecipient;
  String messageContents;
  
  messageClass(String senderName, String receiveName, String message)
  {
    messageSender = senderName;
    messageRecipient = receiveName;
    messageContents = message;
  }
  
  public String getMessageSender()
  {
    return messageSender;
  }
  
  public String getMessageRecipient()
  {
    return messageRecipient;
  }
  
  public String getMessageContents()
  {
    return messageContents;
  }
  
  public void setMessageSender()
  {
    messageSender = senderName;
  }
  
  public void setMessageRecipient()
  {
    messageRecipient = receiveName;
  }
  
  public void setMessageContents()
  {
    messageContents = message;
  }
}
