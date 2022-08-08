import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat firstBean = (Cat) applicationContext.getBean("cat");
        System.out.println(firstBean.getName());

        Cat secondBean = (Cat) applicationContext.getBean("cat");
        System.out.println(secondBean.getName());

        System.out.println(bean == bean2);
        System.out.println(firstBean == secondBean);

    }
}