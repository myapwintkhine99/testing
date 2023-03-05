package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
    public static void main(String[]args)

{
  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
  User user=context.getBean("user",User.class);
  user.setUsername("Kyaw Kyaw");
  User user1=context.getBean("user",User.class);
  user1.setUsername("Mg Mg");
   System.out.println(user.getUsername());
   System.out.println(user1.getUsername());
}
}