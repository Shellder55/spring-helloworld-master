import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanAgain =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCatAgain = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        if (bean.equals(beanAgain)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (beanCat.equals(beanCatAgain)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}